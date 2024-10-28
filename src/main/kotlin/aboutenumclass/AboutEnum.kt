package aboutenumclass

fun main(){
    val aboutEnum = AboutEnum()
    println(aboutEnum.doSomething(Match.T20))
    println(aboutEnum.doSomething(Match.TESTMATCH))
    /*
    there are two things we need to know
    1. about ordinal - > it will return the position of that value
                         let's take an example enum class Month{ January, February, March, April}
                         fun main(){ val sam = Sam()
                         println(sam.hello(Month.January.ordinal)}
                         o/p - 0

    2. about name -> in this we get the name of that value
                       let's take an example enum class Month{ January, February, March, April}
                       fun main(){ val sam = Sam()
                        println(sam.hello(Month.January.name)}
                        o/p - January
     */
}

class AboutEnum {

    fun doSomething(match: Match): String{
      return  when(match){
            Match.TESTMATCH -> {
             "It is a test match"
            }
            Match.T20 -> {
                 "It is a t20 match"
            }
            Match.ONEDAY -> {
                "It is a oneDay match"
            }
            Match.ASIACUP -> {
                  "It is a asiaCup match"
            }
            Match.WORLDCUP -> {
                  "It is a worldCup match"
            }
            Match.CHAMPIONSTROPHY -> {
                  "It is a championsTrophy match"
            }
        }
    }
}

enum class Match{
    TESTMATCH,
    T20,
    ONEDAY,
    ASIACUP,
    WORLDCUP,
    CHAMPIONSTROPHY

}