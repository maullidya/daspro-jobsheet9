import java.util.Arrays;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] menu = {"Nasi goreng", "Mie goreng", "Ayam bakar", "Es teh", "Teh tarik", "Kopi susu", "Kopi"};
        String key;
        int hasil = 0;
        // System.out.println("Daftar Menu : " +Arrays.toString(menu));
        System.out.print("Pesanan anda : ");
        key = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                hasil = i;
                break;
            } 
        }
        
        if (hasil != 0) {
            System.out.println("Makanan tersedia");
        } else {
            System.out.println("Makanan tidak tersedia");
        }    }
}
