//package scala
//
///**
// * @author lcw332
// *         Date 2020-05-20-14:45
// *         Description:  特质
// **/
//
////定义一个带有抽象方法的特质
//trait Iterator[A]{
//  def hasNext:Boolean
//  def next():A
//}
//
////定义一个带有实现的特质
//trait ConsoleLogger{
//  def log(msg:String) :Unit = {
//    println(msg)
//  }
//}
//
////定义一个类，实现一个特质
//class IntIterator(to:Int) extends Iterator[Int] with ConsoleLogger {
//  private var current = 0
//  override def hasNext: Boolean = {
//    current < to
//  }
//  override def next(): Int = {
//    if (hasNext){
//      log("hasNext Begin")
//      var t = current
//      current += 1
//      t
//    } else {
//      0
//    }
//  }
//}
//
//
//object TraitTest {
//  def main(args: Array[String]): Unit = {
//    val iterator = new IntIterator(10)
//    println(iterator.next())
//    println(iterator.next())
//    println(iterator.next())
//  }
//}
