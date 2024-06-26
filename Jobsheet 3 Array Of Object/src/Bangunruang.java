import java.util.Scanner;

public class Bangunruang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kerucut[] krc = new Kerucut[1];
        LimasSegiempat[] lmssegiempat = new LimasSegiempat[1];
        Bola[] bl = new Bola[1];

        for (int i = 0; i < krc.length; i++) {
            krc[i] = new Kerucut();
            System.out.println("\nKerucut ke-" + (i+1));
            System.out.print("Masukkan jari-jari: ");
            krc[i].jarikrc = sc.nextInt();
            System.out.print("Masukkan sisi miring: ");
            krc[i].sisimiring = sc.nextInt();
        }

        for (int i = 0; i < lmssegiempat.length; i++) {
            lmssegiempat[i] = new LimasSegiempat();
            System.out.println("\nLimas Segi Empat Sama Sisi ke-" + (i+1));
            System.out.print("Masukkan sisi alas: ");
            lmssegiempat[i].sisi = sc.nextInt();
            System.out.print("Masukkan tinggi limas: ");
            lmssegiempat[i].tinggi = sc.nextInt();
        }

        for (int j = 0; j < bl.length; j++) {
            System.out.println("\nBola ke-" + (j+1));
            System.out.print("Masukkan jari-jari: ");
            bl[j] = new Bola(sc.nextInt());
        }

        for (int j2 = 0; j2 < bl.length; j2++) {
            System.out.printf("\nKerucut ke-%d\n", (j2+1));
            System.out.printf("Volume: %.2f\n", krc[j2].volumekerucut());
            System.out.printf("Luas Permukaan: %.2f\n", krc[j2].luasPermukaankerucut());

            System.out.printf("\nLimas Segi Empat Sama Sisi ke-%d\n", (j2+1));
            System.out.printf("Volume: %.2f\n", lmssegiempat[j2].volume());
            System.out.printf("Luas Permukaan: %.2f\n", lmssegiempat[j2].luasPermukaan());

            System.out.printf("\nBola ke-%d\n", (j2+1));
            System.out.printf("Volume: %.2f\n", bl[j2].volumebola());
            System.out.printf("Luas Permukaan: %.2f\n", bl[j2].Luaspermukaanbola());
        }sc.close();
    }
}
