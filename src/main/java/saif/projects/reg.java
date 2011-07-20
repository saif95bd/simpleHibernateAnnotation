package saif.projects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class reg{
	private long id;
	private String firstname;
	
    @Id
    @GeneratedValue
	public long getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
}