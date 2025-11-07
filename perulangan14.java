import java.util.Scanner;

public class perulangan14 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
         //inisialisasi tertinggi//
         double nilai, tertinggi = 0, terendah = 100;
         for ( int i = 1; i <= 10; i++) {
            System.out.print(" masukkan nilai mahsiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi ) {
                tertinggi = nilai ;
            }
            if (nilai < terendah) {
                terendah = nilai ;
            }
            
    }
            // nilai tertinggi dan terendah //
            System.out.println(" nilai tertinggi" + tertinggi);
            System.out.println(" nilai terendah"+ terendah );
}
}