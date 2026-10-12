
import java.util.*;

class Invoice {
    int price;
    Invoice next;
    Invoice prev;

    Invoice(int price) {
        this.price = price;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Invoice head;
    Invoice tail;

    void append(int price) {
        Invoice n = new Invoice(price);

        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    void removeAt(int position) {
        if (head == null || position <= 0) {
            return;
        }

        Invoice current = head;

        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
    }
}

class Remove_At {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        DoublyLinkedList dll = new DoublyLinkedList();

        for (int i = 0; i < N; i++) {
            dll.append(sc.nextInt());
        }

        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int position = sc.nextInt();
            dll.removeAt(position);
        }

        Invoice invoice = dll.head;
        while (invoice != null) {
            System.out.print(invoice.price + " ");
            invoice = invoice.next;
        }

        System.out.println();

        invoice = dll.tail;
        while (invoice != null) {
            System.out.print(invoice.price + " ");
            invoice = invoice.prev;
        }

        System.out.println();
        sc.close();
    }
}