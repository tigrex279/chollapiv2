package aad.Francisco.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aad.Francisco.entidades.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Serializable>{

}
