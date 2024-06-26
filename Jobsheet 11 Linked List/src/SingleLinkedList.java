public class SingleLinkedList {
    Node head, tail;

    Boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List :");
            while (tmp != null) {
                System.out.print("\t" + tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node ndinput = new Node(input, null);
        if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        } else {
            ndinput.next = head;
            head = ndinput;
        }
    }

    void addLast(int input) {
        Node ndinput = new Node(input, null);
        if (isEmpty()) {
            head = ndinput;
            tail = ndinput;
        } else {
            tail.next = ndinput;
            tail = ndinput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("perbaiki logikanya! kalau indeksnya -1 bagaimana");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                temp.next = new Node(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            } else {
                System.out.println("Indeks melebihi jumlah elemen dalam list");
            }
        }
    }

    public int getData(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak boleh negatif");
            return -1;
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            if (tmp == null) {
                System.out.println("Indeks melebihi jumlah elemen dalam list");
                return -1;
            }
            tmp = tmp.next;
        }
        return tmp != null ? tmp.data : -1;
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
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

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            if (head.data == key) {
                removeFirst();
                return;
            }
            Node temp = head;
            while (temp != null) {
                if (temp.next != null && temp.next.data == key) {
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

    public void removeAt(int index) {
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