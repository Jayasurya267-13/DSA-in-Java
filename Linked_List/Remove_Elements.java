
import java.util.*;

class node {
    int price;
    node next;

    node(int price) {
        this.price = price;
        this.next = null;
    }
}

class SinglyLinkedList {
    node head;
    node tail;

    void append(int price) {
        node n = new node(price);

        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    void removeAt(int position) {
        if (head == null || position <= 0) {
            return;
        }

        // Remove the first node
        if (position == 1) {
            head = head.next;

            if (head == null) {
                tail = null;
            }
            return;
        }

        node current = head;

        // Reach the node before the target
        for (int i = 1; i < position - 1; i++) {
            if (current.next == null) {
                return;
            }
            current = current.next;
        }

        if (current.next == null) {
            return;
        }

        node deleted = current.next;
        current.next = deleted.next;

        // Update tail if the last node is removed
        if (deleted == tail) {
            tail = current;
        }
    }
}

class Remove_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        SinglyLinkedList sll = new SinglyLinkedList();

        for (int i = 0; i < N; i++) {
            sll.append(sc.nextInt());
        }

        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int position = sc.nextInt();
            sll.removeAt(position);
        }

        node current = sll.head;

        while (current != null) {
            System.out.print(current.price + "->");
            current = current.next;
        }

        System.out.println("NULL");
        sc.close();
    }
}