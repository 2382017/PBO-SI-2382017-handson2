import java.util.Scanner;

public class Tugas {
    /**
     * Buatlah sebuah program yang mengambil 2 input number dari user
     * Program tersebut akan print out nilai yang paling besar
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka2 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka4 = scanner.nextInt();
        int nilaiTerbesar = (angka2 > angka4) ? angka2 : angka4;
        System.out.println("Nilai yang paling besar adalah: " + nilaiTerbesar);
        scanner.close();
    }
}