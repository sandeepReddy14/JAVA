/*
Synchronized block can be used to perform synchronization on any specific resource
of the object.

Synchronized block is used to lock an object for any shared resource.
Scope of Synchronized block is smaller than Synchronized method.
Synchronized block doesn't allow more than one JVM, to provide access
control to a shared resource.
System performance may degrade because of the slower working of synchronized
keyword.
Java Synchronized block is more efficient than Java synchronized method.

synchronized(object reference expression){
	critical section
}
Prints:-
Sending message : Message1
Thread-0 Message sent.
Sending message : Message2
Thread-1 Message sent.
*/
public class SynchronizedBlockExample extends Thread{

    private String message;
    private Sender sender;

    SynchronizedBlockExample(Sender sender, String message){
        this.message = message;
        this.sender = sender;
    }
    public void run(){
        synchronized (sender){
            sender.SenderMessage(this.message);
        }
    }
    public static void main(String[] args){
        Sender sender = new Sender();
        SynchronizedBlockExample s1 = new SynchronizedBlockExample(sender, "Message1");
        SynchronizedBlockExample s2 = new SynchronizedBlockExample(sender, "Message2");
        s1.start();
        s2.start();
    }
}

class Sender{
    public void SenderMessage(String message){
        System.out.println("Sending message : "+ message);
        try{
            Thread.sleep(1000);
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " Message sent.");
    }
}
