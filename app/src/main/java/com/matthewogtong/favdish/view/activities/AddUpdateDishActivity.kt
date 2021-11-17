package com.matthewogtong.favdish.view.activities

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.matthewogtong.favdish.R
import com.matthewogtong.favdish.databinding.ActivityAddUpdateDishBinding
import com.matthewogtong.favdish.databinding.DialogCustomImageSelectionBinding

// Implement the View.OnClickListener

class AddUpdateDishActivity : AppCompatActivity(), View.OnClickListener {

    // Create a global variable for layout ViewBinding
    private lateinit var mBinding: ActivityAddUpdateDishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the layout ViewBinding variable and set the contentView.
        mBinding = ActivityAddUpdateDishBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        // Call the method of setupActionBar
        setupActionBar()

        // Assign the click event to the image button.
        mBinding.ivAddDishImage.setOnClickListener(this@AddUpdateDishActivity)
    }

    // Override the onclick listener method.
    override fun onClick(v: View) {

        // Perform the action when user clicks on the addDishImage and show Toast message for now.
        when (v.id) {

            R.id.iv_add_dish_image -> {

                customImageSelectionDialog()

                return
            }
        }
    }

    // Create a function to setup the ActionBar
    private fun setupActionBar() {
        setSupportActionBar(mBinding.toolbarAddDishActivity)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Replace the back button that we have generated.
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_arrow_back)

        mBinding.toolbarAddDishActivity.setNavigationOnClickListener { onBackPressed() }
    }

    // Create a function to launch the custom dialog.
    /**
     * A function to launch the custom image selection dialog.
     */
    private fun customImageSelectionDialog() {
        val dialog = Dialog(this@AddUpdateDishActivity)

        val binding: DialogCustomImageSelectionBinding = DialogCustomImageSelectionBinding.inflate(layoutInflater)

        /*Set the screen content from a layout resource.
        The resource will be inflated, adding all top-level views to the screen.*/
        dialog.setContentView(binding.root)

        // Assign the click for Camera and Gallery. Show the Toast message for now.
        binding.tvCamera.setOnClickListener {
            Toast.makeText(this@AddUpdateDishActivity, "You have clicked on the Camera.", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        binding.tvGallery.setOnClickListener {
            Toast.makeText(this@AddUpdateDishActivity, "You have clicked on the Gallery.", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        //Start the dialog and display it on screen.
        dialog.show()
    }
}