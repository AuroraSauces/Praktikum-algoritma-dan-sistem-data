package Praktikum2;
public class Queue2 {
    Nasabah26[] data;
    int front, rear, size, max;

    Queue2(int n) {
        max = n;
        data = new Nasabah26[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: " + data[front].norek + " " + data[front].nama + " " + data[front].alamat +
                    " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat +
                        " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat +
                    " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang: " + data[rear].norek + " " + data[rear].nama + " " + data[rear].alamat +
                    " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void Enqueue(Nasabah26 dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = dt;
            size++;
        }
    }

    Nasabah26 Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            return null;
        } else {
            Nasabah26 dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
            return dt;
        }
    }
}
