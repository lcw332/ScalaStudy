//package scala
//
///**
// * @author lcw332
// *         Date 2020-05-21-9:53
// *         Description:  隐式函数转换
// **/
//object ImplicitDef extends App {
//  var a:Int = 10
//  var b:Double = 100.99
//
//  //Int源码中有隐式转换成Double的方法
//  b = 100
//  b = a
//  //Double中没有提供隐式成Int的方法
//  //定义一个隐式转换函数，把double转化成Int
//  implicit def doubleToInt(x:Double):Int = x toInt
//
//  //可以编译通过
//  a = b
//  a = 10.99
//  println(a)
//}
