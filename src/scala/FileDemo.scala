package scala

import java.io.PrintWriter

import scala.io.Source

/**
 * @author lcw332
 *         Date 2020-05-20-16:31
 *         Description: 文件操作
 **/
object FileDemo extends App {
//   //读取文件行
//  val source = Source.fromFile("src/filetest.text")
//  //获取文件行迭代器
//  val lines = source.getLines()
//  for (line <- lines){
//    println(line)
//  }
//  //关闭源
//  source.close()

  //--读取文件的字符
//    val source = Source.fromFile("src/filetest.text")
//    val iter = source.buffered
//    var sum = 0
//    while (iter.hasNext){
//      if (iter.head == 'A'){
//        sum = sum + 1
//      }
//      println(iter.next())
//   }
//  //打印符合条件的字符统计结果
//  println("sum:"+sum)
//  //关闭源
//  source.close()

  //--读取网络文件
//  val source = Source.fromURI("http://1000phone.com")
//  val lines = source.getLines()
//  for (line <- lines){
//    println(line)
//  }
//  //关闭源
//  source.close()

  //--写文件
  val out = new PrintWriter("fileResult.text")
  for(i <- 1 to 100){
    out.println(i)
  }
  out.close()

}
