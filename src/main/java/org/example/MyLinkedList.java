package org.example;

public class MyLinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head; //  first node
    private int size;
    private Node<T> tail;


    // add to end
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode; //in case of single element
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // Get by index
    public T get(int index) {
        checkIndex(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    //  Remove by index
    public void remove(int index) {
        checkIndex(index);

        // remove the very first node
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null; // empty
            }
        } else {
            // remove a node in the middle or at the end
            Node<T> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }

            //  node to delete
            Node<T> nodeRemove = prev.next;

            if (nodeRemove == tail) {
                tail = prev;
            }

            // connect prev to the node
            prev.next = nodeRemove.next;
        }
        size--;
    }

    public int size() {
        return size;
    }


}