/*
1. String in java is immutable for security reasons.
2. Each time a string literal is created, the JVM checks the string constant pool first.
If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
3. For mutable strings we can use StringBuilder and StringBuffer classes
4. StringBuffer is thread safe but less efficient and StringBuilder is not thread safe but more efficient.

Prints:-
Hola!
Welcome
* */
public class StringExample {

    public static void main(String[] args){
        // String literal creation.
        String stringLiteral = "Hola!";
        System.out.println(stringLiteral);

        /*
         String object creation. JVM creates a string object in normal heap memory and the
         literal "Welcome" will be placed in the string constant pool.The  variable s will
         refer to the object in a heap.
         */
        String stringObject = new String("Welcome");
        System.out.println(stringObject);
    }
}
