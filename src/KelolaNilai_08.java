import java.util.Scanner;

public class KelolaNilai_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Banyak Mahasiswa: ");
        int index = sc.nextInt();

        int banyakMahasiswa[] = new int[index];
        int terbesar = 0 , terkecil = 0 , total = 0;
        double rata = 0;
        String keterangan;

        System.out.println("\n==== Masukkan Nilai Mahasiswa ====");
        for(int i = 0; i < index; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + ": ");
            banyakMahasiswa[i] = sc.nextInt();

            if (i == 0) {
                terbesar = banyakMahasiswa[i];
                terkecil = banyakMahasiswa[i];
            } else {
                if (banyakMahasiswa[i] > terbesar) {
                    terbesar = banyakMahasiswa[i];
                }
                if (banyakMahasiswa[i] < terkecil) {
                    terkecil = banyakMahasiswa[i];
                }
            }
            
            total += banyakMahasiswa[i];
            rata = (double) total / index;
        }

        System.out.println("\n==== Daftar Nilai Mahasiwa ====");
        for(int i = 0; i < index; i++) {
                if (banyakMahasiswa[i] >= 60 && banyakMahasiswa[i]<= 100) {
                keterangan = "LULUS";
                } else {
                keterangan = "TIDAK LULUS";
                }

                System.out.println("Nilai mahasiswa ke-" + (i+1) + ": " + banyakMahasiswa[i] + " " + keterangan);
        }
        System.out.println("\nNilai Terbesar: " + terbesar);
        System.out.println("Nilai Terkecil: " + terkecil);
        System.out.println("Rata - rata: " + rata);

        sc.close();
    }
}
