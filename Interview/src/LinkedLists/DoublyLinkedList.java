package LinkedLists;

public class DoublyLinkedList<T> {
    private DoublyLinkedNode<T> head;
    private DoublyLinkedNode<T> tail;
    private DoublyLinkedNode<T> temp;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    private void initHead(T value) {
        head = new DoublyLinkedNode<T>();
        head.setValue(value);
        tail = head;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void append(T value) {
        if (isEmpty()) {
            initHead(value);
        } else {
            temp = new DoublyLinkedNode<T>();
            temp.setValue(value);
            tail.setNext(temp);
            temp.setPrev(tail);
            tail = temp;
        }
        size++;
    }

    public void prepend(T value) {
        if (isEmpty()) {
            initHead(value);
        } else {
            temp = new DoublyLinkedNode<T>();
            temp.setValue(value);
            temp.setNext(head);
            head.setPrev(temp);
            head = temp;
        }
        size++;
    }

    public void printList() {
        temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + "\t");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
