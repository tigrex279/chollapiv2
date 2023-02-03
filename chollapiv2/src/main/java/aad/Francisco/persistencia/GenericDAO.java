package aad.Francisco.persistencia;


import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GenericDAO<T, ID extends Serializable> {
	void persist(T entity);
	void merge(T entity);
	void remove(ID id);
	T findById(ID id);
	List<T> finndAll();
}
