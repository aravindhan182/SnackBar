package com.example.snackbarexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
                Snackbar.make(it,"Simple SnackBar",Snackbar.LENGTH_LONG)
                    .setAction(R.string.action,object :View.OnClickListener{
                        override fun onClick(v: View?) {
                       Snackbar.make(it,"replace",Snackbar.LENGTH_SHORT).show()
                        }
                    })
                    .setActionTextColor(Color.RED)
                    .setBackgroundTint(Color.BLUE)

               .show()
        }
    }
}