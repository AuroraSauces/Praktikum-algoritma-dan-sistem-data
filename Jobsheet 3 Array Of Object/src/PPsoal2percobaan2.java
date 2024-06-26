public class PPsoal2percobaan2 {
    public static class PersegiPanjang {
        public int panjang;
        public int lebar;
    }

    public static void main(String[] args) {
        PersegiPanjang[][] ppArray = new PersegiPanjang[3][3];

        // Membuat objek dan mengisinya ke dalam array dua dimensi
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ppArray[i][j] = new PersegiPanjang();
                ppArray[i][j].panjang = i + j;
                ppArray[i][j].lebar = i * j;
            }
        }

        // Menampilkan isi array dua dimensi
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Persegi panjang di posisi [" + i + "][" + j + "]");
                System.out.println("Panjang: " + ppArray[i][j].panjang);
                System.out.println("Lebar: " + ppArray[i][j].lebar);
            }
        }
    }
}