package org.example.entity.classes

open class Dado(val numeroDeFaces: Int) {
    open fun rolar(): Int {
        return (1..numeroDeFaces).random()
    }
}