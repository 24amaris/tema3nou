package tema3;

import java.util.Scanner;

public class Exercitiu7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduceti numarul de numere, n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Introduceti un numar mai mare decat 0");
        } else {
            double suma = 0;


        for (int i = 1; i <= n; i++) {
        	System.out.println("Introduceti numarul " + i + ": ");
        	double numar =  scanner.nextDouble();
        	suma = suma + numar;
        }

        double media = suma / n;
        System.out.println("Media aritmetica este : " + media);
        }

	}
}

  
