package ejercicio06_hilos_sin_sincronizar;

	/*
	 * Crear un programa que ejecute dos hilos uno a continuacion del otro
	 * Ambos hilos muestran un mensaje 25 veces en pantalla."Ejecutando hilo nº ...."
	 * ¿Que ocurre?
	 * Hay que comprobar que no estan sincronizados. (Ejecuta los hilos como quiere.
	 * 	No llega a terminar la ejecucion del hilo 0
	 * 	y va con la del hilo1 y viceversa).
	 */

public class SincronizandoHilos {
	
	public static void main(String[] args) {
		Hilo hilo0 = new Hilo();
		hilo0.start();
		
		Hilo hilo1 = new Hilo();
		hilo1.start();
		
		System.out.println("Fin del main");

		
	}

}
