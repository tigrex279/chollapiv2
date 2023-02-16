package aad.Francisco.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import aad.Francisco.demo.entity.Oferta;


@Repository
public interface OfertaRepository extends JpaRepository<Oferta, Serializable>{
	 
}
