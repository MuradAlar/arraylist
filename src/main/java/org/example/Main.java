package org.example;

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
    }
}