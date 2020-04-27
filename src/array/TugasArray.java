package array;

import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {
        // membuat array Nama Buah
        String[] nama = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for (int i = 0; i < nama.length; i++){
            System.out.print("Nama Buah " + i + ":");
            nama[i] = scan.nextLine();
    }
}
