package ejercicio03_interrumpir_un_hilo;

import javax.swing.JFrame;

//este ejercicio nos permite ver en un programa un hilo de ejecución

/**
 * 
 * Diseñar un programa en modo gráfico que con dos botones Dale y Salir. 
 * Cuando se pulse sobre el botón Dale aparecerá en pantalla una pelota que se irá moviendo por la pantalla 
 * un número determinado de veces. Al pulsar Salir termina la aplicación.
 * 
	En este ejercicio se estudiará el concepto de programa monotarea.
	Un programa monotarea ejecuta una tarea a la vez. O lo que es lo mismo un hilo 
	o flujo de ejecución a la vez.
	En el juego (cuando se pulse en Dale) la siguiente pelota saldrá 
	cuando termine la animación de la primera pelota. 
	Si quiero cerrar la aplicación (que es otro hilo de ejecución) no lo hará hasta 
	que no termine la animación de la última pelota.
 *
 */
public class UsoThreads {

	public static void main(String[] args) {
		JFrame marco=new MarcoRebote();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
    }

}



