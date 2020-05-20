//package scala
//
//import scala.collection.mutable.ArrayBuffer
//import scala.collection.mutable.ListBuffer
//import scala.collection.immutable.Map
//
//
///**
// * @author lcw332
// *         Date 2020-05-18-15:57
// *         Description:
// **/
//class Demo {
//  //main方法
//  def main(args: Array[String]): Unit = {
//    m(mm _)
//  }
//  //------------变量----------------
//  var aha = 1;
//  //val 修饰变量为常量，如果变量的数据类型是基本数据类型，它的值就是不可以修改的
//  // 以下 ≈ final int CODE = 1;
//  val CODE : Int = 1;
//
//  val array = Array(1,2,3)
//  val arrar2 = Array(4,5,6)
//  //  array = arrar2 //引用不可变
//  array(0) = 10;//可以变，引用内容可以变
//  //访问数组中元素
//
//  //  val修饰的变量 可以lazy修饰，仅val修饰才能 在当需要使用的时候赋值，不会立刻赋值
//  lazy val a1= Array(1,2,3)
//  //值不需要改变的时候用 val 使用val时 在垃圾回收时会更快的回收
//
//
//
//
//  //  --------- 数据类型 ---------
//  //1值类型（java中的基本数据类型）和引用类型
//  //2值类型是类类型，相当于java中的包装类，AnyRef
//
//  //---------操作符--------
//  //数学运算符：
//
//  val a = 10
//  val b = 20
//  val c = 25
//  val d = 25
//  println("a + b = " + (a + b))
//  println("a - b = " + (a - b))
//  println("a * b = " + (a * b))
//  println("b / a = " + (b / a))
//  println("b % a = " + (b % a))
//  println("c % a = " + (c % a))
//
//  //关系运算符：
//
//  val aa = 10
//  val bb = 20
//  println("a == b = " + (a == b))
//  println("a != b = " + (a != b))
//  println("a > b = " + (a > b))
//  println("a < b = " + (a < b))
//  println("b >= a = " + (b >= a))
//  println("b <= a = " + (b <= a))
//
//  //1 scala中的运算符都是方法的重载，是方法的调用
//  //2 scala没有++或--，如果需要表示 可以用+=，-=来代替
//
//
//  //表达式
//  //1.表达式是有返回值的
//  //2.返回值是表达式中最后一条语句的执行结果 ≈返回值（return)
//
//  //条件表达式
//  var x =10;
//
//  if(a<0){
//    100//这里返回的是unit数据类型 ≈ void
//  }
//
//
//  //循环
//  //for
//  //  for (i <= 表达式，数组，集合)
//  //while
//  //  while(条件语句){表达式}
//  //do while
//  // do(表达式) while(条件语句)
//
//  //  for (i <- 1 until 10){println(i)}
//  //  for(i <- 1 to 3; j <- 1 to 3 if(i!=j)){println((10*i+j) +" ")}
//
//  /**
//   * 方法
//   */
//  //  def 方法名 (参数列表) : 返回类型 = 方法体
//  //返回类型可以省略，递归方法则不可以省略。
//
//  //不指定返回类型
//  def add (x:Int,y:Int) = x+y
//  //指定返回类型
//  def addd (x:Int,y:Int):Int = x+y
//
//  //块表达式
//  def adddd(x:Int,y:Int):Int = {
//    x+y
//  }
//
//
//  //带有参数列表的方法
//  def  addAndMulitiply(x:Int,y:Int,z:Int) = (x+y)*z
//  def  addAndMultiply(x:Int,y:Int,z:Int) = (x+y)*z
//
//  //无参方法
//  def printInfo = println("Hello world")
//  def printInfo2() = println("Hello world")
//
//  //调用
//  printInfo
//  printInfo2()
//
//
//  //带默认值参数的方法
//  def printInfo(str:String ="Hello Scala") = println(str)
//
//  def addx(a:Int =1 ,b:Int,c:Int =3) =println("a="+a+"\nb="+b+"\nc="+c)
//
//  add(1,2)
//
//  //*表示参数可传多个，可变长参数
//  def addz(a:Int*) ={
//    for (a <- a){
//      println(a)
//    }
//  }
//
//  //  val fun = new Function2[Int,Int,Int]{
//  //    def apply(x:Int,y:Int) =
//  //      if (x<y){
//  //        x
//  //      }else{
//  //        y
//  //      }
//  //  }
//
//  //Scala 有方法与函数，二者在语义上的区别很小。Scala 方法是类的一部分，而函数是一个对象可以赋值给一个变量。换句话来说在类中定义的函数即是方法。
//  //
//  //Scala 中的方法跟 Java 的类似，方法是组成类的一部分。
//  //
//  //Scala 中的函数则是一个完整的对象，Scala 中的函数其实就是继承了 Trait 的类的对象。
//  //
//  //Scala 中使用 val 语句可以定义函数，def 语句定义方法。
//
//
//  //函数
//  val fun = (x:Int,y:Int) => if(x<y) x else y
//
//  //无参函数
//  var fun1 = () => println("haha")
//
//  //多参函数
//  var fun2 = (x:Int,y:Int) => x*y
//
//
//
//
//  //--------------方法和函数---------------
//  //区别:
//  //1 方法和函数定义语法不同
//  //2 方法一般定义在类、特质、或者Object中
//  //3 方法可以共享所在类、特质、或者Object的属性
//  //4 可以调用函数，可以可以存放到一个变量中,作为参数传递给其他方法或者函数，也可以作为返回值
//  //联系：
//  //1 可以把函数作为参数作为方法
//  def m(f:(Int,Int)=>Int) = f(5,1)
//  val f = (x:Int,y: Int) => x-y
//  m(f)
//  //2 方法可以转换成函数
//  //a.把一个方法作为参数传递给其他方法或函数
//  //b.使用方法名，把一个方法显示的转换成一个函数
//  def mm(x:Int,y:Int) = x-y
//  // '_' 空格下划线是指把方法转换成函数
//  m(mm _)
//
//  //----------集合--------------
//  //1 集合是一个容器
//  //2 一般放同种数据类型的对象
//  //3 一般是存放多个对象
//
//  //不可变集合 ： 不可修改，但是可以模拟修改或删除等
//
//  //可变集合 ： 可修改，可以更新或增加
//
//  //三大类：set 序列(seq) map
//
//
//  //数组的访问
//
//  //未定义
//  val arr = Array(1,2,3)
//  //定义数据类型
//  val arr1 = Array[Int](4,5,6)
//  //定义数据类型，数组长度
//  val arr2 = new Array[Int](10)
//
//  var arr3 = new Array(10)
//
//
//  //----------变长数组-----------
//  //创建时初始化
//  var arr1 = ArrayBuffer("a","b","c")
//  //约束数据类型
//  var arr2 = ArrayBuffer[String]("a","b")
//
//  //()中给的参数是无意义的
//  var arr3 = ArrayBuffer[Int](10)
//  arr3.length
//
//  //2 数组操作:
//  //--通过操作符的方式--
//  //  arr2 += 1;
//  var arr4 = Array(4,5,6)
//  //
//  arr3 ++= arr3
//
//  arr3.apply(8)
//
//  //删除元素
//  //  arr3.trimEnd(1)
//  //索引位置，要删除的个数
//  //  arr3.remove(2,1)
//
//  //数组变换
//  //  var a = Array(1,2,3,4,5)
//  //遍历将 a中的数组都 * 10
//  //  for(e <- a) yield e*10
//  //对数组a _代表每个元素 乘以10
//  //  a.map(_*10)
//  //把a中的偶数 拿出来
//  //除以2取摸 == 0 的话就代表是偶数
//  //  a.filter(_%2 == 0)
//  //  x代表数组中的每一个元素  =>指定之后要做的操作
//  //数组*10
//  //  a.map(x => x*10)
//  //x等价于 _
//  //  a.filter(x => x%2 == 0)
//
//
//  //------List-------
//  //创建List 分为可变List和不可变List
//  //不可变List 初始化值 1,2,3
//  var list1 = List(1,2,3)
//  println(list1.getClass.getName)
//  //  scala.collection.immutable.$colon$colon
//
//
//  //在元素的头部加上0 返回一个新的List
//  0 ::list1
//  list1.::(0)
//  0 +:list1
//  list1.+:(0)
//  //三种表达式都等价
//  //val res14: List[Int] = List(0, 1, 2, 3)
//
//  //这里List1是不可变的, 是可以做模拟插入的操作
//
//  //在元素尾部加上4 返回一个新的List
//  list1 :+4
//
//  var list2 = List(4,5,6)
//  //拼接两个List
//  list1 ++: list2
//
//  //可变List
//  var list3 = ListBuffer(1,2,3)
//  //插入元素
//  list3 += 4
//  list3.append(5)
//
//  var list4 = new ListBuffer[Int]()
//  list4.append(9)
//  //产生一个新的集合
//  list3 ++ list4
//  list3 :+ 8
//  //list 元素*10
//  //  list3.map(_*10)
//  //  list3.map(e => e*10)
//  //val res29: scala.collection.mutable.ListBuffer[Int] = ListBuffer(10, 20, 30, 40)
//  //{}可以写入函数体 类似j8的 list3.map(e -> { })
//  //  list3.map{println("hello");_*10}
//  //{}块表达式
//  //  list3.map{e => println("hello");e*10}
//
//  //---------------Map----------------------
//
//
//  //创建map 分为可变Map和不可变Map
//  //写法一
//  val score= Map("zhangsan"-> 90,"lisi"-> 80)
//  //写法二
//  val score= Map(("zhangsan",90),("lisi",80))
//
//
//  //可变map
//  var score2 = scala.collection.mutable.Map("zhangsan"->95,"lisi"->100)
//
//  //取值
//  score("zhangsan")
//  if (score.contains("zhang")) score("zhangsan") else -1
//
//  //true zhang false -2
//  score.getOrElse("zhang",-2)
//
//  //判断是否为空
//  score.isEmpty
//
//  //返回map中所有的键
//  score.keys
//
//  //返回map中所有的值
//  score.values
//
//
//  //修建键对应的值 如果元素不存在则插入
//  score2("zhangsan") =60
//  score2("zhang")=70
//
//  //插入
//  score2 += ("wangmazi"->99)
//  score2 += (("zhao",99))
//  score2 += (("zhao",99),("zh2",100))
//
//  //删除
//  score2 -= "zh1"
//
//
//  //遍历取值
//  for((k,v)<- score2 ){
//    println(k +":" +v)
//  }
//
//
//  //------------元组------------
//  //简介：元组是不同类型的值的集合
//
//  /**
//   * 1.元组中的元素是不可修改的
//   */
//
//  //--创建元组
//
//  val t1 = (1,2,3,4)
//  val t2 = ("java","python","scala",1)
//
//  //--访问元素
//  //根据元素索引访问t2元组中的第1个元素 scala的索引是从1开始的
//  t2._1
//  t2._2
//
//  //可通过a,b,c来访问元组中的元素
//  val t4,(a,b,c)=("Tencent","Alibaba",1)
//  //Tuple3代表当前元组有3个元素
//  val t5 = new Tuple3("Baidu","ByteDance",2)
//  val t6 = new Tuple5("Didi","Meituan","jd","pdd",3)
//
//  //--遍历元组
//  t6.productIterator.foreach(i => println(i))
//  t6.productIterator.foreach(println(_))
//
//  //--拉链操作
//  val a1 = Array("Java","Scala","Python")
//  val a2 = Array(1,2,3)
//  //生成元组
//  a1.zip(a2)
//
//  val a3 = Array(4,5,6,7)
//  a1.zip(a3)
//
//  val x = "a"
//  val y = "b"
//  a1.zipAll(a3,x,y)
//  val res = a1.zipAll(a3,x,y)
//  //取消Zip
//  res.unzip
//
//
//  //-----------------Set---------------
//
//  //--创建set
//  val set1 = Set(1,2,3)
//  set1 + 4
//  //import scala.collection.mutable.Set
//  set1 - 3
//  //--可变Set
//  val set2 =Set(1,2,3)
//  set2 -= 3
//  set2 += 2
//  //--常用操作
//  //返回第一个参数
//  set2.head
//  //返回除了第一个参数以外的所有参数
//  set2.tail
//  //判断是否为空
//  set2.isEmpty
//  //最大元素
//  set2.max
//  //最小元素
//  set2.min
//
//  val set3 = Set(3,4,5,6)
//  //新产生了一个集合Set
//  set2 ++ set3
//  //拿到两个集合中的公共元素
//  set2.intersect(set3)
//
//  //------------集合中主要的函数-------------//
//  //1.SUM MAX MIN
//  val list1 = List(2,3,5,6,7)
//  list1.sum
//  list1.max
//  list1.min
//  //2.filter 过滤
//  list1.filter(e =>e%2 ==0)
//  //3.flatten 压平 对集合中包含集合做处理
//  val list2 = List(5,6,7)
//  val list3 = List(list1,list2)
//  list3.flatten
//  //4.flatMap map
//  list1.map(e=>e*10)
//  val list4 = List('a','b','c')
//  //把ch变成大写字符
//  val list5 = list4.map(ch=>List(ch,ch.toUpper))
//  //压平 拿到list4张
//  list5.flatten
//  //相当于Map + flatten 压平
//  val list6 = list4.flatMap(ch => List(ch,ch.toUpper))
//
//  //5.forall foreach
//  //返回一个布尔
//  list1.forall(e => e>0)
//  //遍历
//  list1.foreach(e => println(e))
//  list1.foreach(println(_))
//
//  //6.foldLeft foldRight reduceLeft reduceLeft
//
//  //元素相加
//  // |1|2|3|  1(最左或最右元素)先和N相加得到的和 去和N+1的元素相加
//  //  1+2
//  //   3+3
//  list1.reduceLeft(_+_)
//  list1.reduceRight(_+_)
//  // 从集合最右边的元素开始计算
//  list1.reduceRight(_-_)
//
//  //第一个()表示初始值，第二个表示要做的操作
//  //   |1|2|3|
//  //10+1
//  //    11+2
//  //      13+3
//  list1.foldLeft(10)(_+_)
//  list1.foldRight(10)(_+_)
//
//
//  //---------面向对象----------
//  // Java中面向对象的概念
//  // 类：一类事物的抽象
//  //对象：类的一个实例
//  //Java中访问修饰符
//  //          当前类  同一个包类 子类  其他包
//  //public     Y     Y         Y     Y
//  //protected  Y     Y         Y     N
//  //(default)  Y     Y         N     N
//  //private    Y     N         N     N
//
//
//
//
//  //----------RDD编程----------
//  //  val
//
//}
