package aad.Francisco.persistencia;

import java.util.List;

import aad.Francisco.entidades.Oferta;

public interface OfertaDAO extends GenericDAO<Oferta, Long>{
	public List<Oferta> ultimosDiez();
}
