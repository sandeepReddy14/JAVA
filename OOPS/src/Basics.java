/*

Object-Oriented Programming is a methodology to design a program using classes
and objects.


Class:-
A class is a logical template to create objects that share common properties and
methods.


Object:-
An object is an instance of a class, that has a state and behaviour.
Object contains address and takes up some space in memory, it has an identity
which is used internally by the JVM to identify each object uniquely.

There are mainly 4 pillars of OOPS.
1.Abstraction:-
Abstraction is a process of hiding implementation details and exposes only the
functionality. Users will only know "what it does" rather than "how it does".
Example:-
Phone call, user doesn't know internal processing but knows what phone call does.

2.Encapsulation:-
Encapsulation is the process of wrapping code and data together into single unit.
To have control over data, data hiding so other classes cannot access the data members.

3.Inheritance:-
Inheritance is the process of one class inheriting properties and methods from another
class. Inheritance is used when we have is-a relationship between objects.
Example:-
A dog is an animal. dog inherits animal properties.

4.Polymorphism:-
Polymorphism is when one task performed in different ways. Method overloading
and method overriding are used to achieve polymorphism.


Cohesion represents the degree to which a part of a code base forms a logically
single, atomic unit.
Coupling, on the other hand, represents the degree to which a single unit is
dependent on others
A good software should have low coupling and high cohesion.

Association represents the relation between objects
1.one to one
2.one to many
3.many to one
Many-to-one means that the objects know each other
Example:- A mother and her child.


A Class in java contain:-
1.Members/Fields
2.Methods
3.Constructors
4.Blocks:-
code is run everytime an object is created. These codes are copied and pasted at start of constructor.
All the instance initializer code is pasted in constructor after first super() statement .
5.Nested class & Interface

To run main function of a class the name of class anf file should be same.
A file may have multiple classes, but the name of file should be the name of class
that has main function.

An object with no reference is called anonymous object.
'this' keyword is a reference variable that refers to the current object.
Prints:-
Basics object is created.
0
Basics object is created.
constructor called
Value of age is 22
*/
public class Basics {

    /* Members */
    String name;
    int age;

    /* Methods */
    void printAge(){
        System.out.println("Value of age is " + this.age);
    }

    /* Constructors */
    Basics(){}

    Basics(String name, int age){
        System.out.println("constructor called");
        this.name = name;
        this.age = age;
    }

    /* Initializer Blocks */
    {
        System.out.println("Basics object is created.");
    }

    public static void main(String[] args){

        Basics b = new Basics();
        System.out.println(b.age);

        /* Anonymous object */
        new Basics("sandeep", 22).printAge();
    }
}