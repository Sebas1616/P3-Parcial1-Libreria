# Registro de desarrollo - LibreriaApp

## 1. Caso de estudio

Se eligió el caso de estudio de una Librería.

El proyecto representa elementos básicos de una librería utilizando Programación Orientada a Objetos en Kotlin y dos interfaces desarrolladas con Jetpack Compose.

## 2. Diseño de clases

Se definieron tres clases principales:

### Autor
Atributos:
- id: Int
- nombre: String
- nacionalidad: String

Método:
- obtenerInformacion(): String

### Categoria
Atributos:
- id: Int
- nombre: String
- descripcion: String

Método:
- obtenerInformacion(): String

### Libro
Atributos:
- id: Int
- titulo: String
- precio: Double
- stock: Int
- autor: Autor
- categoria: Categoria

Métodos:
- hayStock(): Boolean
- vender(cantidad: Int): Boolean
- obtenerInformacion(): String

Relaciones:
- Un Autor puede tener varios Libros.
- Cada Libro tiene un Autor.
- Una Categoria puede contener varios Libros.
- Cada Libro pertenece a una Categoria.

El diseño se encuentra en:
diagrama_clases.png

## 3. Implementación

Las clases fueron implementadas dentro del paquete:

app/src/main/java/com/upb/libreria/model/

Archivos:
- Autor.kt
- Categoria.kt
- Libro.kt

La clase Libro incluye métodos para verificar stock, realizar una venta y mostrar información.

## 4. Diseño de pantallas

Antes de implementar las interfaces se realizó el diseño de dos pantallas.

El diseño se encuentra en:
diseno_pantallas.png

Pantalla 1:
Lista de Libros

Muestra:
- título
- autor
- categoría
- precio
- stock

Pantalla 2:
Lista de Autores

Muestra:
- nombre
- nacionalidad

## 5. Componentes Jetpack Compose

Se utilizaron los siguientes componentes:

- Scaffold: estructura principal de la pantalla.
- Column: organiza elementos verticalmente.
- Row: organiza los botones de navegación.
- LazyColumn: permite mostrar las listas.
- Card: representa cada libro o autor.
- Text: muestra la información.
- Button: permite cambiar entre pantallas.
- Modifier: configura tamaño, padding y distribución.

## 6. Cambio entre pantallas

En MainActivity se utiliza:

- remember
- mutableStateOf

La variable mostrarLibros permite decidir qué pantalla se muestra.

Cuando es true se muestra LibrosScreen.

Cuando es false se muestra AutoresScreen.

## 7. Datos de prueba

Autores utilizados:
- Gabriel Garcia Marquez
- George Orwell
- Antoine de Saint-Exupery

Libros utilizados:
- Cien años de soledad
- 1984
- El Principito

Categorías:
- Novela
- Clasico

## 8. Scripts y comandos utilizados

Se creó:

scripts/crear_modelos.sh

Este script genera:
- Autor.kt
- Categoria.kt
- Libro.kt

Comando utilizado:

./scripts/crear_modelos.sh

Para comprobar la compilación se utilizó:

./gradlew assembleDebug

Resultado:

BUILD SUCCESSFUL

También se utilizaron comandos Git como:

git status
git add
git commit
git log --oneline
git remote add origin
git push

## 9. Consultas de apoyo utilizadas

Durante el desarrollo se realizaron consultas de apoyo para:

- Revisar el modelo de clases de una librería.
- Revisar atributos, métodos y relaciones.
- Revisar la implementación de las clases Kotlin.
- Orientar la estructura de las dos pantallas.
- Revisar componentes de Jetpack Compose.
- Revisar la compilación del proyecto.

## 10. Estructura principal

app/src/main/java/com/upb/libreria/

MainActivity.kt

model/
- Autor.kt
- Categoria.kt
- Libro.kt

ui/screens/
- LibrosScreen.kt
- AutoresScreen.kt

Archivos adicionales:
- diagrama_clases.png
- diseno_pantallas.png
- DISENO_INTERFACES.md
- scripts/

## 11. Repositorio

El proyecto utiliza Git para el control de versiones y fue subido a un repositorio público.

Repositorio:

https://github.com/Sebas1616/P3-Parcial1-Libreria

## 12. Verificación

El proyecto fue compilado utilizando:

./gradlew assembleDebug

Resultado:

BUILD SUCCESSFUL