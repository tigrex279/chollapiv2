package aad.Francisco.demo.servicioImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aad.Francisco.demo.entity.Producto;
import aad.Francisco.demo.repository.ProductoRepository;
import aad.Francisco.demo.servicio.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService{
	@Autowired
	private ProductoRepository pr;
	
	@Override
	public List<Producto> ListarProducto() {
		return pr.findAll();
	}

	@Override
	public Producto InsertarProducto(Producto producto) {
		return pr.save(producto);
	}

	@Override
	public void BorrarProducto(Long id) {
		pr.deleteById(id);
	}

	@Override
	public Producto ObtenerProducto(Long id) {
		return pr.findById(id).orElse(null);
	}

	

}
