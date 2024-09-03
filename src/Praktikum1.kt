fun main() {
    // Deklarasi variabel dengan tipe data yang berbeda
    val varByte: Byte = 120
    val varShort: Short = 1000
    val varInt: Int = 12345
    val varLong: Long = 1234567890L
    val varFloat: Float = 3.14F
    val varDouble: Double = 3.14159265359
    val varChar: Char = 'A'
    val varBool: Boolean = true
    val varString: String = " Belajar Kotlin"

    // Contoh penggunaan String Template
    println("Nilai variabel varInt adalah $varInt")
    println("Nilai variabel varDouble adalah ${varDouble * 2}")

    // Mengambil input dari pengguna
    print("Masukkan nama Anda: ")
    val name = readLine()
    println("Halo, $name!")

    // Program Kalkulator Sederhana
    print("Masukkan angka pertama: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Masukkan angka kedua: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0
    println("Hasil penjumlahan $num1 + $num2 = ${num1 + num2}")
}
