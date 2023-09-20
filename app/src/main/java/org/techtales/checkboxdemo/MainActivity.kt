package org.techtales.checkboxdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.techtales.checkboxdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            var message:String = ""
            if (binding.checkBox.isChecked){
                message = "Eating is selected"
            }

            if (binding.checkBox.isChecked){
                message = "Playing is selected"
            }

            if (binding.checkBox.isChecked){
                message = "Sleeping is selected"
            }

            if (binding.checkBox.isChecked){
                message = "Reading is selected"
            }
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
        }
    }
}