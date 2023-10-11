/*
Example 3 :- By implementing Runnable interface and thread constructors.
Prints:-
Thread is running.
Thread is running.
Second Thread
(or)
Thread is running.
Second Thread
Thread is running.
(or)
Second Thread
Thread is running.
Thread is running.
*/
public class MyThread3 implements Runnable {
    public void run(){
        System.out.println("Thread is running.");
    }

    public static void main(String args[]){
        MyThread3 m1 = new MyThread3();
        Thread thread1 = new Thread(m1);
        thread1.start();

        MyThread3 m2 = new MyThread3();
        Thread thread2 = new Thread(m2, "Second Thread");
        thread2.start();
        System.out.println(thread2.getName());
    }
}

