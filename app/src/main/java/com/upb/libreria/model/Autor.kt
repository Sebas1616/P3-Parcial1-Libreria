package com.upb.libreria.model

class Autor(
    val id: Int,
    val nombre: String,
    val nacionalidad: String
) {
    fun obtenerInformacion(): String {
        return "$nombre - $nacionalidad"
    }
}
