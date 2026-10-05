package com.upb.libreria.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.upb.libreria.model.Libro

@Composable
fun LibrosScreen(libros: List<Libro>) {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(
                text = "Lista de Libros",
                fontSize = 28.sp
            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(libros) { libro ->
                    Card(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text(text = libro.titulo, fontSize = 20.sp)
                            Text(text = "Autor: ${libro.autor.nombre}")
                            Text(text = "Categoría: ${libro.categoria.nombre}")
                            Text(text = "Precio: Bs ${libro.precio}")
                            Text(text = "Stock: ${libro.stock}")
                        }
                    }
                }
            }
        }
    }
}
