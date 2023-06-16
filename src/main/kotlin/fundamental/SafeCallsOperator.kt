package fundamental

fun main(){
    val text: String? = null
    print(text?.length)
}

/*\
*Elvis Operator (?:) Dipakai Untuk memberi nilai default dari sebuah variabel
fun main() {
    val text: String? = null
    print(text?.lenth:7)
}

*Non-Null Assertion(!!) Tidak direkomendasikan, karena terlalu memaksa sebuah variabel agar null
fun main(){
    val text: String? = null
    print(text!!.length)
}
*/