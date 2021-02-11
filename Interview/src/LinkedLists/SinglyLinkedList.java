package LinkedLists;

public class SinglyLinkedList<T> {
    private SinglyLinkedNode<T> head;
    private SinglyLinkedNode<T> tail;
    private SinglyLinkedNode<T> temp;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void append(T value) {
        if (isEmpty()) {
            head = new SinglyLinkedNode<T>();
            head.setValue(value);
            tail = head;
        } else {
            temp = new SinglyLinkedNode<T>();
            temp.setValue(value);
            tail.setNext(temp);
            tail = temp;
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
