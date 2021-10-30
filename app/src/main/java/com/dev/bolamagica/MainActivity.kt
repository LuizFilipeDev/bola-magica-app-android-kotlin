package com.dev.bolamagica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val resposta = arrayOf("Sim", "Não", "Talvez", "Tudo aponta para sim",
                           "Não posso prever agora", "Não conte com isso",
                           "É melhor eu não te contar agora", "As perspectivas não são boas")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.botaoEnviar)
        val textoPergunta = findViewById<EditText>(R.id.textoPergunta)
        val textoResultado = findViewById<TextView>(R.id.textoResultado)
        var numeroRandomico: Int

        botao.setOnClickListener{

            numeroRandomico = Random.Default.nextInt(until = 8)

            if(textoPergunta.text.isNotEmpty())
            {
                textoResultado.text = resposta[numeroRandomico]
            }
            else
            {
                textoResultado.text = ""
                textoPergunta.hint = "Faça a sua pergunta"
            }
        }
    }
}