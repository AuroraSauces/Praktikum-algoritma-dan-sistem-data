package Hotel;
public class mainhotel26 {
    public static void main(String[] args) {
    hotelservice26 list = new hotelservice26();
    hotel26 h1 = new hotel26("Semua Bisa", "Malang", 350000, (byte)3);
    hotel26 h2 = new hotel26("Jambul Merak", "Blitar", 145000, (byte)2);
    hotel26 h3 = new hotel26("Shaudagar Khaya", "Kediri", 550000, (byte)5);
    hotel26 h4 = new hotel26("Kejora kita", "Madura", 90000, (byte)1);
    
    list.tambahHotel(h1);
    list.tambahHotel(h2);
    list.tambahHotel(h3);
    list.tambahHotel(h4);

    System.out.println("Data Harga Hotel sebelum sorting:");
    list.tampil();
    System.out.println("=======================================");
    System.out.println("Daftar Hotel Berdasarkan Bintang");
    System.out.println("Metode Bubble Sort");
    list.bubbleSortRtHotel();
    list.tampil();
    System.out.println("=========================================");
    System.out.println("Metode Selection Sort");
    list.selectionSortRtHotel();;
    list.tampil();
    System.out.println("===========================================");
    System.out.println("Daftar Hotel Berdasarkan Harga");
    System.out.println("Metode Bubble Sort");
    list.bubbleSortHrgHotel();
    list.tampil();
    System.out.println("============================================");
    System.out.println("Metode Selection Sort");
    list.selectionSortHrgHotel();
    list.tampil();
    System.out.println("===============================================");
    }
}