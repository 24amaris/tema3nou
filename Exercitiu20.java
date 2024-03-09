package tema3;

import java.util.Scanner;
//Sa se determine daca un numar este palindrom sau nu (palindrom = care citit de la stânga la dreapta sau de la dreapta la stânga rămâne neschimbat ex 4334).
public class Exercitiu20 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduceti numarul: ");
	        int numar = scanner.nextInt();
	        int numarOriginal = numar; 
	        int invers = 0;

	        while (numar > 0) {
	            int ultimaCifra = numar % 10; 
	            invers = invers * 10 + ultimaCifra; 
	            numar /= 10; }
	        
	        if (numarOriginal == invers) {
	            System.out.println(numarOriginal + " este un număr palindrom.");
	        } else {
	            System.out.println(numarOriginal + " nu este un număr palindrom.");  }
	}

}
