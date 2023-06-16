package fundamental

fun main() {    //Fungsi Utama
    val user = setUser( name= "Imelda", age=20)
    println(user)
    user( name = "Guna Darmawan")
}
fun setUser(name: String, age: Int) = "Your name is $name, and your age is $age"    //Expression Body

fun user(name: String){
    println("Your name is $name")

}

/*\Struktur Dasar Penulisan Function
fun functionName(param1: type1, param2:type2, ...): ReturnType{
    return result

*Untuk memepermudah developer memecah program agar tidak terlalu banyak

*Sample Penulisan Function
fun setUser(name: String, age: Int): String {
    return ("Your name is $name and your age is $age")
}

*String yang tidak didalam kurung merupakan tipe kembalian

*Sample Penulisan Function Diubah Ke Expression Body (Penulisan Yang Lebih Singkat)
fun setUser(name: String, age: Int): String = ("Your name is $name and your age is $age")

*Expression Body tanpa String
fun setUser(name: String, age: Int) = ("Your name is $name and your age is $age")

*Tipe Kembalian Unit Tanpa return
fun setUser(name: String, age: Int): Unit{
    print("Your name is $name and your age is $age")
}

*Unit nya tidak perlu ditulis
fun setUser(name: String, age: Int){
    print("Your name is $name and your age is $age")
}
* */