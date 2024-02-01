package ejercicio03_interrumpir_un_hilo;

import java.awt.Component;

public class PelotaHilos implements Runnable {
	private Pelota pelota;
	private Component componente;
	
	/*
	 * Vamos a interrumpir un hilo cuando se pulse en detener:
	 * - Hay que crear el boton dDetener en marcoRebote:
	 * - En el metodo detener se interrumpe el hilo.
	 * - Para ello guardo en la clase MarcoRebote el hilo como atributo
	 * - en el metodo run() cambio el for por mientras el hilo no se ha interrumpido.
	 * 
	 * Cuidado solo puedo crear una animacion y detenerla,
	 * crear otra animacion y detenerla.
	 * 
	 */
	
	@Override
	public void run() {
		
		System.out.println("Estado del hilo al comenzar " + Thread.currentThread().isInterrupted());
		
		while(!Thread.currentThread().isInterrupted()) {
			
			pelota.mueve_pelota(componente.getBounds());
			
			componente.paint(componente.getGraphics());
			
		   //Sobre el hilo de ejecución creamos un retrado de 4 milisegundos 
			//para que nos permita ver 
			//el movimiento de la pelota.
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}
	
	public PelotaHilos(Pelota pelota, Component componente) {
		super();
		this.pelota = pelota;
		this.componente = componente;
	}
	
	
}
