package aad.Francisco.persistencia.impl;

import jakarta.persistence.EntityManager;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import aad.Francisco.entidades.Oferta;
import aad.Francisco.persistencia.OfertaDAO;
import aad.Francisco.persistencia.jpa.Utilidades;

@Repository
@Component("OfertaDAO")
public class OfertaDAOImpl extends GenericDAOImpl<Oferta, Long> implements OfertaDAO{

		@SuppressWarnings("uncheked")
		public List<Oferta> ultimosDiez(){
			EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
			List<Oferta> ofertas = em.createQuery("select o from Oferta o order "
					+ "by o.fechaHora desc 10", Oferta.class).getResultList();
			return ofertas;
		}
		
}
