/*

The intended purpose of static synchronized methods is when you want to allow
only one thread at a time to use some mutable state stored in static variables
of a class.

static synchronized method will lock the class instead of the object, and it will
lock the class because the keyword static means class instead of instance.

The keyword synchronized means that only one thread can access the method at
a time and static synchronized means only one thread can access the class at a time.

Suppose if there are 3 threads accessing different objects but same class where
the threads are modifying a static variable, since lock is applied to object in
synchronized methods threads that mutate static variable unintended.
Using static synchronized only one thread can access a class, lock is applied to
class not instance.

Prints:-(with static synchronized)
Thread-0 1
Thread-0 2
Thread-0 3
Thread-0 4
Thread-0 5
Thread-2 6
Thread-2 7
Thread-2 8
Thread-2 9
Thread-2 10
Thread-1 11
Thread-1 12
Thread-1 13
Thread-1 14
Thread-1 15

prints:-(without static synchronized)
Thread-1 1
Thread-1 3
Thread-1 4
Thread-1 5
Thread-2 2
Thread-2 7
Thread-2 8
Thread-2 9
Thread-2 10
Thread-0 1
Thread-0 11
Thread-1 6
Thread-0 12
Thread-0 13
Thread-0 14
*/
public class StaticSynchronizedExample extends Thread{
    private Printer p;

    StaticSynchronizedExample(Printer p){
        this.p = p;
    }
    public void run(){
        p.looping();
    }
    public static void main(String[] args){
        Printer p1 = new Printer();
        Printer p2 = new Printer();
        Printer p3 = new Printer();
        StaticSynchronizedExample s1 = new StaticSynchronizedExample(p1);
        StaticSynchronizedExample s2 = new StaticSynchronizedExample(p2);
        StaticSynchronizedExample s3 = new StaticSynchronizedExample(p3);
        s1.start();
        s2.start();
        s3.start();

    }

}

class Printer {
    static int counter = 0;

       static synchronized void looping(){
        try{
            Thread.sleep(400);
            for(int i=0;i<5;i++){
                counter += 1;
                System.out.println(Thread.currentThread().getName() + " " + counter);
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

}