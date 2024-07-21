import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //formul --> C(n,r) = n! / (r! * (n-r)!)

        int n, r;

        System.out.println("Kombinasyon Hesaplamaya Hoş geldiniz");

        System.out.print("n sayısını giriniz: ");
        n = input.nextInt();

        System.out.print("r sayısını giriniz: ");
        r = input.nextInt();

        int nFactorial = 1;

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        int rFactorial = 1;

        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        int nMinusR = (n - r);

        int nMinusRFactorial = 1;

        for (int i = 1; i <= nMinusR; i++) {
            nMinusRFactorial *= i;
        }

        int combination = nFactorial / (rFactorial * nMinusRFactorial);

        System.out.println("Kombinasyon sonucu: " + combination);


    }
}