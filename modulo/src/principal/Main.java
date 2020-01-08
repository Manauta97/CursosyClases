package principal;

import java.util.Scanner;

/**
 * 
 * @author Raúl Manauta
 * @version 2.0
 * 
 */

public class Main {

	public static void main(String[] args) {

		Curso curso = new Curso();

		String nombre = "", codigo = "";
		int horas = 0;
		
		
		switch (opc =  Menu.pintaMenu()) {
		case 1:
			
			break;

		default:
			break;
		}

		for (int i = 0; i < 2; i++) {
			try {
				Scanner leer = new Scanner(System.in);
				if ( == null) {
					System.out.println("Nombre , horas y código del módulo");
					nombre = leer.nextLine();
					Scanner leer1 = new Scanner(System.in);
					horas = leer1.nextInt();
					codigo = leer.nextLine();
					Modulo m = new Modulo(nombre, horas, codigo);
					curso.introducirModulo(m);
				}

			} catch (Exception e) {
				System.out.println("fallo al introducir los datos");
			}
		} // fin for

//		for (Modulo m : vModulos) {
//			if (m != null) {
//				System.out.println(m);
//			}
//		}

	}

}
