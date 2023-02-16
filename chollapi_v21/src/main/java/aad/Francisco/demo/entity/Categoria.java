package aad.Francisco.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categaria")
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria {
	private static final Long serialVersionID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCategoria;
	
	@Column
	private String nombre;
	
	@Column
	private String descripcion;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Producto> productos;
	
	
	public Long getId() {
		return idCategoria;
	}

	public void setId(Long id) {
		this.idCategoria = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Categaria [id=" + idCategoria + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
}
