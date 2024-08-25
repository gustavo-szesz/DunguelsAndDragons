package org.example.entity.classes.specialized.interfaces

import org.example.entity.Personagem

interface Habilidade {
    var forca: Int
    var destreza: Int
    var constituicao: Int
    var inteligencia: Int
    val sabedoria: Int
    val carisma: Int
    fun usar(personagem: Personagem)
}