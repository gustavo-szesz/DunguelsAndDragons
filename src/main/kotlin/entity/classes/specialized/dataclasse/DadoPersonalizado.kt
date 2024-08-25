package org.example.entity.classes.specialized.dataclasse

class DadoPersonalizado(val faces: List<Int>) {
    fun rolar(): Int {
        val indice = (0 until faces.size).random()
        return faces[indice]
    }
}