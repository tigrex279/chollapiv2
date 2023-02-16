package aad.Francisco.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aad.Francisco.demo.entity.Producto;
import aad.Francisco.demo.servicio.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	private ProductoService ps;
	
	@GetMapping
	public Producto getProducto(@RequestParam("idProducto") Long id) {
		return ps.ObtenerProducto(id);
	}
	
	@PostMapping
	public Producto postProducto(@RequestBody Producto producto) {
		return ps.InsertarProducto(producto);
	}
	
	@DeleteMapping("/borrar/{idProducto}")
	public void borrarProducto(@PathVariable("idProducto") Long id) {
		ps.BorrarProducto(id);
	}
	
	@PutMapping("{idProducto}")
	public Producto actualizarProducto(@PathVariable Long id,@RequestBody Producto producto){
		Producto actualizado = ps.ObtenerProducto(id);
		
		actualizado.setNombre(producto.getNombre());
		actualizado.setIdFabricante(producto.getIdFabricante());
		actualizado.setCaracteristicas(producto.getCaracteristicas());
		
		return ps.InsertarProducto(actualizado);
	}

}
