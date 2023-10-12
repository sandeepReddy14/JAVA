/*
Garbage collection is process of reclaiming the runtime unused memory
automatically. In other words, it is a way to destroy unused objects.
It removes unreferenced objects from heap memory and makes java memory efficient.
It is a part of JVM.

protected void finalize() method is invoked each time before the object is garbage
collected. This method can be used to perform cleanup processing. This method is deprecated.

public static void gc() method is invoked to start garbage collection.
gc() is found in Runtime and System classes.

*/

public class GarbageCollectionExample {
    public static void main(String[] args){
        new GarbageCollectionExample();
        GarbageCollectionExample g1 = new GarbageCollectionExample();
        GarbageCollectionExample g2 = new GarbageCollectionExample();
        g1=g2;
        System.gc();
    }

}
