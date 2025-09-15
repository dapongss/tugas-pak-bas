package TugasAccessModifier;
import java.util.*;
//mason
public class MainCompany {
    static Scanner input = new Scanner(System.in);
    static pegawai Employee;
    public static void main(String[] args) {
        System.out.println(" Masukkan Nama Employee: ");
        String name = input.nextLine();
        System.out.println("Masukkan Id Employee: ");
        int id = input.nextInt();
        System.out.println("Masukkan Gaji Pokok: ");
        double salary = input.nextDouble();
        System.out.println("apakah seorang manager? (Y|N)");
        char charY = input.next().charAt(0);

        if (Character.toLowerCase(charY) == 'y') {
            input.nextLine();
            System.out.println("Masukkan Divisi: ");
            String division = input.nextLine();
            Employee = new manager(name, id, salary, division);
            // Employee.TampilkanData();
        } else {
            Employee = new pegawai(name, id, salary);
            // Employee.TampilkanData();
        }

        System.out.println("\n|^^INFORMASI DATA^^|");
        Employee.TampilkanData();
    }
}