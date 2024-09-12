import java.util.Scanner;

Import java.util.scanner;
public class Tugas2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (system.in);

    double upahPerjam, jam;
    
    System.out.println("Masukkan upah perjam");
    upahPerjam = sc.nextDouble()
    System.out.println("Masukkan lama bekerja");
    jam = sc.nextDouble()

    double gajiSebulan = (upahPerjam * jam);
    double bonus = (gajiSebulan * 0.1);
    double pajak = ((gajiSebulan + bonus) * 0.05);
    double gajibersih = (gajiSebulan + bonus - pajak);

    System.out.println("Gaji dan bonus satu bulan : " + gajiSebulan;
    System.out.println("Bonus sebulan : " + bonus);
    System.out.println("Total gaji yang didapatkan : " + gajibersih);
    }
}
