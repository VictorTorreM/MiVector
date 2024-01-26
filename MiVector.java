package miArray;

import java.util.Arrays;

import baraja.Carta;

public class MiVector {

	private int lista[];
	private int cantidad;
	private int pos;
	private boolean encontrado;

	// Constructor parametrizado en el que se le indica la longitud que va a tener
	public MiVector(int longitud) {

		lista = new int[longitud];
		// inicio las variables que usare mas adelante para llevar la cuenta de los
		// digitos
		pos = 0;
		encontrado = false;
		cantidad = lista.length;
	}

	// Metodo que ajusta las posiciones del vector para que una vez borrado un
	// digito se intercambien
	// las posiciones con el siguiente
	private void ajustarVector(int inicio) {
		//Se le pasa el parametro inicio que es la posicion en la que se borro el digito,para empezar a iterar desde ahi
		int copia;
		while (inicio < lista.length) {
			//las variables que indicaran la posicion del array que intercambiare
			int num1 = inicio;
			int num2 = inicio + 1;

			// Para no superar la longitud maxima del array compruebo si el num2 es distinto
			// de la cantidad de digitos maxima
			if (num2 != lista.length) {
				// intercambio los valores de las posiciones 
				copia = lista[num2];
				lista[num2] = lista[num1];
				lista[num1] = copia;
			}
			inicio++;

		}
	}

	public int getCantidad() {
		return cantidad;
	}

	// Metodo que añade un int mientras la variable pos no supere la longitud maxima
	// de la lista
	public int addInt(int num) {

		if (pos < lista.length) {

			lista[pos] = num;
			// resto 1 a la variable cantidad
			cantidad--;
		}
		// devuelvo la variable pos y le sumo 1
		return pos++;
	}

	// metodo que busca en la lista el primer digito que se introduzca y lo elimina
	public int delInt(int num) {
		// si no se encuentra un digito se devolvera un -1 para que el usuario sepa que
		// no existe el numero que quiere borrar
		int devolver = -1;
		// creo un bucle while para una vez encontrar el primer digito se termine
		while (!encontrado) {
			// bucle que recorre el array
			for (int a = 0; a < lista.length; a++) {
				// si el numero coincide se cambia por 0
				if (lista[a] == num) {
					lista[a] = 0;
					// llamo al metodo que ajustara las posiciones del vector
					ajustarVector(a);
					// actualizo el valor de devolver
					devolver = a;
					// actualizo las variables necesarias
					pos--;
					cantidad++;
					encontrado = true;
				}

			}

		}
		// devuelvo la posicion donde se borro el digito
		return devolver;
	}
	//metodo toString que imprime el array , cantidad actual de digitios y cuantos mas pueden ser introducidos
	public String toString() {

		return Arrays.toString(lista) + "\nTienes " + this.pos + " digitos almacenados" + "\nPuedes introducir "
				+ this.cantidad + " digitos mas";
	}

}
