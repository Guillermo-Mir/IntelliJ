package Scanner

import java.util.*

/**
*Escriu un programa que llegeixi una data de naixement i ens digui el signe zodiacal corresponent. Has d’assegurar-te
* que l’usuari introdueix una data de naixement correcta.
Una data és correcta si el mes es troba entre 1 i 12. Si el mes és 1,3,5,7,8,10 o 12 el dia ha d’estar entre 1 i 31.
* Si el mes és 4,6,9,11 el dia ha d’estar entre 1 i 30. Si el mes és 2, llavors el dia ha d’estar entre 1 i 28, però si l’any és múltiple de 4 pot tenir 29 dies,
* excepte si l’any és múltiple de 100 però sí ho serà si és múltiple de 400.
*
*@author: Guillermo Mir
 * @date: 8/10/2024
 */
fun main (){
    val lector : Scanner = Scanner(System.`in`)
    var edat :Int = 0
    var valorCorrecte : Boolean = false
    var mes : Int = 0
    var any : Int = 1920
    var dia : Int = 0
    do {
        do {
            println("Introdueix el teu any de naixement")
            valorCorrecte = lector.hasNextInt()
            if (valorCorrecte == false) {
                println("ERROR : Has escrit ${lector.nextLine()}!!")
            }
        }while(valorCorrecte == false)

        any = lector.nextInt()
        if (any < 1920 || any > 2024)
            println("ERROR, any incorrecte")
        else println("El teu any de naixement és $any")
    }while (any < 1920 || any > 2024 )



    do {
        do {
            println("Introdueix el teu mes de naixement")
            valorCorrecte = lector.hasNextInt()
            if (valorCorrecte == false) {
                println("ERROR : Has escrit ${lector.nextLine()}!!")
            }
        } while (valorCorrecte == false)
        mes = lector.nextInt()
        when (mes) {
            1 -> println("El teu signe zodiacal és Acuario")
            2 -> println("El teu signe zodiacal és Piscis")
            3 -> println("El teu signe zodiacal és Aries")
            4 -> println("El teu signe zodiacal és Tauro")
            5 -> println("El teu signe zodiacal és Géminis")
            6 -> println("El teu signe zodiacal és Cáncer")
            7 -> println("El teu signe zodiacal és Leo")
            8 -> println("El teu signe zodiacal és Virgo")
            9 -> println("El teu signe zodiacal és Libra")
            10 -> println("El teu signe zodiacal és Escorpio")
            11 -> println("El teu signe zodiacal és Sagitario")
            12 -> println("El teu signe zodiacal és Capricornio")
        }
        if (mes <1 || mes >12){
            println("ERROR, mes incorrecte")

        }
    }while (mes < 1 || mes > 12)
    println("El teu mes de naixement és $mes")
    do {
        do {
            println("Introdueix el teu dia de naixement")
            valorCorrecte = lector.hasNextInt()
            if (valorCorrecte == false) {
                println("ERROR : Has escrit ${lector.nextLine()}!!")
            }
        } while (valorCorrecte == false)
        dia = lector.nextInt()
        if (dia < 1 || dia > 31)
            println("ERROR, dia incorrecte")
        else println("El teu dia de naixement és $dia")
    }while (dia < 1 || dia > 31)



    }



