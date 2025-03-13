import java. util. Scanner;
public class JwbPertanyaanNo2Faktorial {
    public int faktorialBF(int n) {
        int hasil = 1;
        int i = 1;
        while (i <= n) {
            hasil *= i;
            i++;
        }
        return hasil;
    }
}
