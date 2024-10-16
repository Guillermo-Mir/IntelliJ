package Scanner

import java.util.*
/**
 * Enunciat
 * @author Nom Cognom
 *
 **/
fun main (){
    val lector : Scanner = Scanner(System.`in`)
    var num : Int = 0
    var numPrimer : Int = 0
    var numCorrecte: Boolean = false
do {
    do {
        println("Introdueix un numero per saber si es primer o no ")
        numCorrecte = lector.hasNextInt()
        if (!numCorrecte) {
            println("ERROR!! Introdueix un numero")
            lector.nextLine()
        }
    } while (!numCorrecte)
    num = lector.nextInt()
    lector.nextLine()
}while (num < 1)

}