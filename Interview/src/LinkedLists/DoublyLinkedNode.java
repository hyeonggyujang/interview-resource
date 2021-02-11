package LinkedLists;
/*
    Doubly linked list node definition
     */
public class DoublyLinkedNode<T> {
    private DoublyLinkedNode<T> prev;
    private DoublyLinkedNode<T> next;
    private T value;

    public DoublyLinkedNode() {
    }

    public DoublyLinkedNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedNode<T> prev) {
        this.prev = prev;
    }

    public DoublyLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}