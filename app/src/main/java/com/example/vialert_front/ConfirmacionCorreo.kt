package com.example.vialert_front

import androidx.appcompat.app.AppCompatActivity
import com.example.vialert_front.databinding.ActivityConfirmacionCorreoBinding
import android.os.Bundle
import kotlin.random.Random

class ConfirmacionCorreo : AppCompatActivity() {
    lateinit var binding: ActivityConfirmacionCorreoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacion_correo)

        val codigo = codigo().toString()
        binding.TxtConfirmacion.setText(codigo)

    }

    private fun codigo():Int{
        var randomNumber:Int
        randomNumber= Random.nextInt(100000,999999)
        return randomNumber
    }
}