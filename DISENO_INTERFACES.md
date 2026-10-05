# Diseño de Interfaces - Librería

## Pantalla 1: Lista de Libros

Estructura:

Scaffold
└── Column
    ├── Text: "Lista de Libros"
    └── LazyColumn
        └── Card
            └── Column
                ├── Text: título
                ├── Text: autor
                ├── Text: categoría
                ├── Text: precio
                └── Text: stock

Componentes Jetpack Compose utilizados:
- Scaffold
- Column
- LazyColumn
- Card
- Text
- Modifier

## Pantalla 2: Lista de Autores

Estructura:

Scaffold
└── Column
    ├── Text: "Lista de Autores"
    └── LazyColumn
        └── Card
            └── Column
                ├── Text: nombre
                └── Text: nacionalidad

Componentes Jetpack Compose utilizados:
- Scaffold
- Column
- LazyColumn
- Card
- Text
- Modifier

## Navegación entre pantallas

La aplicación utiliza dos botones en MainActivity:
- Libros
- Autores

El estado de la pantalla se controla mediante:
- remember
- mutableStateOf

Esto permite cambiar entre la lista de libros y la lista de autores.
