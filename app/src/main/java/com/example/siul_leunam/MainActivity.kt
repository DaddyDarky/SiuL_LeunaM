package com.example.siul_leunam

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SyncContext
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
        val imageView: ImageView = findViewById(R.id.img_login)
        val imageURL = "https://images.unsplash.com/photo-1695068276999-45f7079df317?q=80&w=928&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        val options = RequestOptions()
        .placeholder(R.drawable.placeholder) // Imagen de marcador de posición mientras carga
        .error(R.drawable.error) // Imagen a mostrar en caso de error
        .diskCacheStrategy(DiskCacheStrategy.ALL) // Estrategia de almacenamiento en caché
        // Cargar la imagen con Glide
        Glide.with(this)
        .load(imageURL)
        .apply(options) // Aplicar las opciones de configuración
        .into(imageView) // Reemplaza "imageView" con el ID real de tu ImageView
         */
        val correoEditText = findViewById<EditText>(R.id.edit_correo)
        val contraseñaEditText = findViewById<EditText>(R.id.edit_contraseña)
        val buttonConectarse = findViewById<Button>(R.id.button)
        val buttonRegistrarse = findViewById<Button>(R.id.button2)

        /*
        fun monstrarMensaje(){
            val miClasses = miClasses()
            miClasses.monstrarError(this,"Illo has metio mal el codigo");
        }
        */


        buttonConectarse.setOnClickListener {
            val correo = correoEditText.text.toString()
            val contraseña = contraseñaEditText.text.toString()

            // Verificar las credenciales
            if (correo == "meMeo@luis.com" && contraseña == "MeVengo") {
                // Credenciales correctas, iniciar la nueva actividad
                val intent = Intent(this, barajas::class.java)
                startActivity(intent)
            } else {
                /*
                fun monstrarError(context: Context, mensaje: String){
                    Toast.makeText(context,mensaje,Toast.LENGTH_SHORT).show()
                }
                 */

            }
        }

        buttonRegistrarse.setOnClickListener {
            // Acción para el botón de registrarse
            val intent = Intent(this, registro::class.java)
            startActivity(intent)
        }

    }
}