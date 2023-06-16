package fundamental

fun main(){ //Boolean Dengan Kondisi OR dengan NOT pada print
    val open = 7
    val close = 5
    val now = 23

    val isOpen = now < open || now < close
    print(!isOpen)
}

/**\
 *Versi Tidak Clean Up Code
fun main(){
val open = 7
val close = 5
val now = 23

val isOpen = if (now > open && now < close){
true
}else{
false
}
print(isOpen)
}

 AND : &&
 OR : ||
 NOT : ! digunakan pada print(!isOpen)
 */