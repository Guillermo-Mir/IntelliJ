package Scanner
/**
 * Escriu un programa que presenti el següent menú d’opcions relacionades amb les propietats dels triangles i que permeti resoldre les operacions indicades.
 * Introduir longituds d’un triangle: demana tres números positius i comprova que puguin correspondre als costats d’un triangle, tornant-los a demanar tantes vegades com sigui necessari.
 * Per a determinar si tres segments poden formar un triangle, s’ha de verificar que compleixen la desigualtat triangular: si a, b i c són les longituds dels costats d’un triangle, llavors es compleix que ((abs(a-c) < b) i (b < (a+c)))
 * Comprovar si és triangle rectangle: comprova si les últimes longituds vàlides introduïdes es corresponen amb els costats d’un triangle rectangle i, en aquest cas, imprimeix la seva hipotenusa i els seus catets.
 * Per a determinar si un triangle és rectangle s’ha de complir el teorema de Pitàgoras: a2 = b2 + c2, sent a el més gran dels costats.
 * Classificar d’acord als seus costats: classifica l’últim triangle vàlid en equilàter, isòsceles o escalè.
 * Per a determinar si un triangle és equilàter els seus tres costats han de ser iguals. Si en té dos iguals i un de diferent és isòsceles i si tots tres son diferents llavors és escalè.
 * Calcular perímetre i àrea
 * El perímetre és la suma dels costats i l’àrea es pot calcular a partir de la fórmula A= sqrt(s(s-a)(s-b)(s-c)), on a, b i c són els costats i s= (a+b+c)/2 és el semiperímetre.
 * Sortir: mostra un missatge d’acomiadament i acaba el programa.
 *
 * @author Guillermo Mir
 *
 **/



import java.util.Scanner
import kotlin.math.sqrt

