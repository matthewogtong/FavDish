package com.matthewogtong.favdish.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.matthewogtong.favdish.R
import com.matthewogtong.favdish.databinding.ActivityAddUpdateDishBinding

class AddUpdateDishActivity : AppCompatActivity() {

    // Create a global variable for layout ViewBinding
    private lateinit var mBinding: ActivityAddUpdateDishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the layout ViewBinding variable and set the contentView.
        mBinding = ActivityAddUpdateDishBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        // Call the method of setupActionBar
        setupActionBar()
    }

    // Create a function to setup the ActionBar
    private fun setupActionBar() {
        setSupportActionBar(mBinding.toolbarAddDishActivity)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        mBinding.toolbarAddDishActivity.setNavigationOnClickListener { onBackPressed() }
    }
}