package fundamental

fun main(){
    val text: String? = null
}

/*\
*Jika ingin sebuah variabel bisa bernilai null
fun main(){
    val text: String? = null
}
Compiler akan mengizinkan karena menambahkan nullable

*Cara mengakses variabel nullable
fun main(){
    val text: String? = null
    if (text != null){
        val length = text.length
        println(length)
    }
}

*/