import java.util.Scanner;

public class SearchNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int hasil = 0;

        System.out.print("Masukkan banyak nilai yang akan diinput : ");
        int jumlah = sc.nextInt();
        int[] arrNilai = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari : ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key==arrNilai[i]) {
                hasil = i;
                break;
            } 
        }
        
        if (hasil != 0) {
            System.out.println("Nilai ditemukan pada indeks ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        
    }
}
