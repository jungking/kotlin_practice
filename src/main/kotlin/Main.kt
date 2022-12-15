fun main(args: Array<String>) {
    println("Hello World!")

    53 + 62 - 126 //에러 아님
    println(53+62-126)

    //클래스 불러오는 법
    var user = User().some()
    println(user)
    println(User().some())

}

// val topData1:Int //error - 최상위 변수 초기화 해야함

class User{
    // val objData1: String // 클래스 멤버 변수 초기화 해야 함

    fun some(){
        val localData1: Int //ok
        val localData2: String //ok

        // println(localData1) // 초기화 하고 사용해야함

        localData2 = "hello"
        println("hello")
    }
}
