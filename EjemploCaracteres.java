package java_primeros_pasos;

public class EjemploCaracteres {
	
	public static void main(String[] args) {
		
		char caracter = 'a'; //tiene que estar en comilla simple y tampoco valor vacio
		System.out.println(caracter);
		
		caracter = 65;
		System.out.println(caracter);
		
		caracter = 65 + 1;
		
		char segundoCaracter = (char) (caracter + 1); // de B será +1 y pasará a C
		System.out.println(segundoCaracter);
		
		String palabra = "Alura cursos online";
		System.out.println(palabra);
		
		palabra = palabra + "2022";
		System.out.println(palabra);
		
		
		
	}
	
}
