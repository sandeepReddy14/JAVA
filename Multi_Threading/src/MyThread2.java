/*
Example 2 :- By directly using Thread constructor
Prints:-
First thread
*/
public class MyThread2 {

    public static void main(String args[]){
        Thread thread = new Thread("First thread");
        thread.start();
        System.out.println(thread.getName());
    }
}
