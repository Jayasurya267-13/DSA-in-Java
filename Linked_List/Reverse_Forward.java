
import java.util.*;

class node {
    int price;
    node next;
    node prev;

    node(int price) {
        this.price = price;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    node head;
    node tail;

    void prepend(int price) {
        node n = new node(price);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    void printReverse() {
        node current = tail;

        while (current != null) {
            System.out.print(current.price + " ");
            current = current.prev;
        }
        System.out.println();
    }

    void printForward() {
        node current = head;

        while (current != null) {
            System.out.print(current.price + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Reverse_Forward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        DoublyLinkedList dll = new DoublyLinkedList();

        for (int i = 0; i < N; i++) {
            int price = sc.nextInt();
            dll.prepend(price);
        }

        dll.printForward();
        dll.printReverse();

        sc.close();
    }
}