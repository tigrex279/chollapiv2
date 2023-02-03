package aad.Francisco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aad.Francisco.entidades.*;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
