package repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

	  Login findByEmail(String email);
	
}
