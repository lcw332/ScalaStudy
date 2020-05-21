package scala

import java.io.File

import scala.io.Source


//隐式引用
//import java.lang
//import scala
//import scala.Predef
/**
 * @author lcw332
 *         Date 2020-05-21-9:34
 *         Description:  隐式转换
 **/
object ImplicitDemo extends App {

  val a:Int = 1
  println(a)

  val map = Map("a"->1)
  val aa = 1 to 10
  val aaa = 1.to(10)

  //定义隐式类，把File类转自定义的隐式类RichFile
  implicit class RichFile(from:File){
    def read():String = Source.fromFile(from.getPath).mkString
  }

  //使用隐式类，做已有类的功能的扩展
  val contents = new File("src/filetest.text").read
  println(contents)

}
