fun main(args: Array<String>) {
    val myName: String = "Siti Nazwa Amanda"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    val s = "abc" + 1
    println(s + "naz")

    var text = """ 
        for (c in "foo")
            print(c)
    """
    println(text)


}