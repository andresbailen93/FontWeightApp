package es.andresbailen.fontweightapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.TypedValue
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.view.children
import es.andresbailen.fontweightapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                //TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                //TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                if (s?.isBlank() == true) {
                    setText("Introduce un texto Please")
                } else {
                    setText(s?.toString() ?: "Inserta un texto")
                }
            }
        })

        binding.btnMore.setOnClickListener {
            var textSize = binding.txtIndicator.text?.toString()?.toFloat() ?: 14f
            textSize += 1
            setTextSize(textSize)
            binding.txtIndicator.text = textSize.toString()
        }

        binding.btnLess.setOnClickListener {
            var textSize = binding.txtIndicator.text?.toString()?.toFloat() ?: 14f
            if (textSize > 1f) {
                textSize -= 1
                setTextSize(textSize)
                binding.txtIndicator.text = textSize.toString()
            }
        }

    }

    private fun setText(text: String) {
        binding.linearLayout.children.forEach {
            if (it is AppCompatTextView) {
                it.text = text
            }
        }
    }

    private fun setTextSize(size: Float) {
        binding.linearLayout.children.forEach {
            if (it is AppCompatTextView) {
                it.setTextSize(TypedValue.COMPLEX_UNIT_DIP, size)
            }
        }
    }
}