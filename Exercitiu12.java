package tema3;

import java.util.Scanner;
//Sa se afiseze toti divizorii primi ai numarului ‘n’ dat.
public class Exercitiu12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduceti numarul n: ");
        int n = scanner.nextInt();

        System.out.println("Divizorii primi ai numarului " + n + " sunt:");
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }
	}

}
