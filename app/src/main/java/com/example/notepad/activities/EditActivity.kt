package com.example.notepad.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.notepad.R
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity: AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_edit)

    setSupportActionBar(toolbar)
    supportActionBar?.title = "Edit Notepad"
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
  }

  override fun onOptionsItemSelected(item: MenuItem?): Boolean {
    return when (item?.itemId) {
      android.R.id.home -> { // Used to identify when the user has clicked the back button
        finish()
        true
      }
      else -> super.onOptionsItemSelected(item)
    }
  }
}
