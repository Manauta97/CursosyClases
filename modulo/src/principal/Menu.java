package principal;

import java.util.Scanner;

public class Menu {

	public static void pintaMenu() {

		Scanner leer = new Scanner(System.in);
		int opc = 0;

		do {

			System.out.println("----- Menu -----");
			System.out.println("1. Introducir nuevo Módulo");
			System.out.println("2. Consultar Modulos");
			System.out.println("3. Consultar Horas");
			System.out.println("4. Eliminar Modulo");
			System.out.println("5. Salir ");
			opc = leer.nextInt();

		} while (opc < 5 || opc > 1);

	}

}
