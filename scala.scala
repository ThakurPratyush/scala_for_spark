// Databricks notebook source
//variable declaration
//var and val 
var y:Int = 10
var x = 10
//reassignment of var
x =20

// COMMAND ----------

// val immutable
val y = 20 
y= 10
val y:Int = 20

// COMMAND ----------

var b:String = "test"
var c = "String double quote"
var d ='A'
//char single quotes

// COMMAND ----------

// default float
var c:Double = 43.55
var d:Float = 46.77

// COMMAND ----------

var c = 455.66
//specifically specifying the float
var d:Float = 44.55F   //f can also be used

//long 
var e:Long = 4455
//if we speicify directly it is taken as Int
var f = 3435
//using L helps
var z = 344L

// COMMAND ----------

//boolean
var g:Boolean = true
var f = true
var z = "true"

// COMMAND ----------

var k:Boolean ="true"

// COMMAND ----------

//conditional statements (if else)
var age = 45

// COMMAND ----------

if(age < 10) 
{println("kid")
}
else 
{
println("adult")}

if(age > 13 && age <= 19 )
print("kid")
else if(age >19 && age <=45 )
println("adult")
else
print("senior")

// COMMAND ----------

// to and until
//immutable ranges
println(1 to 10)
print(1 until 10)

// COMMAND ----------

//range with increment steps
val data = (1 to 30 by 3)
//printing each element
data.foreach(println)

// COMMAND ----------

//decrement
println(30 to 1 by -3)
print(30 until 4 by -3)

// COMMAND ----------

object Helloworld
{
  def main(args: Array[String])
  println("Hello scala")
}
//compile Helloworld.scala
//scala Helloworld

// COMMAND ----------

// while loop
var a = 10;
while(a<20)
{
  println("value of a" + a)
  a =a+1
}

// COMMAND ----------

//do  while loop
var a = 10;
do{
  println("value of a" + a)
  a =a+1
}while(a<20)

// COMMAND ----------

//generator operator <-
var a = 5
for(a <- 1 to 10)
{
  println(a)
}
//using until 
for(a <- 1 until 11)
println(a)

// COMMAND ----------

  //loop over list
var Names = List("Pratyush","Ishu","Me","fullof")
var ranks = List(12,13,15,17,18)
var profits = List(12.5,55.6,79.8)
var misc = List("aks","stl",'a',234,45.67,34555l,455.788F,3444.55)

// COMMAND ----------

for( a <- misc){
  println("element " +a)
}

// COMMAND ----------

var numlist = List(1,2,3,4,5,6,7,8,9,10,11,12)
for(a <- numlist if a !=3;if a < 8)
println(a)
// filter with loop

// COMMAND ----------

// field
// getting one loop result to other
var yield_list = for{a <- numlist if a!=3 ; if a<8}yield a
for(a <- yield_list if a!= 2)
println(a)

// COMMAND ----------

//type conversion
var x = 10
x.toString
x.toDouble
x.toLong
x.toBoolean

// COMMAND ----------

var y = "true"
y.toBoolean
var z = "TruE"
z.toBoolean
var r = 14.56
r.toInt

// COMMAND ----------

//closure function
var func = (x:Int,y:Int) => x+y

// COMMAND ----------

println("result of fun "+func(3,4))

// COMMAND ----------

var func1 = (x:String) => x+ '\t' +x.reverse

// COMMAND ----------

println("Rsult "+ func1("cay"))
println("Rsult "+ func1("123"))
//would return error since string required
// println("Rsult "+ func1(123))
// println("Rsult "+ func1())
//returns error

// COMMAND ----------

var func2 = (x:Int,y:Double,z:Int) => x+y*z

// COMMAND ----------

print("Result of eq: "+func2(3,4,5))
print("Result of eq: "+func2(3.9,4,5))

// COMMAND ----------

//conversion of function output
var func3 = (x:Int,y:Double,z:Int) => (x+y*z).toInt
var func4 = (x:Int,y:Double,z:Int) => (x+y*z).toString
println("result : "+func3(3,4.6,6))
println("result : "+func4(3,4.6,6))

// COMMAND ----------

