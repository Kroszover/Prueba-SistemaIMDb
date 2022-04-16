package cl.desafiolatam.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.model.User;

//Anotacionde repositorio
@Repository
//Definimos la interface. con metodo List<T> y FindALL
public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findAll ();
	//Agregamos metodos para buscar por nombre y email de igual manera. 
	User findByUsername (String username);
	User findByEmail (String email);

}
