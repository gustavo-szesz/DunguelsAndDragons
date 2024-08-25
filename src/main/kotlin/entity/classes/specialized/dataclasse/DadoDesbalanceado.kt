package org.example.entity.classes.specialized.dataclasse

data class Face(val valor: Int, val probabilidade: Double)

class DadoDesbalanceado(val faces: List<Face>) {
    private val probabilidadesAcumuladas: List<Double> = faces.runningFold(0.0) { acc, face -> acc + face.probabilidade }

    fun rolar(): Int {
        val sorteio = Math.random()
        val indice = probabilidadesAcumuladas.indexOfFirst { it > sorteio }
        return faces[indice].valor
    }
}