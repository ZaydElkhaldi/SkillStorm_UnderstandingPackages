package utils;

import java.util.ArrayList;

public class ZList <T>{
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static void main(String[] args) {
        ZList<String> list = new ZList<String>();
        list.setData("data");
        System.out.println(list.getData());

        ZList<Integer> numlist = new ZList<Integer>();
        numlist.setData(123);
        System.out.println(numlist.getData());

        ArrayList<ZList<String>> listOfLists = new ArrayList<ZList<String>>();

    }
}

// Memory
// Stack(ShortTerm) vs Heap(LongTerm)
// Stack stores primitive data types (int, short, long, bytes, etc)
// Stack stores variables, results of methods


