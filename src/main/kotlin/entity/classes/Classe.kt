package org.example.entity.classes

import org.example.entity.classes.specialized.proef.Proeficiencia
import org.example.entity.classes.specialized.interfaces.Caracteristica
import org.example.entity.classes.specialized.interfaces.Habilidade

interface Classe<T> {
    abstract fun ResistenciaExtra(): Caracteristica

    val nome: String
    val habilidades: List<Habilidade>
    val proficiencias: Proeficiencia
    val caracteristicas: List<Caracteristica>
    val atributosModificadores: Map<String, Int>
}