var fun5 = (a:Int) => a + "|" + (a*a) + "|" + (a*a*a)
print(fun5(3))

// COMMAND ----------

//higher order function foreach(),map(),reduce()

//foreach
val courses = List("hadoop","spark","vls")
courses.foreach( (c:String) => (println(c)) )

val misc = List("azc","qwerty",12,1234.56,'a')
misc.foreach(println)

misc.foreach( (a:Any)=>println(a))

// COMMAND ----------


var file = List(1 to 10)
file.foreach(println)

val file2 = List(1 until 10)
file2.foreach(println)

// COMMAND ----------

//Map() function
var data = List("pratyush","thakur")
//data.map(x => x.length)
data.map(x => x.length).foreach(println)


// COMMAND ----------

var ranks = List(12,23,45,55,243,11)
ranks.map(x => (x, x*x , x*x*x)).foreach(println)

// COMMAND ----------

data.map(x => x + " "+x.length+ " "+ x.reverse).foreach(println)
// name , length and reverse
//string along with 1 , like we used in reducer
data.map(x => (x,1)).foreach(println)

// COMMAND ----------

//reduce funtion applies operation taking 2 inputs a time
var ranks = List(1,4,5,6,7)
ranks.reduce((x:Int, y:Int)=> (x+y) )
ranks.reduce((x,y) => x+y)
ranks.reduce(_+_)
//does not allow moere than 2 
ranks.reduce(((x,y),z) => (x+y)+z )  // gives error
ranks.reduce(x,y => x+y) // also error

// COMMAND ----------

var marks:List[Int] = List(12,34,45,44,32,67,8,9,88)
var marks_same = List(12,35,55,65,43,44,32,67)

var name:List[String] =  List("prat","yush","Tha","Kur")
var name_same = List("prat","yush","Th","Akur")

// COMMAND ----------

println(name_same(3))
//accessing list elements
println(name.head)
println(name.last)
println(name.tail)

// COMMAND ----------


name.isEmpty
println(name.length)
println(name.size)
println(name.reverse)
println(name)
//update the list updated function
name.updated(0,"abcd") // does not reflect in original if not assigned


// COMMAND ----------

//partition function -> takes data into 2 parts based on fn provided
var ranks = List(123,4,3,56,77,98,34)
ranks.partition(_%2 ==0) 

// COMMAND ----------

// zip function
var city = List("Hyd","Bang","chn","mum")
var state = List("Ts","kh","mh","kh","goa","mp","dl","up")
var rating =List(12,23,345,45,44,66,78,9,0)
var zipdata = city.zip(state)
city.zip(state).foreach(println)

// COMMAND ----------

var zip_data2 = city.zip(state).zip(rating)
zip_data2.foreach(println)

// COMMAND ----------

println(zip_data2(0))
println(zip_data2(0)_1)

// COMMAND ----------

//conveting to map
println(zipdata.toMap)
println(zipdata.toMap.keys)
println(zipdata.toMap.values)

// COMMAND ----------

// cannot add or remove items to a list
data += "FFF" // SAYS THAT only list can be combined then how to add or remove values


// COMMAND ----------

// mutable lists actually ListBuffer
import scala.collection.mutable.ListBuffer

// COMMAND ----------

var name = ListBuffer("class", "gfg", "geeksforgeeks")
println(name)
name+="FFF"
print(name)

// COMMAND ----------

//currying function
//multiple args taken into chain of functions ,each taking a single paramter
def strcat(s1:String)(s2:String) = s1 +s2
strcat("ab")("fb")

// COMMAND ----------

def func1(x:Int)(y:Int) = x+y

// COMMAND ----------

println("Output is : " + func1(10)(20))

// COMMAND ----------

//parially function using Curring  function 
def cufun(x:Int)(y:Int)(z:Int) = x+y*z
// if we dont want to pass all the three parameters we can pass '_'
var newdata = cufun(2)(4)(_)
//last parameter can be passed to variable 
println(newdata(4))

// COMMAND ----------

var ranks = List(1,23,45,44,66,89)
println(ranks.length)
println(ranks.size)
//set

