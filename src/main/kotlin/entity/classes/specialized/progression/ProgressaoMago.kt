package org.example.entity.classes.specialized.progression

import org.example.entity.Personagem
import org.example.entity.classes.specialized.interfaces.ProgressaoNivel

class ProgressaoMago : ProgressaoNivel {
    override fun subirNivel(personagem: Personagem) {
        personagem.nivel++
    }
}
