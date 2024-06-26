package TugasPraktikum1;

public class Node26 {
    int nomorData;
    String data;
    Node26 prev, next;

    Node26(Node26 prev, String data, Node26 next, int nomorData){
        this.prev=prev;
        this.data=data;
        this.next=next;
        this.nomorData=nomorData;
    }
}