/*
A special construct that facilitates programmers to run code
when JVM is shutting down is called Java shutdown hook.

public void addShutdownHook(Thread hook) method of Runtime class is used to
register the thread with virtual machine.

public boolean removeShutdownHook() method removes the registration of
already registered shutdown hook.

within shutdown hooks another shutdown hooks can't be registered.
There can be more than one shutdown hooks and order is not guaranteed.
The execution of shutdown hook is not guaranteed as JVM may have shutdown because
of internal errors, system might have shutdown etc.
*/
public class ShutDownHookExample extends Thread{

    public void run(){
        System.out.println("shut down task ");
    }

    public static void main(String args[]){
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new ShutDownHookExample());
        Thread hook = new ShutDownHookExample();
        r.addShutdownHook(hook);
        r.removeShutdownHook(hook);

        try{
            Thread.sleep(5000);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
