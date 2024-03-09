package tema3;

import java.util.Scanner;
//Sa se afiseze cifra maxima a unui numar.
public class Exercitiu17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numarul: ");
        int numar = scanner.nextInt();
        
        int cifraMaxima = -1;
        while (numar > 0) {
            int cifra = numar % 10; 
            if (cifra > cifraMaxima) {
                cifraMaxima = cifra; 
            }
            numar /= 10;
        }

        System.out.println("Cifra maxima a numarului este: " + cifraMaxima);

	}

}
