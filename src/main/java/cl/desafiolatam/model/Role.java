package cl.desafiolatam.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "role_id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "role_name")
	private String name;
	
	// Agregar a la BD
		//  INSERT INTO tabla.roles (id, name) VALUES (1, 'ROLE_USER');
		//  INSERT INTO tabla.roles (id, name) VALUES (2, 'ROLE_ADMIN');
	@ManyToMany(mappedBy = "roles")
	private List<User> users;

	
	//Constructor Vacio
	public Role() {}

	
	//Getters y Setters.
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
