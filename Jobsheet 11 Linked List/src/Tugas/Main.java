package Tugas;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();

        singLL.addLast(111, "Anton");
        singLL.print();

        singLL.addLast(112, "Prita");
        singLL.print();

        singLL.addLast(113, "Yusuf");
        singLL.print();

        singLL.addLast(114, "Doni");
        singLL.print();

        singLL.addLast(115, "Sari");
        singLL.print();
    }
}

