package aad.Francisco.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "producto")
@NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	/*
	 * Atributos de la entidad id, nombre, fabricante(nullable)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// identificador del producto
	private Long idProducto;
	@Column
	private String nombre;
	
	@Column
	String caracteristicas;

	@Column(name = "fabricante", nullable = true) // indica la columna puede ser null
	private Long idFabricante;

	// bi-directional many-to-many association to Playlist
	@ManyToMany(mappedBy = "productos", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Oferta> ofertas = new ArrayList<Oferta>();

	@ManyToOne
	@JoinColumn(name = "idCategoria")
	private Categoria categoria;

	public Producto() {

	}

	public Long getId() {
		return idProducto;
	}

	public void setId(Long id) {
		this.idProducto = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdFabricante() {
		return idFabricante;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setIdFabricante(Long idFabricante) {
		this.idFabricante = idFabricante;
	}

	public List<Oferta> getOfertas() {
		return ofertas;
	}

	public void setOfertas(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

	public void addOferta(Oferta oferta) {
		ofertas.add(oferta);
	}

	public void removeOferta(Oferta oferta) {
		ofertas.remove(oferta);
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	
}