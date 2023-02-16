package aad.Francisco.chollapiv2.servicioImp;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aad.Francisco.chollapiv2.entidades.Categoria;
import aad.Francisco.chollapiv2.repository.CategoriaRepository;
import aad.Francisco.chollapiv2.servicio.CategoriaService;

@Transactional
@Service
public class CategoriaServiceImp implements CategoriaService{
	@Autowired
	private CategoriaRepository cr;
	
	@Override
	public List<Categoria> ListarCategorias() {
		return cr.findAll();
	}

	@Override
	public Categoria InsertarCategoria(Categoria categoria) {
		return cr.save(categoria);
	}

	@Override
	public void BorrarCategoria(Long id) {
		cr.deleteById(id);
	}

	@Override
	public Categoria ObtenerCategoria(Long id) {
		return cr.findById(id).orElse(null);
	}
	

}
