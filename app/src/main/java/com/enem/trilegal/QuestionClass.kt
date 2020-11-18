package com.enem.trilegal

data class MateriaClass (
    val biologia: ArrayList<QuestionClass>
)

data class QuestionClass(
    val conteudo: String,
    val questao: String,
    val resposta1: String,
    val resposta2: String,
    val resposta3: String,
    val resposta4: String,
    val resposta5: String,
    val respostacerta: Int
)
