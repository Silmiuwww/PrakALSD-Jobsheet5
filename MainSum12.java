import java. util. Scanner;
public class MainSum12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc. nextInt();

        Sum12 sm = new Sum12(elemen);
        for (int i= 0; i< elemen; i++){
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide dan Couquer: "+sm.totalDC(sm.keuntungan, 0,elemen-1));
    }
}
