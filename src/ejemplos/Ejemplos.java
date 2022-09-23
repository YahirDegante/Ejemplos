package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Yahir
 */
public class Ejemplos {
    /*public static void main(String[] args) {
        System.out.println(sumSerie(3));
    }
    static double sum=0, fact=1;
    static int i=0;
    public static double sumSerie(int n) {
        if (i==n) {
            return sum;
        } else {
            i++;
            fact *= i;
            sum += 1.0/fact;
            return sumSerie(n);
        }
    }*/
    /* static void main(String[] args) {
        System.out.println(inverso(736));
    }

    public static int inverso(int n) {
        if (n < 10) {
            return n;
        } else {
            return inverso(n / 10) + (n % 10) * (int) Math.pow(10, (int) Math.log10(n));
        }
    }*/
        /*public static void main(String[] args) {
        System.out.println(fun(8));

    }
    static int fun(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 2;
        } else {
            return 2 * fun(n - 2) + fun(n - 1);
        }
    }*/
        /*public static void main(String[] args) {
        System.out.println(vocales("Hola mundo"));
    }

    public static int vocales(String s) {
        if (s.length() == 0) {
            return 0;
        } else {
            return vocales(s.substring(1)) + (esVocal(s.charAt(0)) ? 1 : 0);
        }
    }

    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }*/
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("El siguiente programa cuenta las vocales de una palabra");
        System.out.print("Ingrese una palabra: ");
        String texto = sc.nextLine();
        System.out.println("Las vocales de la palabra: "+texto + " son: "+vocales(texto));
        
        }
    public static int vocales(String cad) {
	if (cad.length() == 0) {
		return 0;
	}
	switch (Character.toLowerCase(cad.charAt(cad.length() - 1))) {
		case 'a':
			return 1 + vocales(cad.substring(0, cad.length() - 1));
		case 'e':
			return 1 + vocales(cad.substring(0, cad.length() - 1));
		case 'i':
			return 1 + vocales(cad.substring(0, cad.length() - 1));
		case 'o':
			return 1 + vocales(cad.substring(0, cad.length() - 1));
		case 'u':
			return 1 + vocales(cad.substring(0, cad.length() - 1));
	}
	return 0 + vocales(cad.substring(0, cad.length() - 1));
}
 
   
}