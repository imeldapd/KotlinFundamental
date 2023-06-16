package fundamental

fun main() {    //Implementasi IF ELSE IF ELSE
    val open = 7
    val now = 7
    if ( now > open){
        print("Toko Tutup!")
    }else if(now == open){
        print("Sebentar")
    }else{
        print("Toko Buka")
    }
}

/*\
IF ELSE, IF ADALAH JIKA DAN ELSE ADALAH KONDISI TERAKHIR JIKA SEMUA KONDISI TIDAK TERPENUHI
IF ELSE IF ELSE, ELSE IF JIKA ADA KONDISI LAIN MISALKAN NOW == OPEN

*IF
fun main() {
    val open = 8
    val now = 7
    if ( now < open){
        print("Toko Tutup!")
    }
}

*IF ELSE
fun main() {
    val open = 8
    val now = 7
    if ( now > open){
        print("Toko Tutup!")
    }else{
        print("Toko Buka!")
    }
}

*MENGINISIALISASI VARIABEL
fun main() {    //Implementasi IF ELSE IF ELSE
    val open = 7
    val now = 7
    val office: String = if ( now > open){
        "Toko Tutup!"
    }else if (now == open){
        "Sebentar"
    }else{
        "Toko Buka"
    }
}

*/