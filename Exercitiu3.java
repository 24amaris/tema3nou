package tema3;

import java.util.Scanner;

public class Exercitiu3 {

	public static void main(String[] args) {

				Scanner scanner = new Scanner(System.in);
		       
		        System.out.println("Introduceti primul numar: ");
		        int n1 = scanner.nextInt();
		        System.out.println("Introduceti al doilea numar: ");
		        int n2 = scanner.nextInt();
		        
		        if (n1 % 2 == 0 && n2 % 2 == 0) {
		            double media = (n1 + n2) / 2;
		            System.out.println("Media aritmetica a celor doua numere este : " + media);
		        } else if (n1 % 2 != 0 && n2 % 2 != 0) {
		            int produs = n1 * n2;
		            System.out.println("Produsul numerelor este: " + produs);
		        } else {
		            int suma = n1 + n2;
		            System.out.println("Suma: " + suma);
		      
		        }
	}
}
