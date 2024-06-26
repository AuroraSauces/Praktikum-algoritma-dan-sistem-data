package Tugas;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node temp = head;
            System.out.print("Isi Linked List: ");
            while (temp != null) {
                System.out.print("\tNIM: " + temp.nim + ", Nama: " + temp.nama);
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int nim, String nama) {
        Node newNode = new Node(nim, nama);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int nim, String nama) {
        Node newNode = new Node(nim, nama);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter(int keyNim, int nim, String nama) {
        Node newNode = new Node(nim, nama);
        Node temp = head;
        while (temp != null) {
            if (temp.nim == keyNim) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int nim, String nama) {
        if (index < 0) {
            System.out.println("Indeks tidak boleh negatif");
        } else if (index == 0) {
            addFirst(nim, nama);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                temp.next = new Node(nim, nama);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            } else {
                System.out.println("Indeks melebihi jumlah elemen dalam list");
            }
        }
    }

    int getData(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak boleh negatif");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                System.out.println("Indeks melebihi jumlah elemen dalam list");
                return -1;
            }
            temp = temp.next;
        }
        return temp != null ? temp.nim : -1;
    }

    int indexOf(int keyNim) {
        Node temp = head;
        int index = 0;
        while (temp != null && temp.nim != keyNim) {
            temp = temp.next;
            index++;
        }
        return temp == null ? -1 : index;
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int keyNim) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head.nim == keyNim) {
            removeFirst();
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.next != null && temp.next.nim == keyNim) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak boleh negatif");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Indeks melebihi jumlah elemen dalam list");
                    return;
                }
                temp = temp.next;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
            } else {
                System.out.println("Indeks melebihi jumlah elemen dalam list");
            }
        }
    }
}

