package aad.Francisco.chollapiv2.servicio;

import java.util.List;

import aad.Francisco.chollapiv2.entidades.Oferta;

public interface OfertaService {

	public List<Oferta> ListarOfertas();
	public Oferta InsertarOferta(Oferta oferta);
	public int BorrarOferta(int id);
	public Oferta ActualizarOferta(Oferta oferta);
}
