import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berat badan (kg) : ");
        double beratBadan = input.nextDouble();

        System.out.print("Tinggi badan (m) : ");
        double tinggiBadan = input.nextDouble();

        double imt =
                beratBadan / (tinggiBadan * tinggiBadan);

        String kategori;

        if (imt <= 18.5) {
            kategori = "kurus";
        } else if (imt <= 25) {
            kategori = "normal";
        } else if (imt <= 30) {
            kategori = "gemuk";
        } else {
            kategori = "kegemukan";
        }

        System.out.printf(
                "IMT = %.2f Termasuk %s%n",
                imt,
                kategori
        );

        input.close();
    }
}