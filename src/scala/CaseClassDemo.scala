package scala

/**
 * @author lcw332
 *         Date 2020-05-20-15:18
 *         Description:  样例类
 **/
object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    //定义样例类
    //默认带有apply方法
    //构造函数默认是public val修饰的
    case class Message(sender:String,recipient:String,body:String)

    //创建样例类的对象
    val message1 = Message("Jerry","Tom","Hello world")
    println(message1.sender)
//    message1.sender = "kate"
    //样例类的比较，基于值或者结构比较，而不是基于引用比较
    val message2 = Message("Jerry","Tom","Hello world")
    if(message1 == message2) println("same")
    else println("different")

    //样例类的copy
    val message3 = message1.copy()
    println(message3.sender+":"+message3.recipient+":"+message3.body)
    if(message1 == message3) println("true")
    else println("false")
    //不完全拷贝，对部分参数赋值
    val message4 = message1.copy(sender = "Bill")
    println(message4.sender+":"+message4.recipient+":"+message4.body)

  }
}
