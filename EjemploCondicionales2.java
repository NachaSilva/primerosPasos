package java_primeros_pasos;

public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Hello world");

		int edad = 21;
		int cantidadPersonas = 2;

		boolean esPareja = cantidadPersonas > 1; //condicion es true o false 
		System.out.println("El valor de la condicion es: " + esPareja);
		
		if (edad >= 18 && esPareja) { //al ya ser booleano no es necsario colocar == true
			System.out.println("Usted puede entrar"); 
		} else {
			System.out.println("Usted no esta permitido a entrar");
		}
		

		

	}
}
