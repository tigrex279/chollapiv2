package aad.Francisco.demo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "oferta")
@NamedQuery(name="Oferta.findAll", query="SELECT o FROM Oferta o")
public class Oferta implements Serializable{
	private static final Long serialVersionUID = 1L;
	
	/*
	 * Atributos de la entidad:
	 * id,url,fecha y hora,precio,disponible
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//identificador de la entidad
	private Long idOferta;
	
	private String url;
	
	@Column(name="fecha_hora_publicacion")//nombre de la columa en la tabla
	private LocalDateTime fechaHoraPublicacion;
	@Column
	private Float precio;
	@Column
	private Boolean disponible;
	
	//bi-directional many-to-many association to Cancion
		@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
		@JoinTable(
			name="oferta_producto"
			, joinColumns={
				@JoinColumn(name="idOferta")
				}
			, inverseJoinColumns={
				@JoinColumn(name="idProducto")
				}
			)
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Oferta() {
		
	}

	public Long getId() {
		return idOferta;
	}

	public void setId(Long id) {
		this.idOferta = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDateTime getFechaHoraPublicacion() {
		return fechaHoraPublicacion;
	}

	public void setFechaHoraPublicacion(LocalDateTime localDateTime) {
		this.fechaHoraPublicacion = localDateTime;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public void addProducto(Producto producto) {
		productos.add(producto);
	}

	public void removeProducto(Producto producto) {
		productos.remove(producto);
	}

	@Override
	public String toString() {
		return "Oferta [id=" + idOferta + ", url=" + url + ", fechaHoraPublicacion=" + fechaHoraPublicacion + ", precio=" + precio + ", disponible="
				+ disponible + "]";
	}
	
	
	
	
}