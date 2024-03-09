package tema3;
//Sa se afiseze factorialul unui numar n citit de la tastatura. (FACT=1*2*3*...*n)
import java.util.Scanner;

public class Exercitiu8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduceti un numar n: ");
        int n = scanner.nextInt();
        
        long factorial = 1; 

        for (int i = 2; i <= n; i++) {
        	factorial = factorial * i; 
        	}

        System.out.println("Factorialul numarului " + n + " este: " + factorial);
        
	}

}
