import java.util.*

fun main () {
    val x:Int
    val lector: Scanner = Scanner(System.`in`)
    var valorCorrecte: Boolean = false

    do {
        println("Escriu un enter:")
        valorCorrecte = lector.hasNextInt()

        if (valorCorrecte == false) {
            println("ERROR: has escrit ${lector.nextLine()} !!")
        }
        }while ( valorCorrecte == false)

                x = lector.nextInt()
                println("Has escrit el numero $x")

        }



