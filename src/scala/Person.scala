package org.example

/**
 * @author lcw332
 *         Date 2020-05-20-13:32
 *         Description:  构建实体类 scala会自动生成Get Set方法
 **/
class Person {
  //val 修改的属性，系统会在自动生成Get方法
  val id:String ="1234"
  //自定义Get方法
  def getId():String={
    println("hello")
    this.id
  }
  //var 修饰的属性，系统会自动生成Get/Set方法
  var name:String = ""
  //private var 修饰的属性，系统会自动生成使用private修饰的Get/Set方法
  //相当于私有字段
  private var gender:Int = 0
  //private[this] var 修饰的属性，系统不会生成Get和Set方法
  //自有当前对象可以访问该属性
  private[this] var age:Int = 0

  //  def compare(obj:PersonS):Int ={
  //    this.age=obj.age
  //  }


}

object test{
  def main(args: Array[String]): Unit = {
    var per:Person = new Person()
//    println(per.id)
    println(per.getId())
    per.name=("zhangsan")
    println(per.name)
  }
}
