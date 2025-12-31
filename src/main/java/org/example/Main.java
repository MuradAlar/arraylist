package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(21);
        list.add(42);
        list.add(13);
        list.add(0);
        System.out.println("size is 4: " + list.size());
        System.out.println("index 1 should be 42: " + list.get(1));
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(2);
        System.out.println(list.get(2));
        list.add(null);
        List<String> l = new LinkedList<>();



        MyLinkedList<String> list2 = new MyLinkedList<>();
        list2.add("Java");
        list2.add("is");
        list2.add("not");
        list2.add("easy to learn");

        boolean b = list2.size() == 3;
         list2.get(0).equals("Java");
         list2.get(2).equals("I'm Done");
        System.out.println(b);
    }
}