import java.util.*;

class programme
{
    static Scanner input = new Scanner(System.in);
    static kasir kasir = new kasir();
    static security guard = new security();
    static waiters servant = new waiters();
    static manager boss = new manager();
    static koki chef = new koki();

    static
    {
        boss.nama = "Andi";
        boss.id_pegawai = 1;
        boss.gaji = "Rp. 5.000.000";
        // boss.menampilkan();
        // boss.tugas();

        kasir.nama = "Rizky";
        kasir.id_pegawai = 2;
        kasir.gaji = "Rp. 2.500.000";
        // kasir.menampilkan();
        // kasir.tugas();

        guard.nama = "Budi";
        guard.id_pegawai = 3;
        guard.gaji = "Rp. 2.000.000";
        // guard.menampilkan();
        // guard.tugas();

        servant.nama = "Siti";
        servant.id_pegawai = 4;
        servant.gaji = "Rp. 2.200.000";
        // servant.menampilkan();
        // servant.tugas();

        chef.nama = "Agus";
        chef.id_pegawai = 5;
        chef.gaji = "Rp. 3.000.000";
        // chef.menampilkan();
        // chef.tugas();
    }

    public static void tampilkan()
    {
        System.out.print("Masukkan ID Pegawai : ");
        int input = programme.input.nextInt();
        
        System.out.println("------------------------------------------------------");

        if (kasir.id_pegawai == input)
        {
            kasir.menampilkan();
            kasir.tugas();
        } 
        else if (guard.id_pegawai == input) 
        {
            guard.menampilkan();
            guard.tugas();
        } 
        else if (servant.id_pegawai == input) 
        {
            servant.menampilkan();
            servant.tugas();
        }
        else if (boss.id_pegawai == input) 
        {
            boss.menampilkan();
            boss.tugas();
        }
        else if (chef.id_pegawai == input)
         {
            chef.menampilkan();
            chef.tugas();
        }
        else 
        {
            System.out.println("Data tidak ditemukan untuk ID: " + input);
        }
}

public class Main {
    public static void main(String[] args) {
        programme.tampilkan();
    }
}
}