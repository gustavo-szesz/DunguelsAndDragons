package org.example.entity.tracos

import org.example.entity.Personagem

data class Idiomas(val idiomas: List<String>) : TracoRacial {
    override fun aplicar(personagem: Personagem) {
        //personagem.idiomas.addAll(idiomas)
    }
}