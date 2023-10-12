/*
Thread group represents a set of threads. A thread group can also include other
thread group. The thread group creates a tree in which every thread group except
the initial thread group has a parent.

constructors of thread group class
ThreadGroup(String name) creates thread group with given name
ThreadGroup(ThreadGroup parent, String name) creates a thread group with given
parent group and name.

There are methods like destroy(), interrupt(), activeCount(), enumerate() etc
*/
public class ThreadGroupExample implements Runnable{

    public void run(){
        try{
            Thread.sleep(2000);
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " is running.");
    }

    public static void main(String[] args){
        ThreadGroupExample threadGroupExample = new ThreadGroupExample();
        ThreadGroup threadGroup = new ThreadGroup("parent thread group");

        Thread t1 = new Thread(threadGroup, threadGroupExample, "first thread");
        Thread t2 = new Thread(threadGroup, threadGroupExample, "second thread");
        Thread t3 = new Thread(threadGroup, threadGroupExample, "third thread");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(threadGroup.activeCount());
    }
}
