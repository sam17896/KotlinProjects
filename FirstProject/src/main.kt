/**
 * Created by AHSAN on 7/1/2017.
 */
package demo
fun main(args : Array<String>){
    // Environment Setup
    println("Hello World")


    //Types
    val name = "Derek"
    var myAge = 42

    var bigInt : Int = Int.MAX_VALUE
    var smallInt : Int = Int.MIN_VALUE

    println("Biggest Int : " + bigInt)
    println("Smallest Int : $smallInt")

    var bigLong : Long = Long.MAX_VALUE
    var smallLong : Long = Long.MIN_VALUE

    println("Biggest Long : " + bigLong)
    println("Smallest Long : $smallLong")

    var bigDouble : Double = Double.MAX_VALUE
    var smallDouble : Double = Double.MIN_VALUE

    println("Biggest Double : " + bigDouble)
    println("Smallest Double : $smallDouble")

    var bigFloat : Float = Float.MAX_VALUE
    var smallFloat : Float = Float.MIN_VALUE

    println("Biggest Float : " + bigFloat)
    println("Smallest Float : $smallFloat")

    var dblNum1 : Double = 1.111111111111
    var dblNum2 : Double = 1.111111111111


    println("Sum : " + (dblNum1 + dblNum2))

    if(true is Boolean) {
        println("YUPIEE!!!");
    }

    var letterGrade : Char = 'A'

    println("A is a Char ${letterGrade is Char}")

    //Casting
    println("3.14 to Int : "  + (3.14.toInt()) )
    println("A to Int : "  + ('A'.toInt()) )
    println("65 to char : "  + (65.toChar()) )

    //Strings
    val myName = "Ahsan Sohail"
    val lonStr = """This is a
    long strin """

    var fName : String = "Ahsan"
    var lName : String = "Sohail"

    fName = "Saad"

    var fullName = fName + " " + lName

    println("Name : $fullName")

    println("1 + 2 = ${1+2}")
    println("String lenght = ${lonStr.length}")

    var str1 = "A random string"
    var str2 = "a random string"

    println("String Equal : ${str1.equals(str2)}")
    println("Compare A to B : ${"A".compareTo("B")}")
    println("2nd index : ${str1.get(2)}")
    println("index 2 - 7 : ${str1.subSequence(2,8)}")
    println("Contains random : ${str1.contains("random")}")

    //Arrays
    var myArray  = arrayOf(1, 1.23, "Dog")
    println(myArray[2])

    myArray[1] = 3.14

    println("Array Length : ${myArray.size}")

    println("Dog in Array : ${myArray.contains("Dog")}")

    var partArray = myArray.copyOfRange(0,1)

    println("First : ${myArray.first()}")
    println("Dog Index : ${myArray.indexOf("Dog")}")

    var sqArray = Array(5, {x -> x*x})

    println(sqArray[2])
    var arr2 : Array<Int> = arrayOf(1,2,3)

    //Ranges
    val oneTo10  = 1..10
    val alpha  = "A".."Z"
    println("R in alpha : ${"R" in alpha}")
    val tenTo1 = 10.downTo(1)
    val twoTo20 = 2.rangeTo(20)
    val rng3 = oneTo10.step(3)
    for(x in rng3) println("rng3 : $x")
    for(x in tenTo1.reversed()) println("Reverse : $x")

    

}