package scala

/**
 * @author lcw332
 *         Date 2020-05-20-14:39
 *         Description:  
 **/
abstract class Persons {
  //抽象字段，没有初始化值
   val name:String
  //抽象方法：没有方法体
  def id:Int
  //具体方法
  def smile: Unit={
    println ("persons can smile")
  }
}

class Employ extends Persons{
  val name: String = "jerry"

  def id: Int = {
    name.hashCode
  }

  //重写方法
  override def smile: Unit = {

  }
}

//定义一个接口特质还是抽象类？
//优先使用特质，如果需要传入参数则使用抽象类