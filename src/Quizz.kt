import java.util.Scanner

class Quizz {

    internal var sc = Scanner(System.`in`)

    internal var message = "A la fin de la route, (1) je tourne a droite (2) je tourne a gauche"

    internal var message2 = "A cet intersection, (1) je regarde vers la droite (2) je regarde vers la gauche"

    override fun toString(): String {
        return message

    }

    fun choixdelafonction() {
        var choix : Int
        println("Entrez le numero de la question")
        choix = sc.nextInt()
        when (choix) {

            1 -> message.toString()
            2 -> message2.toString()
        }
    }

}
