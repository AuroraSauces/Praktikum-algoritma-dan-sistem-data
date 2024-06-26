import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] kode = { 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T', 'P' };
        char[][] kota = {
            { 'B', 'a', 'n', 't', 'e', 'n', },
            { 'J', 'a', 'k', 'a', 'r', 't', 'a' },
            { 'B', 'a', 'n', 'd', 'u', 'n', 'g' },
            { 'C', 'i', 'r', 'e', 'b', 'o', 'n' },
            { 'B', 'o', 'g', 'o', 'r' },
            { 'P', 'e', 'k', 'a', 'l', 'o', 'n', 'g', 'a', 'n' },
            { 'S', 'e', 'm', 'a', 'r', 'a', 'n', 'g' },
            { 'S', 'u', 'r', 'a', 'b', 'a', 'y', 'a' },
            { 'M', 'a', 'l', 'a', 'n', 'g' },
            { 'T', 'e', 'g', 'a', 'l' },

        };

        System.out.print("Masukkan Kode Plat nomor : "); 
        char inpt = sc.next().charAt(0);
        for (int i = 0; i < kode.length; i++) {
            if (inpt==kode[i]) {
                    System.out.print("Plat tersebut merupakan dari Kota ");     
                for (int j = 0; j < kota[i].length; j++) {
                
                    System.out.print(kota[i][j]);
                    
                }
                break;
            }
            
        }
        sc.close();
    }
}