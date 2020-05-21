package scala

/**
 * @author lcw332
 *         Date 2020-05-21-9:18
 *         Description:  柯里化
 **/
object CurryDemo extends App {
  //柯里化是把接收多个参数的函数变成接收一个单一参数的函数，返回一个接收余下参数的新函数

  //创建一个普通的函数
  def add(x:Int,y:Int) ={
    x+y
  }
  println(add(1,2))
  //柯里化后的方法
  def curryAdd(x:Int)(y:Int) = x+y
  println(curryAdd(1)(2))


  //模拟柯里化的实现过程
  def first(x:Int) = (y:Int) => x+y
  val second = first(1)
  val res = second(2)
  println(res)


  val one = curryAdd(1)_
  println(one(2))

  val two = curryAdd(2)_
  println(two(2))

  val  list =  List(1,2,3,4)
  println(list.foldRight(0)(_+_))

}
