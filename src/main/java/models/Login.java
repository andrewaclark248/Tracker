package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "logins")
public class Login {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Size(min = 1, max = 100)
    private String email;

    @Size(min = 1, max = 100)
    private String firstName;
    
    @Size(min = 1, max = 100)
    private String lastName;
}
