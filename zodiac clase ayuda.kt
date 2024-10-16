package Scanner

import java.util.Scanner

fun main (){
    val lector : Scanner = Scanner(System.`in`)

    var any : Int
    do {
        var anyCorrecte: Boolean = false

        do {
            println("Introdueix el teu any de naixement")
            anyCorrecte = lector.hasNextInt()
            if (!anyCorrecte) {
                println("ERROR!! Introdueix un numero")
                lector.nextLine()
            }
        } while (!anyCorrecte)
        any = lector.nextInt()
        lector.nextLine()// descartem l'entrada del retorn del carro (Enter) ya que el bufer tiene encuenta el enter, por eso salia el doble error.
        if (any <1900 || any > 2024) println("ERROR any incorrecte per sistema")
    }while(any<1920 || any >2024)

    println("Has nascut a l'lany $any")

    var mes : Int
    do {
        var mesCorrecte: Boolean = false

        do {
            println("Introdueix el teu mes de naixement")
            mesCorrecte = lector.hasNextInt()
            if (!mesCorrecte) {
                println("ERROR!! Introdueix un numero")
                lector.nextLine()
            }
        } while (!mesCorrecte)
        mes = lector.nextInt()
        lector.nextLine()// descartem l'entrada del retorn del carro (Enter)
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
        if (mes < 1 || mes > 12) println("ERROR any incorrecte per sistema")
    }while(mes < 1 || mes > 12)

    println("Has nascut al mes $mes de l'$any")
    var dia : Int
    do {
        var diaCorrecte: Boolean = false

        do {
            println("Introdueix el teu dia de naixement")
            diaCorrecte = lector.hasNextInt()
            if (!diaCorrecte) {
                println("ERROR!! Introdueix un numero")
                lector.nextLine()
            }
        } while (!diaCorrecte)
        dia = lector.nextInt()
        lector.nextLine()// descartem l'entrada del retorn del carro (Enter) ya que el bufer tiene encuenta el enter, por eso salia el doble error.
         if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
             while (dia > 31) {
                 println("ERROR, en quests mes no poden haber mes de 31 dies")
                 println("Introdueix el teu dia de naixement")
                 dia = lector.nextInt()
             }
         }else{
             while (dia > 30) {
                 println("ERROR, en quests mes no poden haber mes de 30 dies")
                 println("Introdueix el teu dia de naixement")
                 dia = lector.nextInt()
             }
         }
        if (mes == 2)
            while (dia > 29) {
                println("ERROR, el mes de febrer no pot tenir mes de 29 dies")
                println("Introdueix el teu dia de naixement")
                dia = lector.nextInt()
            }
    }while(dia < 1 || dia > 31)

    println("Has nascut al $dia/$mes/$any")

}