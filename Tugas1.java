import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifListrik = 1500;
        int batasListrik = 500;
         
        System.out.print("Masukkan jumlah penggunaan listrik dalam kWh");
        double penggunaanListrik = sc.nextDouble();
        double totalTagihan = (penggunaanListrik * tarifListrik);
        boolean melebihiBatas = penggunaanListrik > batasListrik;

        System.out.println("Total tagihan listrik : Rp." + totalTagihan);
        System.out.println(
        "Penggunaan listrik " + melebihiBatas);
    
    }
    
}
