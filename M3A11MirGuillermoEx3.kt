package Scanner

import java.util.*

/**
 * Fes un programa que demani un número enter major que 1 a l'usuari i digui si el nombre és primer o no. Després, ens dirà quin és el nombre primer immediatament superior. Exemple:
 * Introdueix un número: 8
 * 8 no és primer. El primer immediatament superior a 8 és el 11.
 * Introdueix un número: 5
 * 5 és primer. El primer immediatament superior a 5 és el 7.
 * Recordeu: un número major que 1 és primer si només és divisible per 1 i per ell mateix.
 *
 * @author Guillermo Mir
 *
 **/
fun main () {
    val lector: Scanner = Scanner(System.`in`)
    var num: Int = 0
    var numPrimer: Boolean = true
    var numCorrecte: Boolean = false
    var i: Int = 2
    var numSeguent: Int
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
            do {
                if (num % i == 0) numPrimer = false
                else i++
            } while (i < num && numPrimer)
            when (numPrimer) {
                true -> println("El numero $num ${BLUE_BOLD}és primer${RESET}")
                false -> println("El numero $num ${RED}no és primer${RESET}")
            }

        } while (num < 1)
        // Estructura per poder saber quin és el nombre primer següent al número proposta per l'usuari
        fun esPrimer(num: Int): Boolean {
            if (num < 2) return false
            for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
                if (num % i == 0) return false
            }
            return true
        }

        numPrimer = esPrimer(num)
        do {
            num++
        } while (!esPrimer(num))

        println("${GREEN_BOLD}El nombre primer més gran després del número proposat és${RESET} $num.")
    }






