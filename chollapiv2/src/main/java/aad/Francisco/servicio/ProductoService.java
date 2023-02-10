package aad.Francisco.servicio;

import java.util.List;

import aad.Francisco.entidades.Producto;

public interface ProductoService {

	public List<Producto> ListarProducto();
	public Producto InsertarProducto(Producto producto);
	public int BorrarProducto(int id);
	public Producto ActualizarProducto(Producto producto);
}
