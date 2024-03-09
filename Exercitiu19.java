package tema3;

import java.util.Scanner;

//Sa se afiseze inversul unui numar dat (124 -> 421).
public class Exercitiu19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numarul: ");
        int numar = scanner.nextInt();
        
        int invers = 0;
        while (numar > 0) {
            int ultimaCifra = numar % 10; 
            invers = invers * 10 + ultimaCifra; 
            numar /= 10; 
        }
        System.out.println("Inversul numarului este: " + invers);
	}
}
