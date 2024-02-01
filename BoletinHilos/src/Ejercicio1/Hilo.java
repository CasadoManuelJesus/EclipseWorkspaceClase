package Ejercicio1;

/*
 * 1.- Diseñar un programa en modo consola que ejecute tres hilos (crear un array
 * de tareas) de modo que:
 * En cada uno de ellos muestre: “Dentro del Hilo:HILO0, Prioridad: 1, ID: 9”
 * La prioridad será un número entre 0 al 10. Crear un retardo de 1seg antes de
 * salir del hilo y mostrar un mensaje “Se sale del Hilo:HILO1”
 */
public class Hilo extends Thread {
	@Override
	public void run() {
		System.out.println("Dentro del hilo: " + getName() + ", Prioridad: " + getPriority() + ", ID: " + getId());
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Salgo del hilo " + getName());
	}
}
