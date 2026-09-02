fun main() {

    val nomePersonagem = "Aragorn"        // String (texto)
    val nivel: Int = 5                    // Int (número inteiro)
    val vidaMaxima = 100.0                // Double (número decimal) 
    val estaVivo = true                   // Boolean (verdadeiro/falso)
    var vidaAtual = 100.0                 // Variável mutável


    println("Nome: $nomePersonagem")
    println("Nivel: $nivel")
    println("Vida maxima: $vidaMaxima")
    println("Esta vivo? $estaVivo")
    println("Vida atual: $vidaAtual")


    vidaAtual = 80.0                      // O personagem tomou algum dano
    println("Vida atual apos dano: $vidaAtual")


    println("Digite o nome do inimigo:")
    val nomeInimigo = readln()
    println("Um $nomeInimigo apareceu!")
    
    
    println("Quanto de dano o inimigo causou?")
    val danoTexto = readln()
    val dano = danoTexto.toInt()

    vidaAtual = vidaAtual - dano
    println("O inimigo causou $dano de dano!")
    println("Vida atual apos o ataque: $vidaAtual")


}