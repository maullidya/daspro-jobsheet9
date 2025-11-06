import java.util.Arrays;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int rata2, total =0;
      System.out.print("Masukkan banyak nilai mahasiswa yang akan diinput : "); 
      int bnykNilai = sc.nextInt();
      int[] nilai = new int[bnykNilai];
       int tertinggi = 0;
      int terendah = 100;
      for (int i = 0; i < bnykNilai; i++) {
        System.out.print("Masukkan nilai ke-"+(i+1)+ " : ");
        nilai[i] = sc.nextInt();
        total += nilai[i];
      }
      for (int i = 0; i < bnykNilai; i++) {
        if (nilai[i]>tertinggi) {
            tertinggi = nilai[i];
        }
        if (nilai[i]<terendah) {
            terendah = nilai[i];
        }
      };

      rata2 = total/bnykNilai;
      System.out.println("Rata-rata nilai mahasiswa adalah " +rata2);

    System.out.println("Nilai terbesar adalah: " + tertinggi);
    System.out.println("Nilai terkecil adalah: " + terendah);
   
    System.out.println("Berikut adalah semua nilai yang sudah dimasukkan : " +Arrays.toString(nilai) );
    }
}
 