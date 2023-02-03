package aad.Francisco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aad.Francisco.entidades.Oferta;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, Long>{

}
