package utils;

// Memory
// Stack(ShortTerm) vs Heap(LongTerm)
// Stack stores primitive data types (int, short, long, bytes, etc)
// Stack stores variables, results of methods
// Stack is emptied at the end of use

// Heap stores objects, has garbage collection take care of memory management


public class MemoryDemo {
    public static void main(String[] args) {
        int x = 10; //Stack
        ZList<Integer> numlist = new ZList<Integer>();
        Integer myInt = 42; // Object reference in stack, actual object is stored in the heap
        numlist.setData(123);

    }
}
