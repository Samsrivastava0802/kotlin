package scopefunction

fun main(){
//   val gun = Apply()
//    gun.hi()
//    println(gun.rat)

    Apply().apply {
        hi()
        println(rat)
    }
}
class Apply {
     var rat : String = "hi rishi"
     fun hi(){
      println("hello")
    }

}
