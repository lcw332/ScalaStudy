package scala

/**
 * @author lcw332
 *         Date 2020-05-21-9:11
 *         Description:   闭包
 **/
object FunDemo1 extends App {
  //闭包是一个函数，函数的返回值依赖于函数外部的一个或者多个变量

  val multiply = (x:Int) => {x*5}
  var factor =5
  val multiply2 = (x:Int) => {
    x*factor
  }
  println(multiply2(10))
  factor = 10
  println(multiply2(10))

  val multiply3 = (x:Int) => {
    factor = factor + 10
    x*factor
  }
  println("factor:"+factor)
  println(multiply3(10))
  println("factor:"+factor)

}
