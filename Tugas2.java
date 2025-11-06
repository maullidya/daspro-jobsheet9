import java.util.Arrays;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Masukkan jumlah pesanan : ");  
      int jml_psn = sc.nextInt();
      sc.nextLine();

      String[] pesanan = new String[jml_psn];
      int [] harga = new int[jml_psn];
      int total = 0;

      for (int i = 0; i < jml_psn; i++) {
        System.out.print("Masukkan pesanan ke-"+(i+1)+ " : ");
        pesanan[i] = sc.nextLine();

        System.out.print("Masukkan harga pesanan : ");
        harga[i] = sc.nextInt();
        sc.nextLine();
        total += harga[i];
      }
      System.out.println("Berikut adalah daftar pesanan : " + Arrays.toString(pesanan));
      System.out.println("Berikut adalah total harga : " + total);
    }
}
