package scala

/**
 * @author lcw332
 *         Date 2020-05-20-13:48
 *         Description:  构造函数
 **/
//定义一个带有参数的主构造函数
//class ConstructorDemo(var b:Int) {
//如果在这里定义一个带有var的变量，系统认为是个属性
//class ConstructorDemo(b:Int) {
//定义一个私有的主构造函数
class ConstructorDemo private (b:Int) {
  var a:Int = 0
  println("Constructor Study")
  //定义辅助构造函数
//  def this(a1:Int){
//    //首先需要调用主构造函数或者其他辅助函数
//    this()
//    this.a = a1
//  }
  def this (a1:Int,b1:Int){
    this(b1)
    this.a =a1
  }
}
//定义一个带有参数的主构造函数

//类自带有无参的构造函数
//主构造函数会执行类中定义的所有的语句
//分为主构造函数和辅助构造函数(自己定义的)
object ConstructorDemoTest{
  def main(args: Array[String]): Unit = {
//    val obj:ConstructorDemo = new ConstructorDemo
//    val obj:ConstructorDemo = new ConstructorDemo(100)
//    println(obj.a)
  }
}