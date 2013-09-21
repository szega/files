package onlab2.files

import akka.actor.ActorSystem
import akka.actor.Props
import onlab2.files.engine.Dispatcher
import akka.actor.ActorRef

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
    val system : ActorSystem = ActorSystem.create
    val props1 = Props[Dispatcher]
    val ref : ActorRef = system.actorOf(props1)
    
    ref ! "Udv"
  }

}
