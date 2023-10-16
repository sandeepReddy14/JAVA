/*
There are 3 types of variables. local, instance & static.

Local variable:
A variable that is declared inside a method is called local variable. A local
variable cannot be declared with static keyword.

Instance variable:
A variable that is declared inside class but outside methods without static keyword
is called instance variable. It is called instance variable because it is instance
specific and not shared with other instances of class.

Static variable:
A variable that is declared with static keyword is called static variable. It can't be
local. A single copy of static variable is shared among all instances of class.

Prints:-
My name is Sandeep
Value of instanceVariable is 1
Value of staticVariable is 0
My name is Sandeep
Value of instanceVariable is 2
Value of staticVariable is 100
*/
public class Variables {
    int instanceVariable;
    static int staticVariable = 0;

    Variables(int instanceVariable){
        this.instanceVariable = instanceVariable;
    }
    void printName(){
        String name = "Sandeep";
        System.out.println("My name is " + name);
        System.out.println("Value of instanceVariable is " + instanceVariable);
        System.out.println("Value of staticVariable is " + staticVariable);
    }

    public static void main(String[] args){
        Variables variablesObject1 = new Variables(1);
        variablesObject1.printName();
        Variables.staticVariable = 100;

        Variables variablesObject2 = new Variables(2);
        variablesObject2.printName();
    }
}
