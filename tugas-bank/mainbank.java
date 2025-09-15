package Rothschild;

import java.util.*;

public class MainBank {
    static Scanner input = new Scanner(System.in);
    static rekening Rekening;
    public static void main(String[] args) {
        
        System.out.println(" Masukkan Nomor Rekening: ");
        String noRek = input.nextLine();
        System.out.println("Masukkan Saldo: ");
        double saldo = input.nextDouble();
        System.out.println("Pilih Jenis Rekening: \n1. Tabungan \n2. Giro \n3. Deposito");
        int choices = input.nextInt();

        if (choices == 1)
        {
            Rekening = new rekeningTabungan(noRek, saldo);
        }
        else if (choices == 3)
        {

            Rekening = new rekeningDeposito(noRek, saldo);
        }
        else if (choices == 2)
        {
            Rekening = new rekeningGiro(noRek, saldo);
        }
        else
        {
            System.out.println("Pilihan tidak tersedia");
            System.exit(0);
        }

        System.out.println("\n|^^INFORMASI REKENING^^|");
        Rekening.TampilkanData(Rekening.NoRekening, Rekening.saldo);
        System.out.printf("Bunga yang didapat: " + Rekening.HitungBunga(0));
    }
} //mason