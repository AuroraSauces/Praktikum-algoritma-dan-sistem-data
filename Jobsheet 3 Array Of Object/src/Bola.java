
public class Bola {
        public int jari;

    public Bola (int r){
        jari=r;
    }
    double volumebola(){
        return (4/3)*Math.PI*jari*jari*jari;
    }
    double Luaspermukaanbola (){
        return 4*3.14*jari*jari;
    }
}