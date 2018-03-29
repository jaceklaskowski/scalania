package com.emids.medi

object MagnetPattern extends App {

  trait MyMagnet { // should probably be sealed
  type Result
    def getRes: Result
   // def apply(): Result
  }

  object MyMagnet {
    implicit def convertFromInt(myVal: Int) = new MyMagnet {
      override type Result = Int
     // override def apply(): Result = myVal
      override def getRes: Result = myVal
    }

    implicit def convertFromString(myVal: String) = new MyMagnet {
      override type Result = String
    //  override def apply(): Result = "Type is a String: " + myVal
      override def getRes: Result = "String type: " + myVal
    }

    implicit def convertFromTwoString(myTuple: (String, String)) = new MyMagnet {
      override type Result = String
   //   override def apply(): Result = "Type is a String type 2: " + myTuple._1 + ", " + myTuple._2
      override def getRes: Result = "String2 type: " + myTuple._1 + ", " + myTuple._2
    }
  }

  def findStickyType(mag: MyMagnet): Unit = {
    println("Finding magnet of some type... " + mag.getRes)
  }

  findStickyType("abc"); // create 'MyMagnet' with String constructor
  findStickyType(123);   // create 'MyMagnet' with Int constructor
  findStickyType("xyz","ijk");   // create 'MyMagnet' with (String, String) tuple constructor

}
