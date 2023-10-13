/*
When a thread invokes a synchronized method, it automatically acquires the lock
for that object and releases it when the thread completes its task.

Prints:-(with out synchronization)
starting Thread-1 0
starting Thread-0 0
looping Thread-1 1
looping Thread-0 2
looping Thread-1 3
looping Thread-1 5
looping Thread-0 4
looping Thread-0 7
looping Thread-0 8
looping Thread-1 6
looping Thread-1 10
looping Thread-0 9
ending Thread-1 10
ending Thread-0 10

Prints:-(with synchronization)
starting Thread-0 0
looping Thread-0 1
looping Thread-0 2
looping Thread-0 3
looping Thread-0 4
looping Thread-0 5
ending Thread-0 5
starting Thread-1 5
looping Thread-1 6
looping Thread-1 7
looping Thread-1 8
looping Thread-1 9
looping Thread-1 10
ending Thread-1 10
* * */
public class SynchronizationMethodExample extends Thread{
    Dummy dummy;
    SynchronizationMethodExample(Dummy d){
        this.dummy = d;
    }
    public void run(){
        dummy.looping();
    }

    public static void main(String[] args){
        Dummy d = new Dummy();
        SynchronizationMethodExample s1 = new SynchronizationMethodExample(d);
        SynchronizationMethodExample s2 = new SynchronizationMethodExample(d);
        s1.start();
        s2.start();
    }

}

class Dummy{
    int value = 0;

     synchronized void looping(){
        System.out.println("starting " + Thread.currentThread().getName() + " " + this.value);
        for(int i=0;i<5;i++){
            try{
                this.value += 1;
                System.out.println("looping " + Thread.currentThread().getName() + " " + this.value);
            } catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("ending " + Thread.currentThread().getName() + " " + this.value);
    }
}