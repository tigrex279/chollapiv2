package aad.Francisco.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aad.Francisco.entidades.Oferta;
import aad.Francisco.persistencia.OfertaDAO;

@Transactional
@Service
public class OfertaServicioImpl {
	 @Autowired
	 OfertaDAO ofertaDao;
	 
	 public void comprobarOfertaDuplicada(Oferta oferta, Oferta ofertaComp) {
		 
		 
	 }
}
