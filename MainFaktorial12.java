import java.util.Scanner;
public class MainFaktorial12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();
        
        Faktorial12 fk = new Faktorial12();
        
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
        
    }
}
