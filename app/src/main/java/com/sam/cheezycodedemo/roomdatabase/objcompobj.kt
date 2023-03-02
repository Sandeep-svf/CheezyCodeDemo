package com.sam.cheezycodedemo.roomdatabase

fun myFun(){
    // object
    // it will be attach form the class
    // it will hold single instance
    Car.fun1.f()
    Car.fun2.g()

    // compainon obj -> call properties and fun directly form the class....
    // we can create only one companion obj in one class
    // taken static keyword from java...
    Car.x()


}

class Car {

    companion object fun3{
        // @JvmStatic -> it will refer that in java call this method as static method...
        // companion used in kotlin for factory pattern
        // Factory pattern -> in fun pass parameter and it return obj ( it is factory of obj)
        @JvmStatic
        fun x() {
            println("I am x from fun3")
        }
    }

    object fun1 {
        fun f () {
            println("I am f from fun1 object")
        }
    }

    object fun2 {
        fun g() {
            println("I am g form fun2")
        }
    }

}