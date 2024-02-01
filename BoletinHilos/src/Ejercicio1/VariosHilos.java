package Ejercicio1;

public class VariosHilos {
	public static void main(String[] args) {
		Hilo[] hilos = { new Hilo(), new Hilo(), new Hilo() };
		for (int i = 0; i < hilos.length; i++) {
			int num_aleatorio = (int) Math.floor(Math.random() * 10 + 1);
			hilos[i].setName("HILO" + i);
			hilos[i].setPriority(num_aleatorio);
		}
		for (Hilo hilo : hilos) {
			hilo.start();
		}
	}
}
