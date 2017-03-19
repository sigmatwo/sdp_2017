//package observer
//
//import scala.collection.mutable.ListBuffer
//
//class CommentaryObject(var observers: ListBuffer[Observer],
//                       val title: String) extends Subject {
//
//  private var desc: String = _
//
//  override def subscribeObserver(observer: Observer): Unit = {
//    observers.add(observer)
//  }
//
//  def unSubscribeObserver(observer: Observer): Unit = {
//    val index: Int = observers.indexOf(observer)
//    observers.remove(index)
//  }
//
//  def notifyObservers(): Unit = {
//    println()
//    for (observer <- observers) {
//      observer.update(desc)
//    }
//  }
//
//  def subjectDetails: String = ???
//}
