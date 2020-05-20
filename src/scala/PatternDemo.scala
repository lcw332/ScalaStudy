package scala

/**
 * @author lcw332
 *         Date 2020-05-20-15:27
 *         Description:  
 **/
object PatternDemo {
  def main(args: Array[String]): Unit = {
    //常量模式匹配
    //常量字面值的匹配
//    val site = "gantch.com"
//    site match {
//      case "gantch.com" =>{
//        println("success")
//      }
//        //相当于Java中的default，不然会报异常
//        //匹配完成则不往下走，不需要break关键字
//      case _ => println("fail")
//    }
    //--常量变量的匹配
//    val site = "gantch.com"
//    val GANTCH = "gantch.com"
//    val gantch = "gantch.com"
//    //匹配常量必须用大写
//        site match {
//          case GANTCH=>{
//            println("success")
//          }
//            //相当于Java中的default，不然会报异常
//            //匹配完成则不往下走，不需要break关键字
//          case _ => println("fail")
//        }

    //--变量模式匹配
//    val site = "gantch.com"
//    val gantch = "gantch.cn"
//    //匹配常量必须用大写
//    site match {
//      case gantch=>{
//        println(gantch+"\nsuccess")
//      }
//      //相当于Java中的default，不然会报异常
//      //匹配完成则不往下走，不需要break关键字
//      case _ => println("fail")
//    }

    //--通配符模式匹配
    val list = List(1,2,3)
    list match {
        //占位符
      case List(_,_,3) =>{
        println("success")
      }
      case _ => println("fail")
    }



  }

}
