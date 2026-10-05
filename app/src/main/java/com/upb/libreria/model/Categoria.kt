package com.upb.libreria.model

class Categoria(
    val id: Int,
    val nombre: String,
    val descripcion: String
) {
    fun obtenerInformacion(): String {
        return "$nombre: $descripcion"
    }
}
