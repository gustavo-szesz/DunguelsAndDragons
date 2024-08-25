package org.example.entity

import org.example.entity.classes.specialized.classes.Barbaro
import org.example.entity.classes.specialized.classes.Clerigo
import org.example.entity.classes.specialized.classes.Mago
import org.example.entity.classes.specialized.dataclass.*
import org.example.entity.classes.specialized.interfaces.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PersonagemTest {

    @Test
    fun testCreateBarbaro() {
        val barbaro = Barbaro(
            habilidades = listOf(
                object : Habilidade {
                    override fun usar(personagem: Personagem) {
                        // Implementação da habilidade
                    }
                }
            ),
            caracteristicas = listOf(
                object : Caracteristica {
                    override fun aplicar(personagem: Personagem) {
                        // Implementação da característica
                    }
                }
            )
        )
        assertEquals("Bárbaro", barbaro.nome)
        assertEquals(2, barbaro.atributosModificadores["Força"])
        assertEquals(1, barbaro.atributosModificadores["Constituição"])
    }

    @Test
    fun testCreateGuerreiro() {
        val guerreiro = Guerreiro(
            habilidades = listOf(
                object : Habilidade {
                    override fun usar(personagem: Personagem) {
                        // Implementação da habilidade
                    }
                }
            ),
            caracteristicas = listOf(
                object : Caracteristica {
                    override fun aplicar(personagem: Personagem) {
                        // Implementação da característica
                    }
                }
            )
        )
        assertEquals("org.example.entity.classes.specialized.classes.Guerreiro", guerreiro.nome)
        assertEquals(2, guerreiro.atributosModificadores["Força"])
        assertEquals(1, guerreiro.atributosModificadores["Constituição"])
    }

    @Test
    fun testCreateMago() {
        val mago = Mago(
            nome = "Mago",
            habilidades = listOf(
                object : Habilidade {
                    override fun usar(personagem: Personagem) {
                        // Implementação da habilidade
                    }
                }
            ),
            caracteristicas = listOf(
                object : Caracteristica {
                    override fun aplicar(personagem: Personagem) {
                        // Implementação da característica
                    }
                }
            )
        )
        assertEquals("Mago", mago.nome)
        assertEquals(2, mago.atributosModificadores["Inteligência"])
        assertEquals(1, mago.atributosModificadores["Sabedoria"])
    }

    @Test
    fun testCreateClerigo() {
        val clerigo = Clerigo(
            habilidades = listOf(
                object : Habilidade {
                    override fun usar(personagem: Personagem) {
                        // Implementação da habilidade
                    }
                }
            ),
            caracteristicas = listOf(
                object : Caracteristica {
                    override fun aplicar(personagem: Personagem) {
                        // Implementação da característica
                    }
                }
            )
        )
        assertEquals("Clérigo", clerigo.nome)
        assertEquals(2, clerigo.atributosModificadores["Inteligência"])
        assertEquals(1, clerigo.atributosModificadores["Sabedoria"])
    }
}