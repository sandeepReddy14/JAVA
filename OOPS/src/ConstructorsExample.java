/*

Constructor is a block of codes similar to method which is called when an instance
of the class is created.

If there is no constructor available in class, java compiler will provide a default
constructor.

Java does not allow the recursion of constructors, a compile time error wil be
thrown.

Rules:-
1.Constructor name must be same as its class name
2.Constructor should not have no explicit return type.
3.Constructor cannot be abstract, static, final and synchronized.

There are 2 types of constructors
1.Default:- Doesn't have any parameters. It assigns default values to members
2.Parameterized:- Used to provide different values to distinct objects.

Constructors can be overloaded by changing signature of constructor.

There is no copy constructor in java, however we can copy values from one object to
another by
1.using constructor
2.assigning values from one object to other
3.clone() method (Deep copy)

Prints:-
s1 Student{name='null', id='null', age=0}
s2 Student{name='Sandeep', id='23023', age=22}
s3 Student{name='Sandeep', id='23023', age=22}
after changing age of s3 state of s2 and s3 is
s2 Student{name='Sandeep', id='23023', age=22}
s3 Student{name='Sandeep', id='23023', age=23}
*/

public class ConstructorsExample {
    public static void main(String[] args){

        /* object using default constructor */
        Student s1 = new Student();
        System.out.println("s1 " + s1.toString());

        /* object using parameterized constructor */
        Student s2 = new Student("Sandeep", "23023", 22);
        System.out.println("s2 " + s2.toString());

        /* copying s2 to object into s3 */
        Student s3 = new Student(s2);
        System.out.println("s3 " + s3.toString());
        s3.setAge(23);
        System.out.println("after changing age of s3 state of s2 and s3 is ");
        System.out.println("s2 " + s2.toString());
        System.out.println("s3 " + s3.toString());
    }
}

class Student{
    private String name;
    private String id;
    private int age;

    /* Default constructor */
    Student(){}

    /* Parameterized constructors */
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    Student(String name, String id, int age){
        this(name, age);
        this.id = id;
    }

    /* copying an object using constructor */
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.id = s.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}


