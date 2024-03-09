package tema3;

import java.util.Scanner;
//Sa se afiseze separat cifrele unui numar.
public class Exercitiu16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numarul: ");
        int numar = scanner.nextInt();

        System.out.println("Cifrele numarului sunt:");
        
        String numarStr = Integer.toString(numar); 
        
        for (int i = 0; i < numarStr.length(); i++) {
            System.out.println(numarStr.charAt(i));
        }
	}
}
