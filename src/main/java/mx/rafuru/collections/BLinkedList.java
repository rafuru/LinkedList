package mx.rafuru.collections;

import mx.rafuru.collections.exceptions.IndexOutOfBounds;

public class BLinkedList<T> implements BList<T> {

    Node<T> head;

    public BLinkedList() {
    }

    @Override
    public void add(T element) {
        if (head == null) {
            head = new Node(element, null);
            return;
        }
        Node<T> p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(element, null);
        return;
    }

    @Override
    public int size() {
        if (head == null) {
            return 0;
        }
        int size = 0;
        Node<T> p = head;
        while (p != null) {
            size++;
            p = p.next;
        }
        return size;
    }

    @Override
    public T get(int index) {
        if (index > size() - 1) {
            throw new IndexOutOfBounds("Index out of Bounds");
        }
        int i = 0;
        Node<T> p = head;
        while (p != null) {
            if (i == index) {
                break;
            }
            i++;
            p = p.next;
        }
        return p.data;
    }
}
