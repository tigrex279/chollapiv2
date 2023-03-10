package aad.Francisco.demo.servicioImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aad.Francisco.demo.entity.Categoria;
import aad.Francisco.demo.repository.CategoriaRepository;
import aad.Francisco.demo.servicio.CategoriaService;

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
