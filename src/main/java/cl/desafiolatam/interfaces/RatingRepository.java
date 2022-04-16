package cl.desafiolatam.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.desafiolatam.model.Rating;


//Definimos la interface. con metodo List<T> y FindALL
public interface RatingRepository extends JpaRepository<Rating, Long>{
	List<Rating> findAll();
}
