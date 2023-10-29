/*
Abstraction is a process of hiding the implementation details and showing only
the functionality to the user.
There are 2 ways to Achieve abstraction in java.
1.Abstract class
2.Interface

Abstract class:-
A class which is declared as abstract is known as abstract class.
It can have both abstract & non-abstract methods.
It needs to be extended, and it's method to be implemented, and it can't be
instantiated.
Points to remember:-
1.An abstract class must be declared with an abstract keyword.
2.It can have abstract and non-abstract methods.
3.It cannot be instantiated.
4.It can have constructors and static methods also.
5.It can have final methods which will force the subclass not to change
the body of the method.

Abstract Method:-
A method which is declared as abstract and doesn't have implementation is known
as abstract method.
Only abstract classes can have abstract methods.
Abstract classes should be extended.
*/
public class AbstractClassExample {
    public static void main(String[] args){
        Ola ola = new Ola();
        ola.stop();
    }
}

abstract class Bike{
    Bike(){
        System.out.println("Bike is created");
    }

    /* Abstract Method */
    abstract void run();

    /* Non-Abstract method */
    public void stop(){
        System.out.println("Bike stopped running.");
    }

}

class Ola extends Bike{

    Ola(){
        System.out.println("Ola Bike is created");
    }
    public void run(){
        System.out.println("Ola is running.");
    }
}
