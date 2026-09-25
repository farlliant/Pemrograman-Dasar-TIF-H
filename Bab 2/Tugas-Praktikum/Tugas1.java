import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda: ");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();

                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();

                double kelilingPersegiPanjang =
                        2 * (panjang + lebar);

                double luasPersegiPanjang =
                        panjang * lebar;

                System.out.printf(
                        "%nKeliling persegi panjang : %.2f cm%n",
                        kelilingPersegiPanjang
                );

                System.out.printf(
                        "Luas persegi panjang     : %.2f cm2%n",
                        luasPersegiPanjang
                );

                break;

            case 2:
                System.out.print("Masukkan r: ");
                double radius = input.nextDouble();

                double kelilingLingkaran =
                        2 * Math.PI * radius;

                double luasLingkaran =
                        Math.PI * radius * radius;

                System.out.printf(
                        "%nKeliling lingkaran : %.2f cm%n",
                        kelilingLingkaran
                );

                System.out.printf(
                        "Luas lingkaran     : %.2f cm2%n",
                        luasLingkaran
                );

                break;

            case 3:
                System.out.print("Masukkan a: ");
                double a = input.nextDouble();

                System.out.print("Masukkan b: ");
                double b = input.nextDouble();

                System.out.print("Masukkan r: ");
                double r = input.nextDouble();

                double kelilingSegitiga =
                        a + b + r;

                double luasSegitiga =
                        0.5 * a * b;

                System.out.printf(
                        "%nKeliling segitiga : %.2f cm%n",
                        kelilingSegitiga
                );

                System.out.printf(
                        "Luas segitiga     : %.2f cm2%n",
                        luasSegitiga
                );

                break;

            default:
                System.out.println(
                        "Data tak ditemukan, program dihentikan ..."
                );
        }

        input.close();
    }
}