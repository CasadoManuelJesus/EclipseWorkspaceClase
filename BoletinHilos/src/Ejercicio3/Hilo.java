package Ejercicio3;

/*
 * 3.- Diseñar un programa en modo consola que cree tres ficheros de texto con
 * los números del 0 al 10000. El primer fichero tiene una prioridad máxima con
 * respecto al segundo y la creación del tercer fichero debe ser en segundo plano.
 * Comprobar cuándo finaliza la creación de cada fichero con un mensaje en consola.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Hilo extends Thread {

	
	
	@Override
	public void run() {
		System.out.println("Iniciando hilo: "+getName());
		crearFichero(getName());
		System.out.println("Hilo: "+getName()+" finalizado");
	}

	private void crearFichero(String nombre) {
		try {
			String ruta = "/home/usuario/Escritorio/"+nombre+".txt";
			File archivo = new File(ruta);
			BufferedWriter bw;
			bw = new BufferedWriter(new FileWriter(archivo));
			for (int i = 0; i <= 10000; i++) {
                bw.write(Integer.toString(i));
                bw.newLine();
            }
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
