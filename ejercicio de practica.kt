package Scanner

import java.util.*

fun main (){
   val x :Int
    val lector: Scanner = Scanner(System.`in`)
    var valorCorrecte: Boolean = false

        do {
            println("Escriu un enter entre el 0 i el 10 ")
            valorCorrecte = lector.hasNextInt()

            if (valorCorrecte == false) {
                println("ERROR : Has escrit ${lector.nextLine()}!!")
            }
        } while (valorCorrecte == false)

    x = lector.nextInt()
    print("Has escrit el numero entre el 0 i el 10 $x")
}