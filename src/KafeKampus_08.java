import java.util.Scanner;

public class KafeKampus_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("====== Kafe Kampus Polinema ======\n" +
                           "| -Nasi Goreng    |      Rp15.000|\n" +
                           "| -Mie Goreng     |      Rp13.000|\n" +
                           "| -Roti Bakar     |      Rp10.000|\n" +
                           "| -Kentang Goreng |      Rp12.000|\n" +
                           "| -Teh Tarik      |      Rp8.000 |\n" +
                           "| -Cappucino      |      Rp18.000|\n" +
                           "| -Chocolate Ice  |      Rp20.000|\n" +
                           "=================================="
        );

        System.out.println("\n================= Pemesanan =================");
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String pesananUser[] = new String[jumlahPesanan];
        int totalBiaya = 0;
        
        for(int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukan menu pesanan ke-" + (i + 1) + ": ");
            String pesanan = sc.nextLine();

            boolean ditemukan = false;
            for(int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(pesanan)) {
                    pesananUser[i] = menu[j];
                    ditemukan = true;
                    totalBiaya += harga[j];
                    break;
                }   
            }

            if (ditemukan == false) {
                    System.out.println("Maaf, menu tidak tersedia!");
            }
        }

        System.out.println("\n======== Struk Pemesanan ========");
        for(int i = 0; i < pesananUser.length; i++) {
            System.out.println((i + 1) + ". " + pesananUser[i]);
        }

        System.out.println("-----------------------------------");
        System.out.println("Total biaya pesanan: " + totalBiaya);
        System.out.println("-----------------------------------");

        sc.close();
    }
}
