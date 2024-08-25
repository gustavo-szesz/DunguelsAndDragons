package org.example.entity.classes.specialized.classes

import org.example.entity.classes.Classe
import org.example.entity.classes.specialized.proef.Proeficiencia
import org.example.entity.classes.specialized.interfaces.Caracteristica
import org.example.entity.classes.specialized.interfaces.Habilidade

data class Barbaro (
    override val nome: String = "Bárbaro",
    override val habilidades: List<Habilidade> = listOf(
        //
        // TODO("Implementar habilidades - ATAQUE CLOSE RANGE")
        //
    ),
    override val proficiencias: Proeficiencia = Proeficiencia(
        armas = listOf("Todas as armas simples e marciais"),
        armaduras = listOf("Todas as armaduras"),
        pericias = listOf("Atletismo", "Intimidação"),
        testesResistencia = listOf("Força", "Constituição")
    ),
    override val caracteristicas: List<Caracteristica>,
    override val atributosModificadores: Map<String, Int> = mapOf(
        "Força" to 2,
        "Constituição" to 1
    )

): Classe<Any?> {
    override fun ResistenciaExtra(): Caracteristica {
        TODO("Not yet implemented")
    }
}