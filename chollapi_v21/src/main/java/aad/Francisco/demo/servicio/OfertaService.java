package aad.Francisco.demo.servicio;

import java.util.List;

import aad.Francisco.demo.entity.Oferta;

public interface OfertaService {

	public List<Oferta> ListarOfertas();
	public Oferta InsertarOferta(Oferta oferta);
	public void BorrarOferta(Long id);
	public Oferta ObtenerOferta(Long id);
}
