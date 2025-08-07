import java.util.Scanner;

public class DiskonBaju {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan total belanja (Rp): ");
        double totalBelanja = input.nextDouble();

        // 2. Hitung diskon
        double diskon = 0;
        if (totalBelanja >= 500000) {
            diskon = 0.20;
        } else if (totalBelanja >= 300000) {
            diskon = 0.10;
        }

        double jumlahDiskon = totalBelanja * diskon;
        double totalBayar = totalBelanja - jumlahDiskon;

        // 3. Output
        System.out.println("\nNama Pelanggan: " + nama);
        System.out.println("Total Belanja: Rp" + totalBelanja);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total Bayar setelah diskon: Rp" + totalBayar);
    }
}

