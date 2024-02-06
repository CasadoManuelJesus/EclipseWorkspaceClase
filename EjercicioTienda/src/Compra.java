import java.util.List;

public class Compra extends Thread{
	Cliente cliente;
	
	public Compra(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	@Override
	public synchronized void run() {
		System.out.println("Empieza la compra del cliente: " + this.cliente.getNombre());
		Boolean resu = false, salida=false;
		try {
		for (ItemProducto prod : cliente.getFactura()) {
			Producto producto = buscaProd(prod.getCodigoProducto());
			if(producto!= null && producto.getStock() > prod.getCantidad()) {
				//producto.setStock(producto.getStock()-prod.getCantidad());
				System.out.println("Para el cliente "+ cliente.getNombre()+" hay stockdel producto "+producto.getNombreProd());
				resu = true;
			}
			else {
				System.out.println("el ciente "+ cliente.getNombre()+" no puede realizar su compra porque no hay stock de");
			}
		}
		if(resu==true && salida==false) {
			System.out.println("el cliente "+cliente.getNombre()+" ha finalizado su compra.");
			Thread.sleep((int)(Math.random()*10));
			for (ItemProducto prod : cliente.getFactura()) {
				Producto producto = buscaProd(prod.getCodigoProducto());
				producto.setStock(producto.getStock()-prod.getCantidad());
			}
			salida = true;
		}
		}catch (Exception e){
			//TODO
		}
		
	}

	private Producto buscaProd(Integer codigoProducto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		Tienda tienda = new Tienda();
		for(Cliente cliente : tienda.getCarroClientes()) {
			Compra compra = new Compra(cliente);
			compra.start();
		}
	}
	
	
	
	
	
	
	
}
