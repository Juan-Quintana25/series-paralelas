import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el tamaño N (5 ≤ N ≤ 50): ");
		int n = scanner.nextInt();

		if (n < 5 || n > 50) {
			System.out.println("Tamaño inválido. Debe estar entre 5 y 50.");
			scanner.close();
			return;
		}

		System.out.println("Ingrese los " + n + " elementos del arreglo A:");
		int[] a = leerArreglo(n, scanner);

		System.out.println("Ingrese los " + n + " elementos del arreglo B:");
		int[] b = leerArreglo(n, scanner);

		int[] suma = sumaElementoElemento(a, b);
		System.out.print("Suma elemento a elemento: ");
		imprimirArreglo(suma);

		int escalar = productoEscalar(a, b);
		System.out.println("Producto escalar: " + escalar);

		int rotacion = rotacionDerechaDeAParaObtenerB(a, b);
		if (rotacion != -1) {
			System.out.println("B es A rotado " + rotacion + " posiciones a la derecha.");
		} else {
			System.out.println("B no es una rotación a la derecha de A.");
		}

		boolean mismoMulticonjunto = mismosElementosComoMulticonjunto(a, b);
		System.out.println("¿A y B tienen los mismos elementos como multiconjunto? " + mismoMulticonjunto);

		scanner.close();
	}

	static int[] leerArreglo(int n, Scanner scanner) {
		int[] arreglo = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Elemento " + (i + 1) + ": ");
			arreglo[i] = scanner.nextInt();
		}
		return arreglo;
	}

	static int[] sumaElementoElemento(int[] a, int[] b) {
		if (a.length != b.length) {
			throw new IllegalArgumentException("Los arreglos deben tener el mismo tamaño.");
		}
		int[] resultado = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			resultado[i] = a[i] + b[i];
		}
		return resultado;
	}

	static int productoEscalar(int[] a, int[] b) {
		if (a.length != b.length) {
			throw new IllegalArgumentException("Los arreglos deben tener el mismo tamaño.");
		}
		int resultado = 0;
		for (int i = 0; i < a.length; i++) {
			resultado += a[i] * b[i];
		}
		return resultado;
	}

	static int rotacionDerechaDeAParaObtenerB(int[] a, int[] b) {
		if (a.length != b.length) {
			return -1;
		}

		int n = a.length;

		for (int k = 0; k < n; k++) {
			boolean esRotacion = true;
			for (int i = 0; i < n; i++) {
				if (a[(n - k + i) % n] != b[i]) {
					esRotacion = false;
					break;
				}
			}
			if (esRotacion) {
				return k;
			}
		}

		return -1;
	}

	static boolean mismosElementosComoMulticonjunto(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}

		int n = a.length;
		boolean[] visitados = new boolean[n];

		for (int i = 0; i < n; i++) {
			int contador_a = 0;
			int contador_b = 0;

			for (int j = 0; j < n; j++) {
				if (a[i] == a[j]) {
					contador_a++;
				}
				if (a[i] == b[j]) {
					contador_b++;
				}
			}

			if (contador_a != contador_b) {
				return false;
			}
		}

		return true;
	}

	static void imprimirArreglo(int[] arreglo) {
		System.out.print("[");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]);
			if (i < arreglo.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}

