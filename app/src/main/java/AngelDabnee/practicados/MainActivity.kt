package AngelDabnee.practicados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nombreCompleto = findViewById<TextView>(R.id.text_nombre_completo)
        val matricula = findViewById<TextView>(R.id.text_matricula)
        val grupo = findViewById<TextView>(R.id.text_grupo_nombre)
        val promedio = 8
        val buttonPromedio = findViewById<Button>(R.id.button_promedio)
        val buttonResumen = findViewById<Button>(R.id.button_resumen)

        buttonResumen.setOnClickListener{
            Toast.makeText(this,"" + matricula.text + " " + nombreCompleto.text + " " + grupo.text,Toast.LENGTH_SHORT).show()
        }
        buttonPromedio.setOnClickListener{
            Toast.makeText(this,promedio.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}