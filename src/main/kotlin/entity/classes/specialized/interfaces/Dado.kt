package org.example.entity.classes.specialized.interfaces

interface Dado {
    fun rolar(): Int
}

fun rolarHabilidade(dado: Dado): Int {
    return dado.rolar()
}