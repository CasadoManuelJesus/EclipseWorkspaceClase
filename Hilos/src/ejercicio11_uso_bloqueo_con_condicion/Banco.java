package ejercicio11_uso_bloqueo_con_condicion;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*clase que crea las cuentas*/
public class Banco {
	private final Double[] cuentas;  //array donde se guarda el saldo de cada cuenta
	
	private Lock cierreBanco;
	
	private Condition saldoSuficiente;

	public void transferencia(int cuentaOrigen, int cuentaDestino, Double cantidad) throws InterruptedException {
		
		//bloquea un trozo de codigo del programa para que solo pueda
		//ser ejecutado por un unico hilo simultaneamente
		
		cierreBanco.lock();
		
		try {
			while (cuentas[cuentaOrigen]<cantidad) {
				//quitamos el return; porque queremos que todas las transferencias se realizen
				//pone un hilo a la espera y desbloquea el codigo para que pueda entrar otro
				saldoSuficiente.await();
			}
			System.out.println(Thread.currentThread());
			cuentas[cuentaOrigen]-=cantidad;
			System.out.printf("Cantidad transferida: %10.2f de Cuenta origen %d para cuenta destino %d", cantidad,cuentaOrigen,cuentaDestino);
			cuentas[cuentaDestino]+=cantidad;
			System.out.printf("\n Saldo total: %10.2f%n",this.getSaldoTotal());
		} finally {
			cierreBanco.unlock();
		}
		
		
		
	}
	
	public Double getSaldoTotal() {
		Double suma_cuentas=0.0;
		
		for(Double a:cuentas) {
			suma_cuentas+=a;
		}
		return suma_cuentas;
	}
	
	public Banco() {
		//inicialmente  a cada cuenta se le asignan 2000 euros
		// en el banco hay 100 cuentas
		cuentas=new Double[100];
		for(int i=0;i<cuentas.length;i++) {
			cuentas[i]=2000.0;
		}
		cierreBanco=new ReentrantLock();
		saldoSuficiente = cierreBanco.newCondition();
	}

	

	public Double[] getCuentas() {
		return cuentas;
	}
	
	
	
}
