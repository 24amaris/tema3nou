package tema3;
//Sa se determine suma primelor n numere impare – ‘n’ citit de la tastatura
import java.util.Scanner;

public class Exercitiu6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduceti n: ");
        int n = scanner.nextInt();

        int suma = 0;
        int numarCurent = 1;

        for (int i = 1; i <= n; i++) {
            suma =suma + numarCurent;
            numarCurent = numarCurent + 2; }
        System.out.println("Suma primelor " + n + " numere impare este: " + suma);
        
	}
}