package tema3;
//Sa se verifice daca un numar n diferit de 0 sau 1 este prim sau nu.
import java.util.Scanner;

public class Exercitiu9 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	       
	        System.out.println("Introduceti un numar n: ");
	        int n = scanner.nextInt();

	        if (n <= 1) {
	            System.out.println(n + " nu este un numar prim.");
	        } else {
	            boolean estePrim = true; 
	            
	            for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0) {
	                    estePrim = false; 
	                   break;
	                }
	            }

	            if (estePrim) {
	                System.out.println(n + " este un numar prim.");
	            } else {
	                System.out.println(n + " nu este un numar prim.");
	            }
	        }

	}

}
