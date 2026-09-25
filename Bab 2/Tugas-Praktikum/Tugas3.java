import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jam kerja : ");
        int jamKerja = input.nextInt();

        int upah;
        int lembur = 0;
        int denda = 0;

        if (jamKerja > 60) {
            upah = 60 * 5000;
            lembur = (jamKerja - 60) * 6000;
        } else {
            upah = jamKerja * 5000;

            if (jamKerja < 50) {
                denda = (50 - jamKerja) * 1000;
            }
        }

        int total = upah + lembur - denda;

        System.out.println("Upah   = Rp. " + upah);
        System.out.println("Lembur = Rp. " + lembur);
        System.out.println("Denda  = Rp. " + denda);
        System.out.println("--------------------");
        System.out.println("Total  = Rp. " + total);

        input.close();
    }
}