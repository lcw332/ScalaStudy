package scala

import akka.actor.{Actor, ActorSystem, Props}

import scala.io.StdIn
/**
 * @author lcw332
 *         Date 2020-05-21-10:16
 *         Description:  Actor模型
 **/

//类似于Java中的Thread
class FistActor extends Actor{

  //重写接收消息，类似Java中的Run方法
  override def receive: Receive = {
    case "start" => {
      println("starting")
      Thread.sleep(1000)
      println("started")
    }
    case "stop" => {
      println("stopping")
      Thread.sleep(1000)
      println("stoppted")
    }
  }
}

object ActorDemo  {


  /**
   * 创建线程池对象MyFactory，用来创建actor的对象的
   */
  private val myFactory = ActorSystem("myFactory")
  /**
   * 通过MyFactory.actorOf方法来创建一个actor，注意，Props方法的第一个参数需要传递我们自定义的HelloActor类，
   * 第二个参数是给actor起个名字
   */
  private val actorDemoRef = myFactory.actorOf(Props[FistActor],"ActorDemo")

  def main(args: Array[String]): Unit = {
    var flag = true
    while (flag){
      print("请输入您想发送的消息:")
      //控制台 输入
      val consoleLine:String = StdIn.readLine()
      //用ActorDemoRef来给自己发送消息，ActorDemoRef有一个叫做感叹号("!")的方法来发送消息
      //!发送异步消息，没有返回值，!?是同步消息，等待返回值 !!是发送异步消息，有返回值
      actorDemoRef ! consoleLine
      if (consoleLine eq ("stop")){
        flag = false
        println("发送消息结束")
      }
      Thread.sleep(100)
    }
  }

}
