package tema3;

import java.util.Scanner;

public class Exercitiu5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduceti n: ");
        int n = scanner.nextInt();

        int suma = 0;
        int numarCurent = 2;

        for (int i = 1; i <= n; i++) {
            suma =suma + numarCurent;
            numarCurent = numarCurent + 2; }

        System.out.println("Suma primelor " + n + " numere pare este: " + suma);
        
	}

}
