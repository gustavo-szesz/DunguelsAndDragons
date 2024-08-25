// Main.kt
package org.example

import org.example.entity.Personagem
import org.example.entity.classes.Classe
import org.example.entity.classes.Raca
import org.example.entity.classes.specialized.dataclass.AtaqueExtra
import org.example.entity.classes.specialized.dataclass.DefesaExtra
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Criação de Personagem")
    print("Nome: ")
    val nome = scanner.nextLine()

    print("Força: ")
    val forca = scanner.nextInt()

    print("Destreza: ")
    val destreza = scanner.nextInt()

    print("Constituição: ")
    val constituicao = scanner.nextInt()

    print("Inteligência: ")
    val inteligencia = scanner.nextInt()

    print("Sabedoria: ")
    val sabedoria = scanner.nextInt()

    print("Carisma: ")
    val carisma = scanner.nextInt()

    scanner.nextLine() // Consume newline

    print("Classe: ")
    val classeNome = scanner.nextLine()

    val habilidades = listOf(AtaqueExtra(), DefesaExtra())

    class Guerreiro : Classe {
        override val nome = "Guerreiro"
        override val habilidades = habilidades
    }

    class Humano : Raca() {
        override val nome = "Humano"
        override val atributos = mapOf("Força" to 2, "Destreza" to 1)
    }

    val classe = Guerreiro()
    val raca = Humano()

    val personagem = Personagem(
        nome = nome,
        forca = forca,
        destreza = destreza,
        constituicao = constituicao,
        inteligencia = inteligencia,
        sabedoria = sabedoria,
        carisma = carisma,
        classe = classe,
        raca = raca,
        deslocamento = TODO(),
        idiomas = TODO(),
        pontosDeVida = TODO(),
        habilidades = TODO(),
        nivel = TODO()
    )

    println("Personagem criado: $personagem")
}