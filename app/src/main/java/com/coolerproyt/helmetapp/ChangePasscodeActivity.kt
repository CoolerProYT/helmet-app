package com.coolerproyt.helmetapp

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat

class ChangePasscodeActivity : ComponentActivity() {
    private lateinit var editTextPasscode: EditText
    private lateinit var digitViews: List<TextView>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.change_passcode)

        val backIconImageView: ImageView = findViewById(R.id.backIconImageView)
        backIconImageView.setImageResource(R.drawable.back)

        backIconImageView.setOnClickListener {
            super.onBackPressed()
        }

        editTextPasscode = findViewById(R.id.editTextPasscode)
        digitViews = listOf(
            findViewById(R.id.digit1),
            findViewById(R.id.digit2),
            findViewById(R.id.digit3),
            findViewById(R.id.digit4),
            findViewById(R.id.digit5),
            findViewById(R.id.digit6)
        )

        editTextPasscode.requestFocus()

        digitViews.forEach { textView ->
            textView.setOnClickListener {
                editTextPasscode.requestFocus()

                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.showSoftInput(editTextPasscode, InputMethodManager.SHOW_IMPLICIT)
            }
        }

        editTextPasscode.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val length = s?.length ?: 0
                updateDigitViews(length)
                if (length == 6) {
                    backToSettings()
                }
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun updateDigitViews(length: Int) {
        for (i in digitViews.indices) {
            if (i < length) {
                digitViews[i].background = ContextCompat.getDrawable(this, R.drawable.circle_filled)
            } else {
                digitViews[i].background = ContextCompat.getDrawable(this, R.drawable.circle_empty)
            }
        }
    }

    private fun backToSettings(){
        super.onBackPressed()
    }
}