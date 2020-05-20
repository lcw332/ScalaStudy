//package scala
//
///**
// * @author lcw332
// *         Date 2020-05-20-13:59
// *         Description:  注意：1.单例对象不能带参数
// *                            2.单例对象只有第一次调用时才会进行初始化
// **/
////object代表单例对象
////等同于java 中的static
////可以看作为Java中的工具类，可以定义工具函数和常量
////适用于存放常量
//object Logger {
//  def log(msg:String):Unit = {
//    println(s"Info:$msg")
//  }
//}
//
//class Test{
//  def method={
//    Logger.log("world")
//  }
//}
//
//object LoggerTest{
//  def main(args: Array[String]): Unit = {
//    Logger.log("Hello")
//    val obj:Test = new Test
//    obj.method
//  }
//}
