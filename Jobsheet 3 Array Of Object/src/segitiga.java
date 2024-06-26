public class segitiga {
    public int tinggi;
    public int alas;

    public segitiga(int a, int t) {
        tinggi = t;
        alas = a;
    }

    int hitungLuas() {
        return alas * tinggi / 2;
    }

    double hitungKeliling() {
        double miring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + miring;
    }
}