package utils;

public class GCDemo {
    public static void main(String[] args) {
        GCDemo gcDemo = new GCDemo(); // Created a new instance
        // Java allocates memory for my object
        // reference is placed on the stack
        // Object reference is placed on the stack
        // Object itself is place on the heap
        gcDemo = null; // DeReference the object
        // Object reference on the stack now has no ties to the object
        //  no longer has any reference on the stack
        System.gc(); // requesting that jvm run garbage collector
    }

/*
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called");
        super.finalize();
    }
*/

    // JVM option for optimizing GC
    // -Xms and -Xmx == set initial and max heap size
}
