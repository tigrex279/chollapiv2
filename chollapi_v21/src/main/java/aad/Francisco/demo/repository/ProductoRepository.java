package aad.Francisco.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aad.Francisco.demo.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Serializable>{

}
