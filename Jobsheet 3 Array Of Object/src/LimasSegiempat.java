public class LimasSegiempat {
    int sisi;
    int tinggi;
    
    
    public LimasSegiempat(){
       
    }
    double volume() {
        return (1.0 / 3) * sisi * sisi * tinggi;
    }
    double luasPermukaan() {
        return (0.5 * 4 * sisi * tinggi) + (sisi * sisi);
    }

    
}