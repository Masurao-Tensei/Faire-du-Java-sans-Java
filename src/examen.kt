
fun main(args: Array<String>){
    println("Exam du code de la route version 0.001 NuIt dE L'iNfO EdItIoN")
    testQuestion()
}

fun testQuestion(){
    println("L'adversaire rentre dans le tunnel au début de waluigi pinball")
    println("[A] Je lance ma carapace rouge  [B] J'attend d'être sorti du tunnel")
    println("Une carapace bleue sera efficace dans le tunnel")
    println("[C] Oui                         [D] Non")
    print("Réponse: ")
    val reps = readLine()
    val areps = strToCharArray(reps)
    val sol = "BD"
    println("${validationReponses(areps, sol)}")
}

fun strToCharArray(entree: String?): Array<Char> {
    if (entree == null) return arrayOf(' ')
    if (entree == "") return arrayOf(' ')
    var resArray: Array<Char>
    resArray = arrayOf(entree[0])
    for (l in 1..entree.length-1){
        resArray = resArray.plus(entree[l])
    }
    return resArray
}

fun validationReponses(entree: Array<Char>, soluce: String): Boolean{
    if(entree.size != soluce.length) return false
    var score = 0
    for(l in entree){
        for(r in soluce){
            if(l == r){
                score++
                continue
            }
        }
    }
    return score == soluce.length
}