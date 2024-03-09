package tema3;
//Care este cel mai mic numar prim mai mare ca 1000?
public class Exercitiu10 {

	public static void main(String[] args) {
		int numar = 1001;
		
        while (!estePrim(numar)) {
            numar++; 
        }

        System.out.println("Cel mai mic număr prim mai mare decât 1000 este: " + numar);
    }

    public static boolean estePrim(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }

}
