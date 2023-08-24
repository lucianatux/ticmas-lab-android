package com.curso.android.app.practica.comparison.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.curso.android.app.practica.comparison.R


class MainActivity : AppCompatActivity() {

    // Instancia del ViewModel
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Observar los LiveData y actualizar las vistas cuando cambian
        viewModel.text1.observe(this, Observer { newText ->
            // Actualizar tu EditText para text1
            // Por ejemplo: editText1.setText(newText)
        })

        viewModel.text2.observe(this, Observer { newText ->
            // Actualizar tu EditText para text2
            // Por ejemplo: editText2.setText(newText)
        })

        viewModel.result.observe(this, Observer { newResult ->
            // Actualizar tu TextView para result
            // Por ejemplo: resultTextView.text = newResult
        })

        // Configurar el clic del botón
        val compareButton = findViewById<Button>(R.id.compareButton)
        compareButton.setOnClickListener {
            viewModel.compareTexts() // Llamar al método en el ViewModel
        }
    }
}

