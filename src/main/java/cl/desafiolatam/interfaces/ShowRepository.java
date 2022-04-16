package cl.desafiolatam.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.desafiolatam.model.Show;


//Definimos la interface. con metodo List<T> y FindALL
public interface ShowRepository extends JpaRepository<Show, Long>{
	List<Show> findAll();

}
