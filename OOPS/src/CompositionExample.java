/*
Composition is also a way to achieve association.
It is also has-a or belongs-to relationship.
Composition is a string kind of has-a relationship. The object's lifecycles are tied.
If we destroy the owner object, it's members are also destroyed.
Prints:-
Car{name='BMW', wheels=Wheels{wheelType='Rubber'}}
*/
public class CompositionExample {
    public static void main(String[] args){
        Wheels wheelsVariable = new Wheels("Rubber");
        Car car = new Car("BMW", wheelsVariable);
        System.out.printf(car.toString());
    }

}

class Car{
    private String name;
    private Wheels wheels;

    public Car() {
    }

    public Car(String name, Wheels wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", wheels=" + wheels.toString() +
                '}';
    }
}

class Wheels{
    private String wheelType;

    public Wheels(String wheelType) {
        this.wheelType = wheelType;
    }

    public Wheels() {
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }
    public void printWheels(){
        System.out.println("Wheels are still in good condition.");
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "wheelType='" + wheelType + '\'' +
                '}';
    }
}
