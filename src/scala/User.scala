package scala

/**
 * @author lcw332
 *         Date 2020-05-20-14:13
 *         Description:  
 **/
class User (val name:String,val password:String){

}

//伴生对象
object User{
  def apply(name: String, password: String): User = new User(name, password)
  def unapply(arg: User): Option[(String, String)] = {
    if (arg ==null){
      None
    } else{
      Some(arg.name,arg.password)
    }
  }
}

object userTest{
  def main(args: Array[String]): Unit = {
//    val obj = new User("zhangsan","123")
    //相当于调用伴生对象里的apply方法
    val obj = User("zhansan","123456")
    //返回布尔 判断obj是否是User这个对象
//    println("result:"+obj.isInstanceOf[User])
//    var arr = Array(1,2,3,4)
    obj match {
      case User(name,password) => println(name+":"+password)
      case _ => println("None")
    }
  }
}