package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesi broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }

    public static int sumaCifara(int n) {

        int s;
        s = 0;
        while ( n != 0 ) {


            int cifra = n % 10;
            s = s + cifra;
            n = n / 10;
        }
        return s;

    }
}