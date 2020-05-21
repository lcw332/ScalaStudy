package scala

/**
 * @author lcw332
 *         Date 2020-05-21-9:00
 *         Description:  高阶函数
 **/
object FunDemo extends App {
//--高阶函数的概念
  //1.参数是函数
  //2.返回值是一个函数
  //3.参数和返回值都是函数

  //--传入参数是函数
  val arr = Array(1,2,3,4,5)
  val fun = (x:Int) => x*2
  val res = arr.map(fun)
  //传入匿名函数
  val res1 = arr.map((x:Int) => x*2)
  val res2 = arr.map(_*2)
  println(res.toBuffer)

  //--返回值是函数
  def URLBuilder(ssl:Boolean,domainName:String):(String,String) => String ={
    val schema = if(ssl) "https://" else "http://"
    (endPoint:String,queryBody:String) => s"$schema$domainName/$endPoint?$queryBody"
  }

  val domainName = "smart.gantch.com"
  def getUrl:(String,String) =>String = URLBuilder(true,domainName)
  val endPoint = "user"
  val query = "id=1"
  val res3 =getUrl(endPoint,query)
  println(res3)


}
