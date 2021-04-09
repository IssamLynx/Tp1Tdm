import kotlin.random.Random

fun getRandomN(list:List<String>):Int {
    var lengths = mutableListOf<Int>();
    for (item in list) {
        lengths.add(item.length)
    }
    return lengths.get(Random.nextInt(0,lengths.size))

}
fun main(args: Array<String>) {
    var score:Int=0;
    val list = mutableListOf<String>("module","vocabulaire","grammaire","programme","orthographe","logiciel")
    while(true)
    {
    val n = getRandomN(list)
    print("entrer un mot de longueur $n : ")
    val motUser= readLine().toString()
    if(motUser.length==n) {
        val filtered = list.filter { it.length == n }
        if(filtered.isNotEmpty())
        {
        val aleatoire = Random.nextInt(0, filtered.size)
        val mot = filtered.get(aleatoire)
        print("$mot \n")
        if (mot == motUser) {
        score += 5
        print("Bravo!!!! vous avez obtenu 5 points, le score total est: $score points \n")
        } else print("Echec!!!! le score total est: $score points \n")
    }

    }
    else print("Echec!!!! le score total est: $score points \n")
    }
}