package scala

/**
 * @author lcw332
 *         Date 2020-05-20-16:18
 *         Description:  Option
 **/
object OptionDemo {
  def main(args: Array[String]): Unit = {
    val map = Map("a"->1,"b"->2)
//    println(map("a"))
//    println(map("c"))
    //返回值不确定时使用Option
    val a:Option[Int] = map.get("a")
//    println(map.getOrElse("c",0))
    println(a)
  }
}
