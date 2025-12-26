package org.example;

import java.util.List;

public class MyArrayList<T> {

    private Object[] elements;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // add
    public void add(T value) {
        ensureCapacity();
        elements[size] = value;
        size++;
    }

    // get
    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    // remove by index
    public void remove(int index) {
        checkIndex(index);

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }


        elements[--size] = null;
    }

    // size
    public int size() {
        return size;
    }

    // contains
    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    // ensure capacity
    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newArray = new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = elements[i];
            }
            this.elements = newArray;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Error at: " + index);
        }
    }

}
