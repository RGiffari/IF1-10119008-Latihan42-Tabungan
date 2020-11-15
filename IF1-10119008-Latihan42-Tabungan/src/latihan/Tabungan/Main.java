package latihan.Tabungan;

/*
 * @author Raihan Giffari
 *
 * Nama  : Raihan Giffari
 * Nim   : 10119008
 * Kelas : IF1
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("====Program Penarikan Saldo====");
        System.out.print("Masukkan saldo awal : ");
        Tabungan tabungan = new Tabungan(scan.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int sisaSaldo = tabungan.ambilTabungan(scan.nextInt());
        System.out.println("Saldo Anda Sekarang : "+sisaSaldo);
    }
}