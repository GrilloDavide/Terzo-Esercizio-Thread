//Davide Grillo 4AIA

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("CALCOLO DI UNA COMBINAZIONE C(n,k)");
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire n");
        int n = input.nextInt();
        System.out.println("Inserire k");
        int k = input.nextInt();
        Fattoriale f1 = new Fattoriale(n);
        Fattoriale f2 = new Fattoriale(k);
        Fattoriale f3 = new Fattoriale(n-k);
        f1.start();
        f2.start();
        f3.start();
        f1.join();
        f2.join();
        f3.join();
        System.out.println("La combinazione C(n,k) con i valori inseriti equivale a: "+(f1.getVal()/(f2.getVal()*f3.getVal())));
    }
}