package tema3;

import java.util.Scanner;

//Sa se afiseze cifra minima a unui numar.
public class Exercitiu18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numarul: ");
        int numar = scanner.nextInt();
        
        int cifraMinima = 9; 
        while (numar > 0) {
            int cifra = numar % 10; 
            if (cifra < cifraMinima) {
                cifraMinima = cifra; 
            }
            numar /= 10;
        }
        System.out.println("Cifra minima a numarului este: " + cifraMinima);
	}
}
