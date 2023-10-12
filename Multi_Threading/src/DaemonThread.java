/*
Daemon threads are background process that handles requests for services such
as print spooling and file transfers and is dormant when not required.
Daemon threads can shut down any time between their flow. When all threads are
executed then JVM stops daemon threads.

public void setDaemon(boolean status) used to make a thread as daemon or user thread.
public boolean isDaemon() is used to check if a thread is daemon.
Once started a thread's daemon status can't be changed.

 prints only till the execution of main thread.
*/

import static java.lang.Thread.currentThread;

public class DaemonThread implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            try{
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        DaemonThread d1 = new DaemonThread();
        Thread t1 = new Thread(d1, "Daemon Thread");
        t1.setDaemon(true);
        t1.start();

        try{
            Thread.sleep(500);
        } catch(Exception e){
            System.out.println(e);
        }
        Thread t2 = new Thread();

        t2.start();
    }

}