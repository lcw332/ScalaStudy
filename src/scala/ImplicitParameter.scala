package scala

/**
 * @author lcw332
 *         Date 2020-05-21-10:05
 *         Description:  隐式参数
 **/
object ImplicitParameter extends App {
  //定义一个特质，带有一个抽象方法
  trait Adder[T]{
    def add(x:T,y:T):T
  }

  //创建一个隐式对象
  implicit val a = new Adder[Int] {
    override def add(x: Int, y: Int): Int = x+y
  }

  //定义了一个带有隐式参数的方法
  def addTest(x:Int,y:Int)(implicit adder:Adder[Int]) = {
    adder.add(x,y)
  }

  println(addTest(1,2))
  println(addTest(1,2)(a))


}
