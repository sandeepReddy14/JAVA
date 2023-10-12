import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Thread pool represents a group of worker threads that are waiting for the job and
reused many times.
A group of fixed-size threads is created. A thread from the thread pool is pulled
out and assigned a job by the service provider. After completion of the job, the
thread is contained in the thread pool again.
A thread pool provides a better performance because there is no need to create
new threads and time is saved.

newFixedThreadPool(int s) method creates a thread pool of the fixed size s.
newCachedThreadPool() method creates a new thread pool that creates the new threads
when needed but uses previously created thread pool if they are available.
newSingleThreadExecutor() method creates a new thread.

Thread Pool is implemented using ExecutorService and Executors.

If there are more jobs to be executed only after a thread is available a job is assigned to free thread.

Deadlocks can occur in thread pool if threads running are waiting for results from the threads
that are blocked & waiting in the queue because of the non-availability of threads for execution.

Thread leakage, when a thread throws some exception and the pool class is not able to catch this exception,
then the thread exits and thread pool size reduces by 1. If it continues to happen then thread pool may be become
empty and no threads will be available in the pool for execution.

When thread pool size is very large a lot of time is wasted in context-switching.

Maximum size of a thread pool can be P or P+1 where is processor count.

*/
public class ThreadPool implements Runnable{
    private String message;
    public ThreadPool(String s) {
        this.message = s;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " start." + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " end." + message);
    }

    public void processMessage(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=0;i<10;i++){
            executorService.execute(new ThreadPool(""+i));
        }
        executorService.shutdown();

        while(!executorService.isTerminated()){}
        System.out.println("Finished all threads.");
    }
}
