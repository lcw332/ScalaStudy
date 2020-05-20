package scala
sealed abstract class Furniture
case class Couch() extends Furniture
case class Chair() extends Furniture

/**
 * @author lcw332
 *         Date 2020-05-20-16:11
 *         Description:  密封类 修饰在类或者特质上
 *        约束：不能在类定义文件之外定义它的子类
 *        作用1：避免滥用继承
 *        作用2：用在模式匹配中
 **/
object SealedDemo {

  def findPlaceToSit(furniture: Furniture):String ={
    furniture match {
      case a:Couch => "lie on the couch"
      case b:Chair => "sit on the chair"
    }
  }
  val chair = Chair()

  def main(args: Array[String]): Unit = {
    println(findPlaceToSit(chair))
  }
}
