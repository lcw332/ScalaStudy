//package scala
//
//import java.util.Date
//
///**
// * @author lcw332
// *         Date 2020-05-20-14:56
// *         Description:  特质可以为我们的类提供可以堆叠的改变
// **/
//
//trait Logger{
//  def log(msg:String)
//}
//
////子特质 实现父特质里的抽象方法
//trait ConsoleLogger extends Logger {
//  override def log(msg: String): Unit = println(msg)
//}
//
////特质为日志加上时间戳
//trait TimestampLogger extends ConsoleLogger{
//  override def log(msg: String): Unit = println(s"${java.time.Instant.now()}$msg")
//}
//
////如果日志过长，对日志进行截断显示
//trait ShortterLogger extends ConsoleLogger{
//  val maxLength = 15
//  override def log(msg: String): Unit = super.log{
//    if (msg.length <= maxLength) msg
//    else s"${msg.substring(0,maxLength-3)}..."
//  }
//}
//
//
//class Account {
//  protected var balance:BigDecimal =0.0
//}
//
//class SavingAccount extends Account with ConsoleLogger {
//  def withDraw(amount:Double): Unit ={
//    if (amount > balance) log("Insufficent funds")
//    else balance = balance - amount
//  }
//}
//
//
//object TraitTest2 {
//  def main(args: Array[String]): Unit = {
////    val acc1 = new SavingAccount with ConsoleLogger with TimestampLogger with ShortterLogger
////    val acc2 = new SavingAccount with ConsoleLogger with ShortterLogger with TimestampLogger
////    acc1.withDraw(100.00)
////    acc2.withDraw(100.00)
//    var acc1 = new SavingAccount with ConsoleLogger with TimestampLogger
//    acc1.withDraw(100.00)
//    var acc2 = new SavingAccount with ConsoleLogger with TimestampLogger
//    acc2.withDraw(100.00)
//    var acc3 = new SavingAccount with ConsoleLogger with ShortterLogger
//    acc3.withDraw(100.00)
//
//  }
//
//
//}
