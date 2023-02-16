package aad.Francisco.chollapiv2.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import aad.Francisco.chollapiv2.entidades.*;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Serializable>{

}
