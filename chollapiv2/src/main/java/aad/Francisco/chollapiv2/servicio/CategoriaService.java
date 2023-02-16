package aad.Francisco.chollapiv2.servicio;

import java.util.List;

import aad.Francisco.chollapiv2.entidades.Categoria;

public interface CategoriaService {
	
	public List<Categoria> ListarCategorias();
	public Categoria InsertarCategoria(Categoria categoria);
	public void BorrarCategoria(Long id);
	public Categoria ObtenerCategoria(Long id);
}