fun main (){
    val lector : Scanner = Scanner(System.`in`)
    var A_Correcte : Boolean = false
    var A : Float
    var B_Correcte : Boolean = false
    var B : Float
    var C_Correcte : Boolean = false
    var C : Float
    val TEXT_MENU: String = ("\n\t${BLUE_BOLD}1. Introduir longituds d’un triangle" +
            "\n\t2. Comprovar si és triangle rectangle" +
            "\n\t3. Classificar d’acord als seus costats" +
            "\n\t4. Calcular perímetre i àrea" +
            "\n\t0. Sortir${RESET}")
    var opcio: Int = 0

    println("Benvingut al programa!!!...")


    do {

        do {
            println("Hola, introdueix el número de l'exercici que vols realitzar.")
            println(TEXT_MENU)
            print("Que opció vols escollir?:")
            opcio = readln().toInt()
        } while ((opcio < 0) || (opcio > 4))

        println("Molt bé! Has escollit l'opció $opcio")

        when (opcio){
            0 -> {
                println("Has escollit sortir...")
            }

            1 ->{do {
                println("Introdueix els tres segments que formen el triangle, recorda que perquè puguin formar un triangle B < A+C")
                do {
                    println("Introdueix el primer costat del triangle (A)")
                    A_Correcte = lector.hasNextFloat()
                    if (!A_Correcte) {
                        println("ERROR!! Introdueix un número positiu")
                        lector.nextLine()
                    }
                } while (!A_Correcte)
                A = lector.nextFloat()
                lector.nextLine()
                do {
                    println("Introdueix el segon costat del triangle (B)")
                    B_Correcte = lector.hasNextFloat()
                    if (!B_Correcte) {
                        println("ERROR!! Introdueix un número positiu")
                        lector.nextLine()
                    }
                } while (!B_Correcte)
                B = lector.nextFloat()
                lector.nextLine()
                do {
                    println("Introdueix el tercer costat del triangle (C)")
                    C_Correcte = lector.hasNextFloat()
                    if (!C_Correcte) {
                        println("ERROR!! Introdueix un número positiu")
                        lector.nextLine()
                    }
                } while (!C_Correcte)
                C = lector.nextFloat()
                lector.nextLine()
                if (B > (A+C)){
                    println("ERROR aquests segments no poden formar part d'un triangle si B > A+C")
                }
                }while (B > (A+C))
                println("Molt bé els tres segments que has proposat sí que poden formar un triangle!!!")
            }

            2->{do {
                do {
                    println("Introdueix el primer catet del triangle (A)")
                    A_Correcte = lector.hasNextFloat()
                    if (!A_Correcte) {
                        println("ERROR!! Introdueix un número positiu")
                        lector.nextLine()
                    }
                } while (!A_Correcte)
                A = lector.nextFloat()
                lector.nextLine()
                do {
                    println("Introdueix el segon catet del triangle (B)")
                    B_Correcte = lector.hasNextFloat()
                    if (!B_Correcte) {
                        println("ERROR!! Introdueix un número positiu")
                        lector.nextLine()
                    }
                } while (!B_Correcte)
                B = lector.nextFloat()
                lector.nextLine()
                do {
                    println("Introdueix la hipotenusa del triangle (C)")
                    C_Correcte = lector.hasNextFloat()
                    if (!C_Correcte) {
                        println("ERROR!! Introdueix un número positiu")
                        lector.nextLine()
                    }
                } while (!C_Correcte)
                C = lector.nextFloat()
                lector.nextLine()
                var hipotenusa = sqrt((A * A) + (B * B))
                println("La hipotenusa és ${hipotenusa} ")
                println("Els catets són ${A} || ${B} ")
                println("ERROR aquest no és un triangle rectangle, ja que la hipotenusa hauria de ser ${hipotenusa}, torna a provar.")
            }while (C != hipotenusa)
                println("Molt bé!!! Aquest triangle és rectangle")
            }

            3 -> {
                do {
                    println("Introdueix els tres segments que formen el triangle.")
                    do {
                        println("Introdueix el primer costat del triangle (A)")
                        A_Correcte = lector.hasNextFloat()
                        if (!A_Correcte) {
                            println("ERROR!! Introdueix un numero positiu")
                            lector.nextLine()
                        }
                    } while (!A_Correcte)
                    A = lector.nextFloat()
                    lector.nextLine()
                    do {
                        println("Introdueix el segon costat del triangle (B)")
                        B_Correcte = lector.hasNextFloat()
                        if (!B_Correcte) {
                            println("ERROR!! Introdueix un numero positiu")
                            lector.nextLine()
                        }
                    } while (!B_Correcte)
                    B = lector.nextFloat()
                    lector.nextLine()
                    do {
                        println("Introdueix el tercer costat del triangle (C)")
                        C_Correcte = lector.hasNextFloat()
                        if (!C_Correcte) {
                            println("ERROR!! Introdueix un numero positiu")
                            lector.nextLine()
                        }
                    } while (!C_Correcte)
                    C = lector.nextFloat()
                    lector.nextLine()
                } while (false)
                when {
                    A == B || B == C -> println("El triangle és equilàter")
                    A == B || A == C -> println("El triangle és isòsceles")
                    A < B || C > B || C > B || A > B || A > C || A < C -> println("El triangle és escalè")

                }
            }

            4->{do {
                println("Introdueix els tres segments que formen el triangle")
                do {
                    println("Introdueix el primer costat del triangle (A)")
                    A_Correcte = lector.hasNextFloat()
                    if (!A_Correcte) {
                        println("ERROR!! Introdueix un numero positiu")
                        lector.nextLine()
                    }
                } while (!A_Correcte)
                A = lector.nextFloat()
                lector.nextLine()
                do {
                    println("Introdueix el segon costat del triangle (B)")
                    B_Correcte = lector.hasNextFloat()
                    if (!B_Correcte) {
                        println("ERROR!! Introdueix un numero positiu")
                        lector.nextLine()
                    }
                } while (!B_Correcte)
                B = lector.nextFloat()
                lector.nextLine()
                do {
                    println("Introdueix el tercer costat del triangle (C)")
                    C_Correcte = lector.hasNextFloat()
                    if (!C_Correcte) {
                        println("ERROR!! Introdueix un numero positiu")
                        lector.nextLine()
                    }
                } while (!C_Correcte)
                C = lector.nextFloat()
                lector.nextLine()
            }while(false)
                var perimetre = (A+B+C)
                var area = sqrt(perimetre*(perimetre-A)*(perimetre-B)*(perimetre-C))
                println("El perimetre del triangle és ${perimetre}")
                println("El area del triangle és ${area} ")
            }
    }}while(opcio != 0)
}