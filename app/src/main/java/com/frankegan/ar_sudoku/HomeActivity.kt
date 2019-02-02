package com.frankegan.ar_sudoku

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.transaction
import com.example.android.camera2basic.HomeFragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        supportFragmentManager.transaction {
            replace(R.id.home_content, HomeFragment.newInstance())
        }
    }
}
