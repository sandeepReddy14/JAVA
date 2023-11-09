/*
Encapsulation is a way of hiding the implementation details of a class from outside
access and only exposing a public interface that can be used to interact with class.

Encapsulation is achieved by declaring instance variables as private to be accessed
only within the class and to allow outside access getter and setter methods are
defined which are used to retrieve and modify the instance variables. By using
getters and setters, class can enforce its own data validation rules and ensure
that its internal state is consistent.

There are 4 access modifiers in java, used to set access level to classes,
variables, methods and constructors.

Default:-
In java there is no keyword explicitly, java will set a default access to a given 
class, method or property. The default access modifier is also known as package-private, 
which means that all members are visible within the same package but aren't accessible
from other packages.

Public:-
If we add the public keyword to a class, method or property then we're making it available
to everything. All classes in all packages will be able to use it. This is least restrictive


Private:-
If we add the private keyword to a class, method or property then it will be accessible 
from the same class only.
This is most restrictive.

Protected:-
If we add the protected keyword to a class, method or property then it will be accessible
from same package and in addition from all subclasses of its class, even if they lie in other 
packages.

The order of most restrictive to least restrictive access specifiers in java
Private > Default > Protected > Public.
 -----------------------------------------------------
| Modifier  | Class   | Package  | Subclass |  World  |
 -----------------------------------------------------
| public    |    Y    |    Y     |    Y     |    Y    |
 -----------------------------------------------------
| protected |    Y    |    Y     |    Y     |    N    |
 -----------------------------------------------------
| default   |    Y    |    Y     |    N     |    N    |
 -----------------------------------------------------
| private   |    Y    |    N     |    N     |    N    |
 -----------------------------------------------------

Prints:-
Employee name is Sandeep, age is 22

*/
public class EncapsulationExample {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setName("Sandeep");
        employee.setAge(22);
        System.out.println("Employee name is " + employee.getName() + ", age is " + employee.getAge());

    }
}

class Employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
