#!/bin/bash

RUTA="app/src/main/java/com/upb/libreria/model"

mkdir -p "$RUTA"

cat > "$RUTA/Autor.kt" <<'KOTLIN'
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
KOTLIN

cat > "$RUTA/Categoria.kt" <<'KOTLIN'
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
KOTLIN

cat > "$RUTA/Libro.kt" <<'KOTLIN'
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
KOTLIN

echo "Clases creadas correctamente."
