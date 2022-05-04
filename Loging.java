package Loging;
import java.util.Scanner;

/**
 * 
 * @author propa
 * @version 1.0
 * 
 */

public class Loging {
	/**
	 * Esta será la clase principal y la única de nuestro registro
	 * @param args
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception{
		

		Scanner sc = new Scanner(System.in);
		int a;
		String b;
		String c;
		String d;
		String e; 
		
		System.out.print("Que quieres hacer: 1-Registrarse 2-Salir: ");
		a = sc.nextInt();
		if (a == 1) {
			System.out.print("Escribe tu usuario: ");
			b = sc.next();
				
			System.out.print("Escribe tu contraseña: ");
			c = sc.next();
			
			System.out.println("Usuario y contraseña guardados correctamente. Pasando a proceso de registro");
			
			System.out.print("Escribe tu usuario: ");
			d = sc.next();
			
			System.out.print("Escribe tu contraseña: ");
			e = sc.next();
			
			registro(b, c, d, e);
		} 
		else if (a == 2) {
			System.out.println("Saliendo del programa...");
		}
		sc.close();
		
	}

	/**
	 * 
	 * @param b es la peticion de usuario
	 * @param c es la peticion de contraseña
	 * @param d es el usuario que has insertado
	 * @param e es la contraseña insertada
	 * @return devuelve un booleano dependiendo si b=d y c=e
	 * 
	 */
	public static boolean registro(String b, String c, String d, String e){
		boolean resultado = true;
		
			
		if (b.equals(d) && c.equals(e)) {
			
			System.out.println("Usuario y Contraseña correctos");
			return resultado;
		}
		else {
			
			resultado = false;
			System.out.println("Usuario o Contraseña incorrectos");
			return resultado;
		}
			
	}
}
	
	
	
	

