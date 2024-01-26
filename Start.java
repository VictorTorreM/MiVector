package miArray;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		MiVector vec = new MiVector(15);
		boolean interruptor = true;

		while (interruptor) {
			System.out.println("Elije una opcion");
			System.out.println("1- Añadir un numero");
			System.out.println("2- Borrar un numero");
			System.out.println("3- Imprimir lista");
			System.out.println("0- Salir");
			int opcion = teclado.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Introduce un numero");
				int num = teclado.nextInt();
				System.out.print("El numero ha sido introducido en la posicion: ");
				System.out.println(vec.addInt(num));
				break;
			case 2:
				System.out.println("Introduce un numero");
				int num2 = teclado.nextInt();
				System.out.print("El numero ha sido borrado en la posicion: ");
				System.out.println(vec.delInt(num2));
				break;
			case 3:
				System.out.println(vec);
				break;
			case 0:
				interruptor = false;
				break;
			default:
				System.out.println("Introduce un opcion valida");
				break;
			}

		}

	}

}
