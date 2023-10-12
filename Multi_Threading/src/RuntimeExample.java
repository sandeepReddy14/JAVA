/*
Java Runtime class is used to interact with java runtime enviroment.
Java Runtime class provides methods to execute a process, invoke GC, get total
and free memory etc.

public static Runtime getRuntime() returns the instance of Runtime class
public void exit(int status) terminates the current virtual machine
public void addShutdownHook() registers new hook thread
public Process exec(String command) throws IOException executes given command in
a separate process.
public int availableProcessors() returns no of available processors.
public long freeMemory() returns amount of free memory in JVM
public long totalMemory() returns amount of total memory in JVM.
*/

public class RuntimeExample {
    private String name = "sandeep";
    public static void main(String[] args){
        Runtime r = Runtime.getRuntime();
        System.out.println("Total memory before testing " + r.totalMemory());
        System.out.println("Free memory before testing " + r.freeMemory());
        for(int i=0;i<10000;i++){
            new RuntimeExample();
        }
        System.out.println("Free memory after testing " + r.freeMemory());
        r.gc();
        System.out.println("Free memory after gc " + r.freeMemory());

        System.out.println("number of available processors is " + r.availableProcessors());

    }
}
