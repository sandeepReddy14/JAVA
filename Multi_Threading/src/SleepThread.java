/*
The method sleep() is used to halt the working of thread for a given amount of time.
There are 2 over-loading methods
public static void sleep(long milliSeconds) throws InterruptedException
public static void sleep(long milliSeconds, int n) throws InterruptedException
milliSeconds - time in milliseconds for which the thread will sleep.
n - additional time up to which the programmer wants the thread to be in sleeping
state.

Time can't be negative

1.Whenever Thread.sleep() method executes, it always halts the execution of current
	thread.
2.When another thread creates interruption while current thread is already in sleep,
	InterruptedException is thrown.
3.If the system that is executing the threads is busy then actual sleeping time might
	be more than expected. When not in load actual sleeping time might be almost same.
*/

public class SleepThread implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started running.");
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " i : "+ i );
        }
    }

    public static void main(String args[]){
        SleepThread s1 = new SleepThread();
        Thread t1 = new Thread(s1, " s1 thread");

        SleepThread s2 = new SleepThread();
        Thread t2 = new Thread(s2, " s2 thread");

        t1.start();
        t2.start();
    }
}

