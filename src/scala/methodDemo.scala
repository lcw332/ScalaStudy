package scala

/**
 * @author lcw332
 *         Date 2020-05-21-9:26
 *         Description:  方法的嵌套和多态
 **/
object methodDemo extends App {
  //方法的嵌套：方法体里面定义其他嵌套
  //阶乘
  def fatorial(x:Int) :Int = {
    def fact(x:Int,accumulator:Int):Int ={
      if (x <= 1) accumulator
      else fact(x-1,x*accumulator)
    }
    fact(x,1)
  }
  println("factorial of 5:" + fatorial(5))

  //方法的多态:方法可以通过类型实现参数化,类似Java中的泛型
  def listOfDuplications[A](x:A,length:Int):List[A] ={
    if (length < 1)
      Nil
    else
      x::listOfDuplications(x,length-1)
  }

  println(listOfDuplications[Int](3,5))
  //隐式，参数类型是不确定的
  println(listOfDuplications("ss",10))

}
