package com.baizhi

import scala.util.Random
import scala.util.control.Breaks

object ScalaTest {
  def main(args: Array[String]): Unit = {
    var i:Int = 1:Int
    println(i)

    //if...else...
    var a:Int = new Random().nextInt(100)
    println(a)
    if(a<=30){
      println("baby")
    }else if(a<=60){
      println("honey")
    }else{
      println("honey baby")
    }

    var result = if(a<=25){
      "little baby"
    }else if(a<=50){
      "beautiful girl"
    }else if(a<=75){
      "beautiful lady"
    }else{
      "old female"
    }
    println(s"结果：${result}")

    var break = new Breaks
    break.breakable({
      while(a>30){
        if(a>100){
          break.break()
        }
        println(a)
        a += 10
      }
    })

    var array=Array(9,33,45,24,42)
    for(item <- array){
      println(item+"\t")
    }
    for(i <- 0 to array.length-1){
      println(array(i)+"\t")
    }

    for (i <- 1 to 9;j <- 1 to i){
      //print(i*j+"="+s"${i}*${j}"+"\t")
      print(i+"*"+j+"="+i*j+"\t")
      if(i==j){println()}
    }

    for (k <- 0 to 10;if(k%2==0)){
      print(k+" ")
    }

    println()

    var uu=Array(1,3,5,7,9,44,77,55,45,12,99)
    var res = for (item <- uu)yield item+2
    for(i <- 0 to res.length-1){
      print(res(i)+"\t")
    }

    var p = uu(new Random().nextInt(10))
    var res0=p match {
      case 1 => "first"
      case 3 => "second"
      case 5 => "third"
      case 7 => "fourth"
      case 9 => "fifth"
      case default => "none"
    }
    println(res0)

    var o = Array("May",1016,false,9.9)
    var u = o(new Random().nextInt(3))
    var res1 = u match {
      case w:Int => s"birthday:${w}"
      case w:String => s"name:${w}"
      case w:Boolean => s"sex:${w}"
      case _ => "nothing"
    }
    //println(res1)
  }
}
