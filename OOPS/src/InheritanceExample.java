/*
When one object acquires all the properties and behaviours of a parent object is
known as inheritance.
New classes can be created upon existing classes and can use methods & members of
parent class, also we can add new methods & members to the new class.

Inheritance is used because for code re-usability.
Terms used in inheritance:-
1.Sub class/child class : class which inherits the other class.
2.Super class/parent class : class from which child class inherits.

child class extends parent class

There are 5 types of inheritance:-
1.Single inheritance:-
When a class inherits another class, it is single inheritance.
A dog class inherits animal class.

2.Multi-level inheritance:-
When there is a chain of inheritance, it is multi-level inheritance.
A baby dog class inherits a dog class which inherits animal class.

3.hierarchical inheritance:-
When 2 or more classes inherit a single class, it is hierarchical inheritance.
dog and cat classes inherit animal class.

4.Multiple inheritance(not supported through class in java):-
When a single class inherits multiple classes.

5.Hybrid inheritance(not supported through class in java):-
Hybrid inheritance is a combination of simple, multiple inheritance and
hierarchical inheritance.

Multiple & Hybrid inheritance is supported through interfaces in java.
To reduce the complexity and simplify the language, multiple inheritance is not
supported in java.
Consider,
Class C inherits from classes A & B. If A & B have same method when called from
child class object, there will be ambiguity to call method of A or B class.
To avoid run-time errors multiple inheritance is not supported through class in
java.

super is used to refer immediate parent class.
super() is constructor of immediate parent class.
Prints:-
Animal is eating.
Dog is barking.
Animal is eating.
Cat is meowing.
Animal is eating.
Dog is barking.
Baby-dog is weeping.
*/
public class InheritanceExample {
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();

    }
}

class Animal{
    void eat(){
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing.");
    }
}

class BabyDog extends Dog{
    void weep(){
        System.out.println("Baby-dog is weeping.");
    }
}


