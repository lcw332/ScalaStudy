package scala

/**
 * @author lcw332
 *         Date 2020-05-20-15:11
 *         Description:  
 **/


trait Logger{
  def log(msg:String)
  def info(msg:String): Unit ={
    log("INFO:"+msg)
  }
  def service(msg:String): Unit ={
    log("SERVER:"+msg)
  }
  def warn(msg:String): Unit ={
    log("WARN:"+msg)
  }
}


class Account{
  protected var balance:Double = 0
}

class SavingAccount extends Account with Logger{
  override def log(msg: String): Unit = {
    println(msg)
  }
  def withDraw(amount:Double): Unit ={
    if (amount > balance){
      service("Insufficent funds")
    }else {
      balance = balance - amount
      info("you withdraw....")
    }
  }
}


object TraitTest3 {
  def main(args: Array[String]): Unit = {
    val acc = new SavingAccount
    acc.withDraw(100.00)
  }
}
