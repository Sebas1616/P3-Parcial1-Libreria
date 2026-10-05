package com.upb.libreria.model

class Libro(
    val id: Int,
    val titulo: String,
    val precio: Double,
    var stock: Int,
    val autor: Autor,
    val categoria: Categoria
) {
    fun hayStock(): Boolean {
        return stock > 0
    }

    fun vender(cantidad: Int): Boolean {
        return if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad
            true
        } else {
            false
        }
    }

    fun obtenerInformacion(): String {
        return "$titulo - ${autor.nombre} - Bs $precio"
    }
}
