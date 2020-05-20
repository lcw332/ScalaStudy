package scala

import scala.util.Random

/**
 * @author lcw332
 *         Date 2020-05-20-15:38
 *         Description:  模式匹配2
 **/
object PatternDemo2 {
  def main(args: Array[String]): Unit = {
    //信息甄别
    abstract class Notification
    //定义不同的信息样例类
    case class Email (sender:String,title:String,body:String) extends Notification
    case class SMS(caller:String,msg:String) extends Notification
    case class VoiceRecording(concatName:String,link:String) extends Notification

    //信息的识别
    def showNotification(notification: Notification):String={
      notification match {
        case Email(sender,title,_) if (title.eq("important")) =>{
            "you get a Email message from " + sender
        }
        case SMS(caller,msg) => "you get a SMS message from " +caller
        case VoiceRecording(concatName,link) => "you get a VoiceRecording message from "+ concatName
        case _ => "you get an message not important"
      }
    }

    //创建一条信息
    val email = Email("Bill gates","important","I'am World 's richest man")
    println(showNotification(email))

    //---类型匹配
    var arr = Array("sss",1,2,3,'c')
    //随机取数组中的元素
    val obj = arr (Random.nextInt(4))
    obj match {
      case x:Int => println(x)
      case s:String => println(s.toUpperCase())
      case d:Double => println(Int.MaxValue)
      case _ => println("fail")
    }
    println(obj)


  }
}