var name = Set("GK","GK","GK","GK","GK","Channel","Channel","Abhiram","abhiram")
println(name)
println(name.size)
//println(name.length)  //length does not work in set
println(name.head)
println(name.tail)
println(name.last)

// COMMAND ----------

name.updated(0,"new_entry") //set by default immutable 

// COMMAND ----------

// adding multiple sets together 
var city = Set("hyd","bAN","chn","mum")
var state = Set("ts","ks","th","ml")
var rating = Set(12,14,15,77,89,99)
city ++ state ++ rating

// COMMAND ----------

city.++(state).++(rating)

// COMMAND ----------

// zip is exaclty same as list
// set operations
var ranks = Set(5,6,20,30,45,1)
var ranksnew = Set(1,3,4,54,121)
println("max from set" + ranks.max)
println("min form set"+ ranks.min)
println(ranks.intersect(ranksnew))

// COMMAND ----------

// as scene by default set is immutable 
// but can be made mutable 
import scala.collection.mutable.Set

// COMMAND ----------

var names = Set("aaa","bbb","ccc")
names += "GGG"

// COMMAND ----------

//SCALA MAPS
var mapex = Map("prat" -> 34,"thakur"->45,"k" -> 90,"s"->687)
mapex.foreach(println)
mapex.keys.foreach(println)
mapex.values.foreach(println)

// COMMAND ----------

mapex.values.max
mapex.keys.min
//uses ascii for alphabets

// COMMAND ----------

var nameage = Map("p"-> 45, "p"->44 ,'p'->45,"tr"->44,"tr"->24)
// repeating values are not taken // for p string one the value 44 is taken and for p char 45 is taken 

// COMMAND ----------

//pattern matching
var tech = List("Linux","Windows","R","Scala","Rndom")
for(t <- tech){
t match{
  case "Windoes" | "Linux" => println("os")
  case "Scala"| "R" => println("language")
  case _ => println("None")
}
}

// COMMAND ----------

//in scala in an object only we create main fn
object obj{
  def main(args: Array[String]):Unit =
  {
    println("hello")
  }
}


// COMMAND ----------

// we can also create object by extending from app which is a default trait that has definition of main fn in it
object obj2 extends App
{
  println("hello")
}

// COMMAND ----------

// if we need to our definition of main function then we need to override exsisting function
object exapp extends App{
  println("default fn")
  override def main(args: Array[String]): Unit =
  {
    println("override ")
  }
}

// COMMAND ----------

// method overloading 
class mehtod_overload
{
  def avg(x:Int,y : Int){
    var av = (x+y)/2
    println("avg of 2 numbers is : "+av)
  }
  def avg(x : Int, y:Int,z : Int){
    var av = (x+y+z)/3
    println("3 numbers : "+av)
  }
}
object method_over extends App{
  var over = new mehtod_overload()
  over.avg(3,4)
  over.avg(4,5,6)
}

// COMMAND ----------

// no static concept but 
//Singelton object 
// no object reuired to call methods inside the class
object single_Ex
{
  def main(args: Array[String]) :Unit=
  {
    Hello.sum(2,4,6)// without object creation we can call 
    Hello.setName("sddsds")
  }
}
// singelton object 
object Hello
{
  def sum(x:Int,y:Int,z:Int){
    println("sum = " + (z+y+x))
    println("Name inside this object set by the function from single_Ex class " + this.name)
  }
  var name = "default name "
  def setName(x :String){
    this.name =x 
  }
}
// when we excute the name printed would be : sddsds

// COMMAND ----------

println("name")
println("$name")
// using string as variable 
// string interpolator
var name = "interpol"
println(s"$name")
var temp = 14.54f
println(f"$temp" 
|)
//f->formatted skills

// COMMAND ----------

  var name = "name_name"
  print(s"Hello $name")

// COMMAND ----------

val temp = 44.5343d
println(f"$temp")
val city = "hyd"
println(f"In $city%s has temp $temp%2.2f")

// COMMAND ----------

// higher order fn 
object high_ord{
  def main(args:Array[String]):Unit ={
    var ranks= List(1,2,3,4,5)
    println(ranks.reduce(_+_))
  }
}

// COMMAND ----------


