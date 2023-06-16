package fundamental

fun main(){
    val text = "Semarang"
    val tahun = 2022
    println("Saya Kuliah di $text pada tahun $tahun")

    val open = 7
    println("Toko Sekarang adalah ${if (open > 7) "buku" else "tutup"} ")
}


/*\
*Expression dengan String Template
fun main(){
    val open = 7
    print("Toko Sekarang adalah ${if (open > 7) "buku" else "tutup"} ")
}

*/