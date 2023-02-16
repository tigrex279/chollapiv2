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

import aad.Francisco.demo.entity.Oferta;
import aad.Francisco.demo.servicio.OfertaService;

@RestController
@RequestMapping("/oferta")
public class OfertaController {
	@Autowired
	private OfertaService os;
	
	@GetMapping
	public Oferta getOferta(@RequestParam("idOferta") Long id) {
		return os.ObtenerOferta(id);
	}
	
	@PostMapping
	public Oferta postOferta(@RequestBody Oferta oferta) {
		return os.InsertarOferta(oferta);
	}
	
	@DeleteMapping("/borrar/{idOferta}")
	public void borrarOferta(@PathVariable("idOferta") Long id) {
		os.BorrarOferta(id);
	}
	
	@PutMapping("{idOferta}")
	public Oferta actualizarOferta(@PathVariable Long id,@RequestBody Oferta oferta) {
		Oferta actualizado = os.ObtenerOferta(id);
		
		actualizado.setUrl(oferta.getUrl());
		actualizado.setPrecio(oferta.getPrecio());
		actualizado.setFechaHoraPublicacion(oferta.getFechaHoraPublicacion());
		actualizado.setDisponible(oferta.getDisponible());
		
		return os.InsertarOferta(actualizado);
	}
	
}
