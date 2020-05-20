package scala

/**
 * @author lcw332
 *         Date 2020-05-20-14:24
 *         Description:  继承
 **/
class Point(val xc:Int,val yc:Int) {
  var x:Int = xc
  var y:Int = yc

  def move(dx:Int,dy:Int): Unit ={
      x = y+dx
      y = x+dy
    //打印移动后的坐标
    println("x 坐标:"+x)
    println("y 坐标:"+y)
  }
}

//继承了父类的所有属性和方法
//重写父类的非抽象方法，要用override关键字
//重写父类的抽象方法，选择使用override关键字
//final修饰的类，方法，属性，不能继承
class Location(override val xc:Int, override val yc:Int, val zc:Int) extends Point(xc,yc){
  var z:Int = zc

  def move(dx:Int,dy:Int,dz:Int): Unit ={
    x = x + dx
    y = y + dy
    z = z + dz
    //打印移动后的坐标
    println("x 坐标:"+x)
    println("y 坐标:"+y)
    println("z 坐标:"+z)
  }
}
object testClass{
  def main(args: Array[String]): Unit = {
    val obj1 = new Point(2,3)
    val obj = new Location(5,6,7)
    obj.move(1,2,3)
    //判断对象是否属于给定的类
    println(obj.isInstanceOf[Location])
    //类型转换
    obj.asInstanceOf[Point]
    //获取类的信息
    println(classOf[Location])
  }
}
