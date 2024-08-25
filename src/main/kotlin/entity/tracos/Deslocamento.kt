package org.example.entity.tracos

import org.example.entity.Personagem

data class Deslocamento(val valor: Double) : TracoRacial {
    override fun aplicar(personagem: Personagem) {
        personagem.deslocamento = valor
    }
}