package org.example.entity.classes.specialized.classes

import org.example.entity.classes.Classe
import org.example.entity.classes.specialized.proef.Proeficiencia
import org.example.entity.classes.specialized.interfaces.Caracteristica
import org.example.entity.classes.specialized.interfaces.Habilidade

data class Clerigo (
    override val nome: String = "Clérigo",
    override val habilidades: List<Habilidade> = listOf(
        //
        // TODO("Implementar habilidades - ATAQUE A DISTANCIA")
        //
    ),
    override val proficiencias: Proeficiencia = Proeficiencia(
        armas = listOf("Adagas", "Dardos", "Fundas", "Bordões", "Bestas leves"),
        armaduras = listOf("Nenhuma"),
        pericias = listOf("Arcanismo", "História"),
        testesResistencia = listOf("Inteligência", "Sabedoria")
    ),
    override val caracteristicas: List<Caracteristica> = listOf(
        // TODO("Implementar característica")
    ),
    override val atributosModificadores: Map<String, Int> = mapOf(
        "Carisma" to 2,
        "Destreza" to 1
    )
): Classe<Any?> {
    override fun ResistenciaExtra(): Caracteristica {
        TODO("Not yet implemented")
    }
}