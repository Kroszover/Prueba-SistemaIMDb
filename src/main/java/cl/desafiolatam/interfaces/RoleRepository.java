package cl.desafiolatam.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.desafiolatam.model.Role;


//Definimos la interface. con metodo List<T> y FindALL
public interface RoleRepository extends JpaRepository<Role, Long>{
	List<Role> findAll();
	//Añadimos el metodo de buscar por nombre de igual forma. 
	List<Role> findByName (String name);
}
