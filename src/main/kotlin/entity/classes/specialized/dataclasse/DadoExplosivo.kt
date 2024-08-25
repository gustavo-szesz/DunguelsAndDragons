package org.example.entity.classes.specialized.dataclasse

import org.example.entity.classes.Dado

class DadoExplosivo(numeroDeFaces: Int) : Dado(numeroDeFaces) {
    override fun rolar(): Int {
        var resultado = super.rolar()
        while (resultado == numeroDeFaces) {
            resultado += super.rolar()
        }
        return resultado
    }
}