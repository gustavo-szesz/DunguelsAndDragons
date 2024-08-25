package org.example.entity.classes.specialized.progression

import org.example.entity.Personagem
import org.example.entity.classes.specialized.dataclass.AtaqueExtra
import org.example.entity.classes.specialized.interfaces.ProgressaoNivel

class ProgressaoGuerreiro: ProgressaoNivel {
    override fun subirNivel(personagem: Personagem) {
        // Aumentar Força (adaptar de acordo com as regras de D&D)
        personagem.forca++

        // Adicionar novas habilidades
        when (personagem.nivel) {
            2 -> personagem.habilidades += AtaqueExtra()
            // ... outros níveis e habilidades
        }

        // Aumentar pontos de vida (adaptar de acordo com as regras de D&D)
        personagem.pontosDeVida += 6
    }

}