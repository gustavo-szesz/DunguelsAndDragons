package org.example.entity.classes.specialized.dataclass

import org.example.entity.Personagem
import org.example.entity.classes.specialized.interfaces.Habilidade

class AtaqueExtra : Habilidade {
    override var forca: Int = 5
    override var destreza: Int = 2
    override var constituicao: Int = 3
    override var inteligencia: Int = 0
    override val sabedoria: Int = 0
    override val carisma: Int = 0

    override fun usar(personagem: Personagem) {
        // Lógica para realizar um ataque extra
        println("Ataque extra usado!")
    }
}

class DefesaExtra : Habilidade {
    override var forca: Int = 1
    override var destreza: Int = 2
    override var constituicao: Int = 2
    override var inteligencia: Int = 0
    override val sabedoria: Int = 0
    override val carisma: Int = 0

    override fun usar(personagem: Personagem) {
        // Lógica para aumentar a defesa
        println("Defesa extra usada!")
    }
}