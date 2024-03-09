package tema3;
//Sa se afiseze toti divizorii numarului ‘n’ dat.
import java.util.Scanner;

public class Exercitiu11 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduceti numarul n: ");
        int n = scanner.nextInt();

        System.out.println("Divizorii numarului " + n + " sunt:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

	}

}
