/*
start() method is used to start the execution of thread.
After starting a thread, it can't be started again. If started 
IllegalThreadStateException is thrown
*/

public class CustomStartThread implements Runnable{
    public void run() {
        System.out.println("Custom Thread is running.");
    }
    public static void main(String args[]){
        CustomStartThread customStartThread = new CustomStartThread();
        Thread t1 = new Thread(customStartThread, "First Thread");

        // start() method is used to start execution of thread.
        t1.start();
    }
}