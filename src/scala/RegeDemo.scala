package scala

import scala.util.matching.Regex

/**
 * @author lcw332
 *         Date 2020-05-20-16:45
 *         Description:  正则表达式
 **/
object RegeDemo extends App {

  //构建一个正则表达式
  val  pattern1 = "[0-9]+".r
  val  pattern2 = new Regex("[0-9]+")
  //如果正则表达式中含有斜杠或者引号
  val pattern3 = """\s+[0-9]+\s"""

  val mathStr = "99bottles,100bottles"

  //findAllIn返回所有匹配项的迭代器
  for(item <- pattern1.findAllIn(mathStr)){
    println(item)
  }
  //返回首个匹配项
  val first = pattern1.findFirstIn(mathStr)
  println(first)
  //检查字符串的开始部分，是否能匹配
  val ifStartMatch = pattern1.findPrefixOf(mathStr)
  println(ifStartMatch)
  //根据传入的字符串,替换首个匹配项
  val res1 = pattern1.replaceFirstIn(mathStr,"xxx")
  println(res1)
  //使用传入的字符串替换所有的匹配项
  var res2 = pattern1.replaceAllIn(mathStr,"yyyy")
  println(res2)
}
