package com.cinevilo.app.data

data class Contenido(
    val id: String,
    val titulo: String,
    val tipo: String,
    val descripcion: String = "",
    val genero: List<String> = emptyList(),
    val anio: Int? = null,
    val portadaUrl: String = "",
    val bannerUrl: String = "",
    val videoUrl: String = "",
    val esOriginal: Boolean = false,
    val destacado: Boolean = false,
    val estreno: Boolean = false
)
