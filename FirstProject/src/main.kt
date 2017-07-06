/**
 * Created by AHSAN on 7/1/2017.
 */
package demo

import java.util.Random

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

    //Conditions

    val age = 8
    if(age < 5){
        println("Go to PreSchool")
    } else if (age==5){
        println("Go to Kindergarten")
    } else if ((age > 5) && (age<=17)){
        val grade = age - 5
        println("Go to Grade $grade")
    } else {
        println("Go to College")
    }

    when (age){
        0,1,2,3,4 -> println("Go to PreSchool")
        5 -> println("Go to Kindergarten")

        in 6..17 -> {
            val grade = age-5
            println("Go to Grade $grade")
        }

        else -> println("Go to College")

    }

    //looping
    for(x in 1..10){
        println("Loop : $x")
    }

    val ran = Random()
    val MagicNum = ran.nextInt(50) + 1

    var guess = 0

    while(MagicNum != guess){
        guess +=1

    }

    println("Magic Number was : $guess")

    for(x in 1..20){
        if (x % 2 == 0){
            continue
        }

        println("Odd : $x")

        if(x == 15) break
    }

    var arr3 : Array<Int> = arrayOf(3,6,9)

    for(i in arr3.indices){
        println("Mult 3 : ${arr3[i]}")
    }

    for((index,value) in arr3.withIndex()){
        println("Index : $index Value : $value")
    }

    //Functions

    fun add(num1 : Int, num2: Int) : Int = num1 + num2
    println("5 + 4 = ${add(5,4)} " )

    fun sub(num1 : Int = 1, num2: Int = 1) = num1 - num2
    println("5 - 4 = ${sub(5,4)} " )

    println("4 - 5 = ${sub(num2=5, num1= 4)}")

    fun sayHello(name: String) : Unit = println("Hello $name")

    sayHello("Ahsan")

    val (two,three) = nextTwo(1)

    println(two)
    println(three)


    println("Sum: ${getSum(1,2,3,4,5)}")

    val multiply = {num1 : Int , num2 :Int -> num1 * num2}

    println("5 * 3 = ${multiply(5,3)}")

    //Recursion
    println("5! = ${fact(5)}")


    //Higher Order Function
    val numList = 1..20
    val eventList = numList.filter{ it % 2 == 0}
    eventList.forEach{ n-> println(n) }


    val mult3 = makeMathFunc(3)

    println("5 * 3 = ${mult3(5)}")

    val multiply2 = {num1 : Int -> num1 * 2}

    val numList2 = arrayOf(1,2,3,4,5)

    mathonList(numList2, mult3)


    //Collections
    val numList3 = 1..20

    val listSum = numList3.reduce {x ,y -> x + y}
    println("Reduce Sum : $listSum")

    val listSum2 = numList3.fold(5) {x ,y -> x + y}
    println("Fold Sum : $listSum2")


    println("Evens: ${numList3.any{it%2==0}}" )
    println("Evens: ${numList3.all{it%2==0}}" )

    val big3 = numList3.filter {it > 3}

    big3.forEach{n-> println(">3 :$n")}
    val times7 = numList3.map{it * 7}
    times7.forEach{n-> println("*7 : $n")}

    //Exception Handling

    val divisor = 2

    try {
        if (divisor == 0){
            throw IllegalArgumentException("Can't Divide By zero")
        } else {
            println("5 / $divisor= ${5/divisor}")
        }
    } catch (e : IllegalArgumentException) {
        println("${e.message}")
    }


    //List

    var list1 : MutableList<Int> = mutableListOf(1,2,3,4,5)
    val list2 : List<Int> = listOf(1,2,3,4,5)

    list1.add(6)
    println("1st : ${list1.first()}")
    println("last : ${list1.last()}")
    println("2nd : ${list2[2]}")

    var list3 = list1.subList(0,3)

    println("Length : ${list1.size}")

    list3.clear()
    list1.remove(1)
    list1.removeAt(2)

    list1.forEach{n->println("Mutable List : $n")}

    //Maps
    val map = mutableMapOf<Int,Any?>()
    val map2 = mutableMapOf(1 to "Doug", 2 to 25)

    map[1] = "Derek"
    map[2] = 42

    println("Map Size :  ${map.size}")

    map.put(3, "Pittsburgh")
    map.remove(2)

    for((x,y) in map){
        println("Ket: $x Value : $y")
    }



}

fun nextTwo(num : Int) : Pair<Int,Int> {
    return Pair(num+1, num+2)
}
fun getSum(vararg nums : Int) : Int {
    var sum = 0
    nums.forEach { n -> sum += n }

    return sum
}

//Recursion
fun fact(x : Int) : Int {
    tailrec fun factTail(y:Int, z : Int) : Int {
        if(y==0) return z
        else return factTail( y-1, y*z)
    }

    return factTail(x,1)
}


//Higher Order Function

fun makeMathFunc(num1 : Int) : (Int) -> Int = {num2 -> num1 * num2}

fun mathonList(numList : Array<Int> , myFunc: (num: Int) -> Int){
    for(num in numList){
        println("MathOnList: ${myFunc(num)}")

    }
}