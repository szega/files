package onlab2.files.engine

import akka.actor.Actor

class Dispatcher extends Actor {

  def receive = {
    case _ => println("actor called");
  }
}