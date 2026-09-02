fun main() {

    val nomePersonagem = "Aragorn"                 // String (texto)
    val nivel: Int = 5                             // Int (número inteiro)
    val vidaMaxima = 100.0                         // Double (número decimal) 
    val estaVivo = true                            // Boolean (verdadeiro/falso)
    var vidaAtual = 100.0                          // Variável mutável


    println("Nome: $nomePersonagem")
    println("Nivel: $nivel")
    println("Vida maxima: $vidaMaxima")
    println("Esta vivo? $estaVivo")
    println("Vida atual: $vidaAtual")


    vidaAtual = 80.0                               // O personagem tomou algum dano
    println("Vida atual apos dano: $vidaAtual")


    println("Digite o nome do inimigo:")           // Instrução pro usuário
    val nomeInimigo = readln()                     // Programa espera o usuário digitar e apertar enter
    println("Um $nomeInimigo apareceu!")           // Joga de volta na tela o que está guardado na variável nomeInimigo
    
    
    println("Quanto de dano o inimigo causou?")
    val danoTexto = readln()                       // Guarda o que for digitado como String, texto e não número
    val dano = danoTexto.toInt()                   // Transforma o texto em número inteiro


    vidaAtual = vidaAtual - dano                   // Subtrai o dano da vida atual e guarda o resultado na variável vidaAtual
    println("O inimigo causou $dano de dano!")
    println("Vida atual apos o ataque: $vidaAtual")



}