package com.example.practica1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practica1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerPersonas)
        recyclerview.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Alumno>()
        for (i in 1  ..  50){
            data.add(Alumno(
                "Jazmin Rodriguez Jimenez",
                "20206919",
                "jrodriguez182@ucol.mx",
                R.drawable.gato))
        }
        val adapter = AlumnoAdapter(this, data)
        recyclerview.adapter = adapter
    }
}