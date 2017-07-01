/**
 * Created by AHSAN on 7/1/2017.
 */
package demo
fun main(args : Array<String>){
    println("Hello World")

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







}