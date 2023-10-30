/*
Interface in java is a blueprint of a class, it has static constants and abstract
methods.
Interfaces are used to achieve abstraction and multiple inheritance in java.
Interface can have only abstract methods and variables.
Members are public static final, Methods are public and abstract.
Interface can't be instantiated. Interfaces are implemented not extended .
A class can implement multiple interface.
Classes and interfaces relationship:-
1.class extends another class
2.class implements interface
3.interface extends interface

If a class implements multiple interfaces or extends multiple interfaces, it is
known multiple inheritance.

In java multiple inheritance is supported through interface but not with class,
because the implementation is provided by implementation class, though different
interfaces might have same methods since implementation is provided in implemented
class there will be no ambiguity. But if the same is supported by  class then at
runtime there will be ambiguity.
Prints:-
Printing Output.
Showing Output.
audio interface Output.
Speaking Output.
printableDefault method.
printableStatic method.
*/
public class InterfaceExample {

    public static void main(String[] args){
        Output output = new Output();
        output.print();
        output.show();
        output.audioInterface();
        output.speak();
        output.printableDefault();;
        Printable.printableStatic();
    }
}


class Output implements Printable, Showable, Speakable{
    public void print(){
        System.out.println("Printing Output.");
    }

    public void show(){
        System.out.println("Showing Output.");
    }

    public void speak(){
        System.out.println("Speaking Output.");
    }

    public void audioInterface(){
        System.out.println("audio interface Output.");
    }

}
interface Printable {

    /* Default method */
    default void printableDefault(){
        System.out.println("printableDefault method.");
    }

    /* static method */
    static void printableStatic(){
        System.out.println("printableStatic method.");
    }
    void print();
}

interface Showable{
    void show();
}

interface AudioInterface {
    void audioInterface();
}
interface Speakable extends AudioInterface {
    void speak();
}