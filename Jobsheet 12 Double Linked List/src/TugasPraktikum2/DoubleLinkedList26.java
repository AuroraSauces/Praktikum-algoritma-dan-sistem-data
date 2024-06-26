package TugasPraktikum2;

public class DoubleLinkedList26 {

    Film26 head, tail;

    public void addAtBeginning(int id, String title, double rating) {
        Film26 newFilm = new Film26(id, title, rating);
        if (head == null) {
            head = tail = newFilm;
        } else {
            newFilm.next = head;
            head.prev = newFilm;
            head = newFilm;
        }
    }

    public void addAtEnd(int id, String title, double rating) {
        Film26 newFilm = new Film26(id, title, rating);
        if (head == null) {
            head = tail = newFilm;
        } else if (head == tail) {
            tail = newFilm;
            head.next = tail;
            tail.prev = head;
        } else {

            tail.next = newFilm;
            newFilm.prev = tail;
            tail = newFilm;
        }
    }
    

    public void addAtIndex(int id, String title, double rating, int index) {
        Film26 newFilm = new Film26(id, title, rating);
        if (index == 0) {
            addAtBeginning(id, title, rating);
        } else {
            Film26 temp = head;
            int currentIndex = 0;
            while (temp != null && currentIndex < index - 1) {
                temp = temp.next;
                currentIndex++;
            }
            if (temp != null) {
                newFilm.next = temp.next;
                newFilm.prev = temp;
                if (temp.next != null) {
                    temp.next.prev = newFilm;
                }
                temp.next = newFilm;
                if (temp == tail) {
                    tail = newFilm;
                }
            } else {
                System.out.println("Posisi " + index + " tidak valid.");
            }
        }
    }
    
    

    public void deleteFromBeginning() {
        if (head != null) {
            if (head.next != null) {
                head = head.next;
                head.prev = null;
            } else {
                head = tail = null;
            }
        }
    }

    public void deleteFromEnd() {
        if (head != null) {
            if (tail.prev != null) {
                tail = tail.prev;
                tail.next = null;
            } else {
                head = tail = null;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            deleteFromBeginning();
        } else {
            Film26 temp = head;
            for (int i = 0; i < index && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            } else if (temp == tail) {
                tail = temp.prev;
                tail.next = null;
            }
        }
    }

    public void printList() {
        Film26 temp = head;
        while (temp != null) {
            System.out.println("ID Film: " + temp.id);
            System.out.println("Judul Film: " + temp.title);
            System.out.println("Rating Film: " + temp.rating);
            System.out.println();
            temp = temp.next;
        }
    }

    public void searchById(int id) {
        Film26 temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("ID Film: " + temp.id);
                System.out.println("Judul Film: " + temp.title);
                System.out.println("Rating Film: " + temp.rating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    public void sortByRatingDesc() {
        if (head != null) {
            boolean swapped;
            do {
                swapped = false;
                Film26 current = head;
                while (current.next != null) {
                    if (current.rating < current.next.rating) {
                        int tempId = current.id;
                        String tempTitle = current.title;
                        double tempRating = current.rating;

                        current.id = current.next.id;
                        current.title = current.next.title;
                        current.rating = current.next.rating;

                        current.next.id = tempId;
                        current.next.title = tempTitle;
                        current.next.rating = tempRating;

                        swapped = true;
                    }
                    current = current.next;
                }
            } while (swapped);
        }
    }
    public static class Film26 {
     int id;
     String title;
     double rating;
     Film26 prev;
     Film26 next;

        public Film26(int id, String title, double rating) {
            this.id = id;
            this.title = title;
            this.rating = rating;
            this.prev = null;
            this.next = null;
        }
    }
}
