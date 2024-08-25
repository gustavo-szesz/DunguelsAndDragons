package org.example.entity.classes

import org.example.entity.tracos.Deslocamento
import org.example.entity.tracos.Idiomas
import org.example.entity.tracos.TracoRacial

sealed class Raca {
    abstract val nome: String
    abstract val atributosModificadores: Map<String, Int>
    abstract val tracoRacials: List<TracoRacial>
}

data class Humano(
    override val nome: String = "Humano",
    override val atributosModificadores: Map<String, Int> = mapOf("Carisma" to 1),
    override val tracoRacials: List<TracoRacial>
) : Raca()

data class Halfling(
    override val nome: String = "Halfling",
    override val atributosModificadores: Map<String, Int> = mapOf("Destreza" to 2),
    override val tracoRacials: List<TracoRacial>
) : Raca()



sealed class Anao : Raca() {
    override val atributosModificadores: Map<String, Int> = mapOf("Constituição" to 2)

    data class AnaoDaColina(
        override val nome: String = "Anão da Colina",
        override val tracoRacials: List<TracoRacial>
    ) : Anao()

    data class AnaoDaMontanha(
        override val nome: String = "Anão da Montanha",
        override val tracoRacials: List<TracoRacial>
    ) : Anao()

    data class AnaoDoVale(
        override val nome: String = "Anão do Vale",
        override val tracoRacials: List<TracoRacial> = listOf(
            Deslocamento(7.5),
            Idiomas(listOf("Comum", "Anão"))
        )
    ) : Anao()
}

sealed class Elfo : Raca() {
    override val atributosModificadores: Map<String, Int> = mapOf("Destreza" to 2)

    data class ElfoAlto(
        override val nome: String = "Elfo Alto",
        override val tracoRacials: List<TracoRacial>
    ) : Elfo()

    data class ElfoDaFloresta(
        override val nome: String = "Elfo da Floresta",
        override val tracoRacials: List<TracoRacial>
    ) : Elfo()

    data class ElfoNegro(
        override val nome: String = "Elfo Negro",
        override val tracoRacials: List<TracoRacial>
    ) : Elfo()
}
