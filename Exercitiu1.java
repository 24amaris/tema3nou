package tema3;

import java.util.Scanner;

public class Exercitiu1 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Introduceti un numar: ");
	        int numar = scanner.nextInt();

	        if (numar > 10 || numar < 1) {
	            System.out.println("INVALID");
	        } else if (numar > 5) {
	            System.out.println("ADMIS");
	        } else {
	            System.out.println("RESPINS");
	        }
	}

}
