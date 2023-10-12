import static java.lang.Thread.currentThread;

/*
Each thread has a priority, ranging from 1 to 10.
public final int getPriority() method returns the priority of the thread.
public final void setPriority(int priority) method assigns/updates the priority

3 constants are defined in Thread class for priority
public static int MIN_PRIORITY
public static int NORM_PRIORITY
public static int MAX_PRIORITY

default priority of thread is NORM_PRIORITY(5)

IllegalArgumentException is thrown when invalid priority is passed.

prints:-
First Thread has priority 9
Second Thread has priority 3
Third Thread has priority 5
*/
public class PriorityThread implements Runnable{
    public void run(){
        System.out.println(currentThread().getName() + " is running.");
    }

    public static void main(String args[]){
        PriorityThread p1 = new PriorityThread();
        Thread t1 = new Thread(p1, "First Thread");
        t1.setPriority(9);

        PriorityThread p2 = new PriorityThread();
        Thread t2 = new Thread(p2, "Second Thread");
        t2.setPriority(3);

        PriorityThread p3 = new PriorityThread();
        Thread t3 = new Thread(p3, "Third Thread");

        System.out.println(t1.getName() + " has priority " + t1.getPriority());
        System.out.println(t2.getName() + " has priority " + t2.getPriority());
        System.out.println(t3.getName() + " has priority " + t3.getPriority());
    }
}
