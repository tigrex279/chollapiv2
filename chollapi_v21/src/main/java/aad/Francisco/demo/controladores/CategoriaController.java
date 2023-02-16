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

import aad.Francisco.demo.entity.Categoria;
import aad.Francisco.demo.servicio.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	private CategoriaService cs;
	
	@GetMapping
	public Categoria getCategoria(@RequestParam("idCategoria") Long id) {
		return cs.ObtenerCategoria(id);
	}
	
	@PostMapping
	public Categoria postCategoria(@RequestBody Categoria categoria) {
		return cs.InsertarCategoria(categoria);
	}
	 
	@DeleteMapping("/borrar/{idCategoria}")
	public void borrarCategoria(@PathVariable("idCategoria") Long id) {
		cs.BorrarCategoria(id);
	}
	
	@PutMapping("/{idCategoria}")
	public Categoria actualizarCategoria(@PathVariable("idCategoria") Long idCategoria,@RequestBody Categoria categoria) {
		Categoria actualizado = cs.ObtenerCategoria(idCategoria);
		
		actualizado.setNombre(categoria.getNombre());
		actualizado.setDescripcion(categoria.getDescripcion());
		
		return cs.InsertarCategoria(actualizado);
	}
	
	
}
