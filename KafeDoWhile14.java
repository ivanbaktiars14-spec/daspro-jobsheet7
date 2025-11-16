import java.util.Scanner;

public class KafeDoWhile14   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            // jika pelanggan batal
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            // input item
            System.out.print("Jumlah kopi : ");
            kopi = sc.nextInt();

            System.out.print("Jumlah teh : ");
            teh = sc.nextInt();

            System.out.print("Jumlah roti : ");
            roti = sc.nextInt();

            // hitung total
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga untuk " + namaPelanggan + " adalah Rp " + totalHarga);

            sc.nextLine(); // bersihkan buffer

        } while (true); // perulangan terus sampai 'batal'

        sc.close();
    }
}
