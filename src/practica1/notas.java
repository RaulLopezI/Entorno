package practica1;

import java.util.Scanner;
//primera prueba para el Git
/**
* @version 1.0.0
* @author Raul Lopez Isidro
*/
/**
 * Esta clase permite calcular la nota definitiva de un estudiante basada en
 * tres notas parciales.
 */
public class notas {
	// declaramos la variables que nos hacen falta
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	// utilizames ecaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);

	/// vamos ha crear un metodo para ingresar
	/**
	 * Metodo para ingresar las notas del estudiante.
	 */

	public void IngresaNotas() {
		// cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");

		System.out.print("ingrese nota 1: ");

		uf1 = entrada.nextDouble();

		System.out.print("ingrese nota 2: ");

		uf2 = entrada.nextDouble();
		System.out.print("ingrese nota 3: ");

		uf3 = entrada.nextDouble();

	}

	// metodo para comprobar bien entroduccion de notas
	/**
	 * Metodo para verificar que las notas ingresadas esten en el rango correcto.
	 */
	public void comprobarcion() {

		if (uf1 > 10) {
			System.out.println(" nota1 mal introducida");

		} else {
			System.out.println(" nota1 correcta");
		}

		if (uf2 > 10) {
			System.out.println(" nota2 mal introducida");

		} else {
			System.out.println(" nota2 correcta");
		}
		if (uf3 > 10) {
			System.out.println(" nota3 mal introducida");

		} else {
			System.out.println(" nota3 correcta");
		}

	}

	// metodo para calcular nota
	/**
	 * Metodo para calcular la nota definitiva del estudiante.
	 */
	public void Calculonotas() {
		acu1 = uf1 * 0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;

		def = acu1 + acu2 + acu3;

		// hasta aqui la tenemos calculada peor no la mostramos
	}

	/**
	 * Metodo para mostrar las notas ingresadas, el acumulado de cada nota y la nota
	 * definitiva del estudiante.
	 */
	public void Mostrar() {
		// print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);

		System.out.println(" acumuado 1 = " + acu1);
		System.out.println(" acumuado 2 = " + acu2);
		System.out.println(" acumuado 3 = " + acu3);

		System.out.println(" nota definitiva es = " + def);

	}

	/**
	 * Metodo para verificar si el estudiante ha aprobado o suspendido.
	 */

	public void aprobado() {

		if (def < 5 && def >= 0) {
			System.out.println("suspendio");
		} else {
			if (def >= 5 && def <= 10) {
				System.out.println("aprobado");
			} else {
				System.out.println(" error en la notas");
			}
		}
	}

	/**
	 * Metodo principal para ejecutar el programa.
	 * 
	 * @param args Argumentos de la linea de comandos.
	 */
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc = new notas();

		fc.IngresaNotas();

		fc.comprobarcion();

		fc.Calculonotas();

		fc.Mostrar();

		fc.aprobado();

	}

}