package aad.Francisco.persistencia.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import aad.Francisco.entidades.Producto;
import aad.Francisco.persistencia.ProductoDAO;

@Repository
@Component("")
public class ProductoDAOImpl extends GenericDAOImpl<Producto, Long> implements ProductoDAO{

}
