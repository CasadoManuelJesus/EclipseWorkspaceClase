import java.util.List;

public class Cliente {
	
	private Integer codigo;
	private String nombre;
	private List<ItemProducto> factura;
	
	public Cliente(Integer codigo, String nombre, List<ItemProducto> factura) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.factura = factura;
	}
	
	
}