public class Producto {
	private Integer codigoProducto;
	private String nombreProd;
	private Integer stock;
	private Double precio;
	
	public Producto(Integer codigoProducto, String nombreProd, Integer stock, Double precio) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProd = nombreProd;
		this.stock = stock;
		this.precio = precio;
	}

}