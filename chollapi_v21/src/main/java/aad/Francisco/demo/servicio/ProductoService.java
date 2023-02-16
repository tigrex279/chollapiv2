package aad.Francisco.demo.servicio;

import java.util.List;

import aad.Francisco.demo.entity.Producto;

public interface ProductoService {

	public List<Producto> ListarProducto();
	public Producto InsertarProducto(Producto producto);
	public void BorrarProducto(Long id);
	public Producto ObtenerProducto(Long id);
}
