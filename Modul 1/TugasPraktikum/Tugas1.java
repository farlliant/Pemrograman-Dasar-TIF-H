package TugasPraktikum;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan operator pertama: ");
        int op1 = input.nextInt();
        System.out.print("Masukkan operator kedua  : ");
        int op2 = input.nextInt();
    
        System.out.println("Hasil penjumlahan : " + (op1 + op2));
        System.out.println("Hasil pengurangan : " + (op1 - op2));
        System.out.println("Hasil perkalian   : " + (op1 * op2));
        System.out.println("Hasil pembagian   : " + ((double) op1 / op2));
    }
}