import java.util.Scanner;
class Mahasiswa12 {
    String nama;
    int uts;
    int uas;

    Mahasiswa12(String nama, int uts, int uas) {
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }
}

public class NilaiMahasiswa {
    
    public static int cariNilaiUTSTertinggi(Mahasiswa12[] data, int kiri, int kanan) {
        if (kiri == kanan) {
            return data[kiri].uts;
        }
        int tengah = (kiri + kanan) / 2;
        int maksKiri = cariNilaiUTSTertinggi(data, kiri, tengah);
        int maksKanan = cariNilaiUTSTertinggi(data, tengah + 1, kanan);
        return Math.max(maksKiri, maksKanan);
    }

    public static int cariNilaiUTSTerendah(Mahasiswa12[] data, int kiri, int kanan) {
        if (kiri == kanan) {
            return data[kiri].uts;
        }
        int tengah = (kiri + kanan) / 2;
        int minKiri = cariNilaiUTSTerendah(data, kiri, tengah);
        int minKanan = cariNilaiUTSTerendah(data, tengah + 1, kanan);
        return Math.min(minKiri, minKanan);
    }
    
    public static double hitungRataRataUAS(Mahasiswa12[] data) {
        int total = 0;
        for (Mahasiswa12 mhs : data) {
            total += mhs.uas;
        }
        return (double) total / data.length;
    }


    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc12.nextInt();
        sc12.nextLine(); 
        Mahasiswa12[] data = new Mahasiswa12[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nama mahasiswa ke-" + (i + 1) + ": ");
            String nama = sc12.nextLine();
            System.out.print("Nilai UTS: ");
            int uts = sc12.nextInt();
            System.out.print("Nilai UAS: ");
            int uas = sc12.nextInt();
            sc12.nextLine(); 
            data[i] = new Mahasiswa12(nama, uts, uas);
        }
        
        System.out.println("\nNilai UTS Tertinggi: " + cariNilaiUTSTertinggi(data, 0, n - 1));
        System.out.println("Nilai UTS Terendah: " + cariNilaiUTSTerendah(data, 0, n - 1));
        System.out.println("Rata-rata Nilai UAS: " + hitungRataRataUAS(data));
        
    }
}
