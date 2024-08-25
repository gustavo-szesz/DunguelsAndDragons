package org.example.entity.tracos

import org.example.entity.Personagem

interface TracoRacial {
    fun aplicar(personagem: Personagem)
}