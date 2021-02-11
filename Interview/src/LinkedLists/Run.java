package LinkedLists;

public class Run {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.printList();

        DoublyLinkedList<Integer> list1 = new DoublyLinkedList<>();
        list1.append(1);
        list1.prepend(0);
        list1.append(2);
        list1.append(3);
        list1.prepend(-1);
        list1.printList();
    }
}
