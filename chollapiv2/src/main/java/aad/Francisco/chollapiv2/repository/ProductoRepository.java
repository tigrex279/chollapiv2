package aad.Francisco.chollapiv2.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aad.Francisco.chollapiv2.entidades.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Serializable>{

}
