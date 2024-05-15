public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        System.out.println("Original List:");
        dll.print();
        dll.deleteLast();
        dll.print();
        dll.printFromTail();
        split(dll);
        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        //lanjutkan dengan memanggil method merge, split
    
    }   

    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1,
            DoubleLinkedList dll2){
        //complete this method
    }
    
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll) {
        if (dll.isEmpty() || dll.head == dll.tail) {
        } else {
            DoubleLinkedList dll2 = new DoubleLinkedList();
            Node slow = dll.head;
            Node fast = dll.head;
    
            while (fast.n!= null && fast.n.n!= null) {
                slow = slow.n;
                fast = fast.n.n;
            }
    
            dll2.head = slow.n;
            dll2.head.p = null;
            slow.n = null;
            dll2.tail = dll.tail;
            dll2.size = dll.size - (dll.size / 2);
            dll.size = dll.size / 2;

            System.out.println("List 1:");
            dll.print();
            System.out.println("List 2:");
            dll2.print();
        }
    }
}
