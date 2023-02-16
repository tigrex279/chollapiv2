package aad.Francisco.demo.servicio;

import java.util.List;

import aad.Francisco.demo.entity.Categoria;

public interface CategoriaService {
	
	public List<Categoria> ListarCategorias();
	public Categoria InsertarCategoria(Categoria categoria);
	public void BorrarCategoria(Long id);
	public Categoria ObtenerCategoria(Long id);
}
