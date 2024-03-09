package tema3;
//Sa se genereze toate numerele de 4 cifre de forma 3a2b care se divid cu 9.
public class Exercitiu15 {

	public static void main(String[] args) {
		System.out.println("Numerele de forma 3a2b care se divid cu 9 sunt:");

        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                if ((3 + a + 2 + b) % 9 == 0) { 
                    System.out.println("3" + a + "2" + b); 
                }
            }
        }
	}

}
