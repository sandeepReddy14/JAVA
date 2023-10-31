/*
Encapsulation is a way of hiding the implementation details of a class from outside
access and only exposing a public interface that can be used to interact with class.

Encapsulation is achieved by declaring instance variables as private to be accessed
only within the class and to allow outside access getter and setter methods are
defined which are used to retrieve and modify the instance variables. By using
getters and setters, class can enforce its own data validation rules and ensure
that its internal state is consistent.
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
