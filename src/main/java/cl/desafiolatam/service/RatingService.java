package cl.desafiolatam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.desafiolatam.interfaces.RatingRepository;
import cl.desafiolatam.model.Rating;

public class RatingService {
//Instansciamos los metodos, 
	@Autowired
	private RatingRepository ratingRepository;
	
	//FindAll
	public List<Rating> findAllRatings(){
		return ratingRepository.findAll();
	}
	//Buscar por id
	public Rating findRatingById(Long id) {
		return ratingRepository.findById(id).orElse(null);
	}
	//Agregar Rating
	public void addRating(Rating rating) {
		ratingRepository.save(rating);
	}
}
