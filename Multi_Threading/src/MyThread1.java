/*
Example 1 :- By extending thread class
Prints:-
Thread is running from MyThread1 Class.
*/
public class MyThread1 extends Thread{
    public void run(){
        System.out.println("Thread is running from MyThread1 Class.");
    }

    public static void main(String args[]){
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}
