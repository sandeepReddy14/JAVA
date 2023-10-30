/*
Polymorphism:-
Polymorphism is when one task performed in different ways. Method overloading
and method overriding are used to achieve polymorphism.

Method Overloading:-
If a class has multiple methods with same name but different signature of
parameters, it is known as method overloading.
Signature can be changed by changing number of parameters, data type of parameters.
By changing return type of method, method overloading can't be achieved.

Method Overriding:-
Method overriding is used to provide specific implementation of method which is
already provided by it's superclass.

Signature of method should be same in both parent and child class.

Static methods cannot be overridden, because static methods are binded at
compile time.

There are 2 types of polymorphism:-
1.Compile-time polymorphism:-
Method to run is decided at compile time then it is compile-time
polymorphism. Static methods can't be over-ridden as they are bound to class.
2.Run-time polymorphism:-
Overridden method is resolved ar runtime hence run-time polymorphism.
The object being referred to by the reference variable determines which method to
invoke.

Data members can't achieve run time polymorphism. The reference variable's data
member value is printed.

Binding:-
Connecting a method call to the method body is known as binding.
There are 2 types of binding:-
1.Static binding:-
When the type of object is determined at compiled time, it is known as static
binding.
2.Dynamic binding:-
When the type of object is determined at runtime, it is known as dynamic binding.
instanceof operator is used to test whether the "object" is an instance of the
specified type.

super Keyword:-
The super keyword in java is a reference variable which is used to refer
immediate parent class object.
Uses of super keyword:-
1.super is used to refer immediate parent class instance variable.
2.super is used to invoke immediate parent methods.
3.super() is used to invoke immediate parent class constructor.

final Keyword:-
final keyword is used to restrict the child class from changing data member,
method and class.
uninitialized final variable can be initialized only in constructor.
uninitialized static variable can be initialized only in static block.
final keyword usage:-
1.to stop value change
2.to stop method overriding
3.to stop inheritance(if a class is made final it can't be extended/inherited)
Prints:-
Sum of 5 and 7 is 12
Sum of 3 , 6 and 9 is 18
Sum of 9.0 and 9.0 is 18.0
Vehicle type truck is created.
Truck is created.
Truck is running.
Vehicle type truck is created.
Truck is created.
Speed Limit of truck1 is 150
true
*/
public class PolymorphismExample {

    /* Method Overloading */
    public void addAndPrint(int a, int b){
        System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
    }
    public void addAndPrint(int a, int b, int c){
        System.out.println("Sum of " + a + " , " + b + " and " + c + " is " + (a+b+c));
    }
    public void addAndPrint(double a, double b){
        System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
    }

    public static void main(String[] args){
        PolymorphismExample polymorphismExample = new PolymorphismExample();
        polymorphismExample.addAndPrint(5,7);
        polymorphismExample.addAndPrint(3,6,9);
        polymorphismExample.addAndPrint(9.0,9.0);

        Truck truck = new Truck();
        truck.run();

        /* Since reference variable is vehicle, vehicle's speedLimit is in output */
        Vehicle truck1 = new Truck();
        System.out.println("Speed Limit of truck1 is " + truck1.speedLimit);
        System.out.println(truck instanceof Vehicle);
    }
}

class Vehicle{

    public int speedLimit = 150;
    Vehicle(){
        System.out.println("Vehicle is created.");
    }
    Vehicle(String name){
        System.out.println("Vehicle type " + name + " is created.");
    }
    public void run(){
        System.out.println("Vehicle is running.");
    }
    static void vehicleRunning(){
        System.out.println("static vehicle running.");
    }
    final double repairCost = 99.99;
    final void repair(){
        System.out.println("Vehicle is repairing.");
    }
}

class Truck extends Vehicle{

    public int speedLimit = 90;
    Truck(){
        super("truck");
        System.out.println("Truck is created.");
    }
    @Override
    public void run() {
        System.out.println("Truck is running.");
    }

}