package org.example.entity

import org.example.entity.classes.Classe
import org.example.entity.classes.Raca
import org.example.entity.classes.specialized.interfaces.Habilidade

class Personagem(
    val nome: String,
    val raca: Raca,
    val classe: Classe<Any?>,
    var deslocamento: Double,
    val idiomas: Any,
    var forca: Int = 10,
    var pontosDeVida: Int = 10,
    var habilidades: List<Habilidade> = emptyList(),
    var nivel: Int
) {



}