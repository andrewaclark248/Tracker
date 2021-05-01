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
    public Long id;
	
    @Size(min = 1, max = 100)
	public String email;

    @Size(min = 1, max = 100)
    public String firstName;
    
    @Size(min = 1, max = 100)
    public String lastName;
    
    
    public String getEmail() { 
        return email; 
    } 
 
    public void setEmail(String email) { 
        this.email = email; 
    } /******/
}
