package tema3;
//Sa se gaseasca perechile de numere a caror suma este 1000, primul sa fie divizibil cu 17 iar al doilea cu 19.
public class Exercitiu13 {

	public static void main(String[] args) {
		 int suma = 1000; 

	        System.out.println("Perechile de numere ale caror suma este 1000:");
	        System.out.println("(Primul divizibil cu 17, al doilea divizibil cu 19)");

	        for (int i = 17; i < suma; i += 17) {
	            int j = suma - i; 
	            if (j % 19 == 0) {
	                System.out.println("(" + i + ", " + j + ")");

	            }

	        }  
	}
}
