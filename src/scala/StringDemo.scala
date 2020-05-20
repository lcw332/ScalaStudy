package scala

/**
 * @author lcw332
 *         Date 2020-05-20-16:24
 *         Description:  字符串插值
 **/
object StringDemo {
  def main(args: Array[String]): Unit = {
    //插值器 f s raw
    //s字符串插值器
    val name = "Jerry"
    val res = s"Hello,$name"
    //对${表达式}中的表达式进行计算或转换
    val res1 = s"1+1=${1+1}"
    println(res)
    println(res1)
    //f字符串插值器
    val height = 1.9d
    val name1 = "Tom"
    val res2 = f"$name1 is $height%2.2f meters tall"
    println(res2)
    //raw字符串插值器，类似于s插值器，不对内容做转换
    val str = s"a\nb"
    println(str)
    val str2 = raw"a\nb"
    println(str2)

  }

}
