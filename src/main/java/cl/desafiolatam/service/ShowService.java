package cl.desafiolatam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.interfaces.ShowRepository;
import cl.desafiolatam.model.Show;

@Service
public class ShowService {
	
	@Autowired
	private ShowRepository showRepository;
	
	
	public Show findById(Long id) {
		Optional<Show> optionalShow = showRepository.findById(id);
		if (optionalShow.isPresent()) {
			return optionalShow.get();
		} else {
			return null;
		}
	}
	
	//Metodo findall
	public List<Show> findAllShows(){
		return showRepository.findAll();
	} 
	//Guardar Show
	public void saveShow(Show show) {
		showRepository.save(show);
	}
	//Modificar show
	public void updateShow(Show show) {
		showRepository.save(show);
	}
	//Borrar Show
	public void deleteShow(Long id) {
		showRepository.deleteById(id);
	}
	

}