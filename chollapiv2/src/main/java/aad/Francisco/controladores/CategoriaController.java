package aad.Francisco.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aad.Francisco.entidades.Categoria;
import aad.Francisco.servicio.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	private CategoriaService cs;
	
	@GetMapping
	public Categoria getCategoria(@RequestParam("id") Long id) {
		return cs.ObtenerCategoria(id);
	}
}
