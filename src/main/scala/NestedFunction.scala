/**
  * Created by Administrator on 25/04/2017.
  */
//Creating simple greater than or lesser than tests
def greater(a:Int, b:Int) = {
  if (a > b) "a is greater than b"
  else if (a < b) "a is not greater than b"
  else "a and b are equal"
}

def lesser(a:Int, b:Int) = {
  if (a < b) "a is less than b"
  else if (a > b) "a is not less than b"
  else "b and a are equal"
}

greater(1,2)
lesser(1,2)

//Creating a function with an function as a paramater
def chooseMethod(a:Int, b:Int, chFn:(Int,Int) => String):String = {
  chFn(a,b)
}

//can choose which test to run when calling the same function
chooseMethod(1,2,greater)
chooseMethod(1,2,lesser)

//Creating a method to use a boolean to decide which method to use
//Could use an if/else clause if more than 2 options are available
def chooseMethodBool(great:Boolean):(Int,Int) => String = {
  if (great == true) greater
  else lesser
}

//using the previous Boolean function to call the tests into a val
val testIfGreater = chooseMethodBool(true)
val testIfLesser = chooseMethodBool(false)

//Testing the created functions in vals
testIfGreater(1,2)
testIfGreater(3,2)
testIfLesser(1,2)

