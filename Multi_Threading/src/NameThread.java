/*
public void setName(String threadName) is used to set the name of a thread.
public String getName() is used to return the name of a thread.
public static Thread currentThread() returns the reference of currently 
executing thread.
prints:
First Thread
Second Thread
main
First Thread is running.
Second Thread is running.
(or)
First Thread
Second Thread
main
Second Thread is running.
First Thread is running.
*/

import static java.lang.Thread.currentThread;

public class NameThread implements Runnable{

    public void run(){
        System.out.println(currentThread().getName() + " is running.");
    }

    public static void main(String args[]){
        NameThread n1 = new NameThread();
        Thread t1 = new Thread(n1);
        t1.setName("First Thread");

        NameThread n2 = new NameThread();
        Thread t2 = new Thread(n2);
        t2.setName("Second Thread");

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(currentThread().getName());
        t1.start();
        t2.start();
    }
}