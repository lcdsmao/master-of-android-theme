package com.konifar.moat

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.konifar.moat.databinding.ComponentsActivityBinding

class ComponentsActivity : AppCompatActivity() {

    companion object {
        fun createIntent(activity: Activity): Intent =
            Intent(activity, ComponentsActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ComponentsActivityBinding>(
            this,
            R.layout.components_activity
        )

        binding.toolbar.apply {
            inflateMenu(R.menu.components_menu)
            setNavigationOnClickListener {
                finish()
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}