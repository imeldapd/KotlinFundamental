package fundamental

fun main(){ //Array Unik dengan beberapa tipe variabel di dalamnya
    val array= arrayOf(1, "Undip", 2.3, false)
    println(array[0])
}

/*\
Type Primitive Pada Array
Array khusus untuk menyimpan satu jenis variabel misal integer atau string atau lainnya

fun main(){
    val array = intArrayOf(1,2,3)
    println(array[1])
}

*Type Primitive Pada Array
intArrayOf() : IntArray
booleanArrayOf() : BooleanArray
charArrayOf() : CharArray
longArrayOf() : LongArray
shortArrayOf() : ShortArray
byteArrayOf() : ByteArray

Get() dan Set() elemen pada array kotlin
Get = Untuk mendapatkan indexing
Set = Untuk merubah isi dari array

fun main() {
        val array = arrayOf("Undip", "Unnes", "Udinus", "Semarang")
        //get()
        println(array.get(0))
        println(array.get(2))
        //set()
        array.set(0, "UGM")
        println(array.get(0))
}
Outputnya :
Undip
Udinus
UGM

*Get Set Yang Lebih Rapi
fun main() {
        val array = arrayOf("Undip", "Unnes", "Udinus", "Semarang")
        //get()
        println(array[2])
        println(array[1])
        //set()
        array[1] = "UGM")
        println(array[1])
}

*Mendapatkan Panjang Array
fun main(){
    val array = arrayOf("Undip", "Unnes", "Udinus", "Semarang")
    println("Panjang Array adalah " + array.size)
}
Outputnya : Panjang Array adalah 4

*Looping Pada Array
fun main(){
    val array = arrayOf("Undip", "Unnes", "Udinus", "Semarang")
    for ( item in array){
        println(item)
     }
}

*Bermain Kondisi Pada Array
fun main(){
    val array = arrayOf("Undip", "Unnes", "Udinus", "Semarang")
    if ( "ugm" in array){
        print("yeay, ada ni!")
    } else {
        print("gaada :(")
}
Outputnya : gaada :(

*Menampilkan elemen yang berbeda pada array
fun main(){
    val array = arrayOf("Undip", "Unnes", "Udinus", "Semarang")
    val distinct = array.distinct()
    for (item in distinct) {
    println(item)
    }
}

*Dropping Elemen Pada Array | Drop biasa | Mencetak dari index ke berapa
fun main(){
    val array = arrayOf("Undip", "Unnes", "Udinus", "Semarang", "Undip")
    for ( item in array.drop(n:2)) {
        println(item)
    }
}

*Drop Last (Jika index yang dipilih 2 maka akhir percetakannya = 2)
fun main(){
    val array = arrayOf("Undip", "Unnes", "Udinus", "Semarang", "Undip")
    for ( item in array.dropLast(n:2)) {
        println(item)
    }
}

*Mengecek elemen pada array
fun main(){
    val array = arrayOf("Undip", "Unnes", "Udinus", "Semarang")
    print("apakah array kosong?: " + array.isEmpty())
}
*/