package org.example.entity.classes.specs.dataclasse


sealed class Pontos() {
    enum class PontosPadrao(val valor: Int) {
        QUINZE(15),
        QUATORZE(14),
        TREZE(13),
        DOZE(12),
        DEZ(10),
        OITO(8)
    }

    enum class PontosInicial(val valor: Int) {
        VINTEESETE(27)
    }
}