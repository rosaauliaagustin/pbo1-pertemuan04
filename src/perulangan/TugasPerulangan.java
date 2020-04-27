package perulangan;

import java.util.Scanner;

public class TugasPerulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Untuk mengimput nilai/data dari user

        System.out.println ("-----|PENGURANGAN|-----");
        System.out.print ("Masukkan Angka yang ingin di kurangkan = ");
        int angka = input.nextInt();

        for (int i = 1; i <= 10; ++i)
            System.out.println (i+". Hasil dari Pengurangan "+i+" - "+angka+" = "+(i-angka));

    }
}
