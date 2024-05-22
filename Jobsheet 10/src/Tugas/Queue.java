package Tugas;

public class Queue {
    Pembeli antrian [];
    int front, rear, size, max;

    Queue (int n){
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }
    boolean isEmpty (){
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    boolean isFull (){
        if (size == max) {
            return true;
        }
        else {
            return false;
        }
    }
    void Enqueue (Pembeli dt){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        }else{
            if (isEmpty()) {
                front = rear = 0;
            }else{
                if (rear == max - 1) {
                 rear = 0;
                }else{
                    rear ++;
                }        
            }
            antrian[rear] = dt;
            size++;
        }
    }
    Pembeli Dequeue (){
        Pembeli dt = new Pembeli();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            dt = antrian[front];
            size --;
            if (isEmpty()) {
                front = rear = -1;
            }else{
                if (front == max -1) {
                    front = 0;
                }else{
                    front ++;
                }
            }
        }
        return dt;
    }
    void peek (){
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: "+antrian[front].nama+" "+antrian[front].noHp);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    void print (){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i !=rear) {
                System.out.println(antrian[front].nama+" "+antrian[front].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[front].nama+" "+antrian[front].noHp);
            System.out.println("Jumlah elemen = "+size);
        }
    }
    void peekRear (){
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang: "+antrian[rear].nama+" "+antrian[rear].noHp);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    void peekPosition (String pembeli){
        if (!isEmpty()) {
        int position = -1;
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                if (antrian[index].nama.equals(pembeli)) {
                    position = i + 1; 
                if (position != -1) {
                System.out.println("Posisi " + pembeli+ " dalam antrian: " + position);
                } else {
                System.out.println("Posisi" + pembeli+ " tidak diketahui");
                }
                    break;
                }
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    void daftarPembeli (){
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + "\t| " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + "\t| " + antrian[i].noHp);
            System.out.println("Jumlah elemen = " + size);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    }