package com.example.appuser

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val txtMensagem = findViewById<TextView>(R.id.txt_mensagem)
        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val edtIdade = findViewById<EditText>(R.id.edt_idade)
        val btnEntrar = findViewById<Button>(R.id.btn_entrar)
        btnEntrar.setOnClickListener {
            val nome = edtNome.text.toString()
            val idade = edtIdade.text.toString()
            if(nome.equals("Amanda", true)
                && idade.equals("18")){
                Toast.makeText(this,"Bem Vinda!",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Verifique Login!",Toast.LENGTH_SHORT).show()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}