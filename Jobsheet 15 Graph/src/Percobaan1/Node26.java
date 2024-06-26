package Percobaan1;

public class Node26 {
    int data;
    int jarak;
    Node26 prev;
    Node26 next;

    public Node26(Node26 prev, int data, int jarak, Node26 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}

