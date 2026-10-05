package com.upb.libreria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.upb.libreria.model.Autor
import com.upb.libreria.model.Categoria
import com.upb.libreria.model.Libro
import com.upb.libreria.ui.screens.AutoresScreen
import com.upb.libreria.ui.screens.LibrosScreen
import com.upb.libreria.ui.theme.LibreriaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            LibreriaAppTheme {
                LibreriaApp()
            }
        }
    }
}

@Composable
fun LibreriaApp() {

    val autor1 = Autor(
        id = 1,
        nombre = "Gabriel Garcia Marquez",
        nacionalidad = "Colombiana"
    )

    val autor2 = Autor(
        id = 2,
        nombre = "George Orwell",
        nacionalidad = "Britanica"
    )

    val autor3 = Autor(
        id = 3,
        nombre = "Antoine de Saint-Exupery",
        nacionalidad = "Francesa"
    )

    val categoria1 = Categoria(
        id = 1,
        nombre = "Novela",
        descripcion = "Libros de narrativa"
    )

    val categoria2 = Categoria(
        id = 2,
        nombre = "Clasico",
        descripcion = "Libros clasicos"
    )

    val autores = listOf(
        autor1,
        autor2,
        autor3
    )

    val libros = listOf(
        Libro(
            id = 1,
            titulo = "Cien años de soledad",
            precio = 90.0,
            stock = 5,
            autor = autor1,
            categoria = categoria1
        ),
        Libro(
            id = 2,
            titulo = "1984",
            precio = 65.0,
            stock = 8,
            autor = autor2,
            categoria = categoria2
        ),
        Libro(
            id = 3,
            titulo = "El Principito",
            precio = 55.0,
            stock = 10,
            autor = autor3,
            categoria = categoria2
        )
    )

    var mostrarLibros by remember {
        mutableStateOf(true)
    }

    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = { mostrarLibros = true }
                ) {
                    Text("Libros")
                }

                Button(
                    onClick = { mostrarLibros = false }
                ) {
                    Text("Autores")
                }
            }
        }
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            if (mostrarLibros) {
                LibrosScreen(libros)
            } else {
                AutoresScreen(autores)
            }
        }
    }
}
