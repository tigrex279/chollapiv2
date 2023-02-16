package aad.Francisco.demo.servicioImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aad.Francisco.demo.entity.Oferta;
import aad.Francisco.demo.repository.OfertaRepository;
import aad.Francisco.demo.servicio.OfertaService;

@Service
public class OfertaServiceImp implements OfertaService{
	@Autowired
	OfertaRepository or;

	@Override
	public List<Oferta> ListarOfertas() {
		return or.findAll();
	}

	@Override
	public Oferta InsertarOferta(Oferta oferta) {
		return or.save(oferta);
	}

	@Override
	public void BorrarOferta(Long id) {
		or.deleteById(id);
	}

	@Override
	public Oferta ObtenerOferta(Long id) {
		return or.findById(id).orElse(null);
	}

	

}
