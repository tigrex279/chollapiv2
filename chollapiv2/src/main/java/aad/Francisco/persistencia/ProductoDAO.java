package aad.Francisco.persistencia;

import org.springframework.stereotype.Repository;

import aad.Francisco.entidades.Producto;

@Repository
public interface ProductoDAO extends GenericDAO<Producto, Long>{
	
}
