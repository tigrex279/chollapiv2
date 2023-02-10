package aad.Francisco.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import aad.Francisco.entidades.Oferta;

@Repository
@Component("")
public interface OfertaRepository extends JpaRepository<Oferta, Serializable>{
	 
}
