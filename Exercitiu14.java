package tema3;
//Sa se gaseasca perechile de numere a caror suma este 1000, primul sa fie divizibil cu 17 sau cu 13 iar al doilea cu 19 sau cu 7.
public class Exercitiu14 {

	public static void main(String[] args) {
		   int suma = 1000; 

	        System.out.println("Perechile de numere ale caror suma este 1000:");
	        System.out.println("(Primul divizibil cu 17 sau 13, al doilea divizibil cu 19 sau 7)");

	        for (int i = 1; i < suma; i++) { 
	            if (i % 17 == 0 || i % 13 == 0) { 
	                int j = suma - i; 
	                if (j % 19 == 0 || j % 7 == 0) { 
	                    System.out.println("(" + i + ", " + j + ")");
	                }
	            }
	        }
	}

}
