package java_primeros_pasos;

public class TestCaracteres {

		public static void main(String[] args) {
			char letra = 'a'; //char contiene solo un caracter de la tabla unicode (a a la z)
			System.out.println(letra);
			
			char valor = 65; //dara como resultado una letra a Mayuscula 
			System.out.println(valor); //compila
			
			//valor = valor + 1;
			//System.out.println(valor); No compila
			
			valor = (char) (valor + 1);
			System.out.println(valor); //Compila
			
			String palabra = "Alura cursos de tecnologia"; //para string son comillas dobles
			System.out.println(palabra);
			
			palabra = palabra + " 2022";
			System.out.println(palabra);
			
		}
}
