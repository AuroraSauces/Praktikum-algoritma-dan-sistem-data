package TugasPraktikum2;

public class Film26 {
    int id;
    String title;
    double rating;
    Film26 prev, next;

    public Film26(int id, String title, double rating) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
