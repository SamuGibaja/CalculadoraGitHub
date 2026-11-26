package calculadora;

public class Calculadora {

	public static double sumar(double a, double b) {
		 return a + b;
		 }
		 public static void main(String[] args) {
		 System.out.println("Calculadora GitHub");
		 System.out.println("Suma: " + sumar(8, 4));
		 }
		 
		 public static double restar(double a, double b) {
			    return a - b;
			}

			public static double multiplicar(double a, double b) {
			    return a * b;
			}

			public static double dividir(double a, double b) {
			    if (b == 0) {
			        System.out.println("Error: no se puede dividir entre cero");
			        return Double.NaN;
			    }
			    return a / b;
			}
			public static double potencia(double base, int exponente) {
			    return Math.pow(base, exponente);
			}

			public static boolean esPar(int numero) {
			    return numero % 2 == 0;
			}
			
}
