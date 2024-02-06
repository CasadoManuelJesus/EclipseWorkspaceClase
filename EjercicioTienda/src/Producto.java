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

	public Integer getCodigoProducto() {
		return codigoProducto;
	}

	public String getNombreProd() {
		return nombreProd;
	}

	public Integer getStock() {
		return stock;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
	
	

}