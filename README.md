nombre: Juan David Quintana CAballero
código: 192604

# Series Paralelas
**Segundo Parcial — Programación I (Java)**  
**Tema:** Arreglos + funciones dentro de una sola clase  
**Duración:** 90 minutos · **Lenguaje:** Java (JDK 17+) · **Modalidad:** Individual  

---

## Objetivo

Dadas dos series numéricas del mismo tamaño, aplicar operaciones y relaciones:

- Suma elemento a elemento.
- Producto escalar.
- Detección de rotación a la derecha.
- Verificación de si son el mismo multiconjunto (mismas frecuencias de cada número).

---

## Reglas

- Crea **una sola clase** (por ejemplo, `Parcial2Ej2`).
- Todas las funciones deben estar en esa misma clase (pueden ser `static`).
- Usa `Scanner` para leer por teclado.
- No utilices:
  - `List`
  - `Set`
  - `Map`
  - `Streams`
  - `Arrays.sort`
- Implementa el multiconjunto **sin ordenar**.
- Valida tamaños y evita desbordes (no acceder fuera de los límites de los arreglos).

---

## Entradas

1. Un entero `N` tal que: `5 ≤ N ≤ 50`.
2. `N` enteros para el arreglo `A`.
3. `N` enteros para el arreglo `B`.

---

## Métodos requeridos (en la misma clase)

```java
int[] leerArreglo(int n)
// Lee y retorna un arreglo de tamaño n.

int[] sumaElementoElemento(int[] a, int[] b)
// Retorna un arreglo C donde C[i] = a[i] + b[i].

int productoEscalar(int[] a, int[] b)
// Retorna el producto escalar: sumatoria de a[i] * b[i].

int rotacionDerechaDeAParaObtenerB(int[] a, int[] b)
// Retorna k si b es igual a a rotado k posiciones a la derecha.
// En caso contrario, retorna -1.

boolean mismosElementosComoMulticonjunto(int[] a, int[] b)
// Retorna true si a y b tienen las mismas frecuencias de cada número (sin ordenar).
