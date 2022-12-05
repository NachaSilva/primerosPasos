package java_primeros_pasos;

public class EjemploCiclosFor {
	public static void main(String[] args) {
		
		for ( int contador = 0; contador <= 10; contador++) {  //variable; condicional; lo que se ejecuta al final de la iteracion
			System.out.println(contador); // a partir del segundo ciclo, ignora la variable 
		}
		
	}
}
//se usa cuando no se incrementa fuera de for a diferencia de while