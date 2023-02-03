package aad.Francisco.persistencia;

import java.util.List;

import org.springframework.stereotype.Repository;

import aad.Francisco.entidades.Oferta;

@Repository
public interface OfertaDAO extends GenericDAO<Oferta, Long>{
	public List<Oferta> ultimosDiez();
}
