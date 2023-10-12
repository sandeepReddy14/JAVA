/*
When join() method is invoked current thread stops its execution and goes into 
wait state. The current thread remains in the wait state until the thread on which
the join() method is invoked called is dead or the wait for the specified time frame
is over.

There are 3 overloaded methods for join()
public final void join() throws InterruptedException
public final synchronized void join(long milliseconds) throws InterruptedException
public final synchronized void join(long milliseconds, int nanos) throws InterruptedException
Similar to sleep() method depending on the load of the system time may not be exactly 
what is provided in parameters.
*/

public class JoinThread implements Runnable{
    public void run() {
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);
            } catch (Exception e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+ " i: " + i );
        }
    }

    public static void main(String args[]){
        JoinThread j1 = new JoinThread();
        Thread t1 = new Thread(j1, "First Thread(j1)");

        JoinThread j2 = new JoinThread();
        Thread t2 = new Thread(j2, "Second Thread(j2)");

        JoinThread j3 = new JoinThread();
        Thread t3 = new Thread(j3, "Third Thread(j3)");

        t1.start();
        try {
            /*
            t1.join() stops main thread and main thread waits till t1 is completed.
            * */
            t1.join();

            /*
            t1.join(1500) stops main thread for 1500 milliseconds.
            * */
        } catch (Exception e){
            System.out.println(e);
        }

        t2.start();
        t3.start();

    }
}