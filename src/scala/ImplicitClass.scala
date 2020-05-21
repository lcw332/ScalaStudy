package scala



/**
 * @author lcw332
 *         Date 2020-05-21-9:42
 *         Description:  隐式类
 **/
object ImplicitClass extends App {

  //定义一个隐式类
  //定义隐式类只能定义在类、trait、object内部
  implicit class IntWithTimes(x:Int){
    def times[A](f: => A): Unit ={
      //递归方法需要指名其返回类型
      def loop(current:Int):Unit={
        if(current>0){
          f
          loop(current-1)
        }
      }
      loop(x)
    }
  }

  //隐式类的构造函数还能带一个非隐式参数
//  implicit class Indexer[T](collection:Seq[T],index:Int) 不可以
  implicit class Indexer[T](collection:Seq[T])(implicit index:Int)
  //在同一作用域，不能有方法或对象、成员与隐式类同名
//  val IntWithTimes = 10
}
