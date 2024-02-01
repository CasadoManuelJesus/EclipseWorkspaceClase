package ejercicio02_varios_hilos_simultaneos;

import java.awt.Component;

public class PelotaHilos implements Runnable {
	private Pelota pelota;
	private Component componente;
	
	@Override
	public void run() {
		for (int i=1; i<=3000; i++){
			
			pelota.mueve_pelota(componente.getBounds());
			
			componente.paint(componente.getGraphics());
			
		   //Sobre el hilo de ejecución creamos un retrado de 4 milisegundos 
			//para que nos permita ver 
			//el movimiento de la pelota.
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public PelotaHilos(Pelota pelota, Component componente) {
		super();
		this.pelota = pelota;
		this.componente = componente;
	}
	
	
}
