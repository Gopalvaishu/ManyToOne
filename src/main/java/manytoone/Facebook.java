package manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Facebook {
	@Id
	private long accountid;
	private String name;
	private long phone;
	
	@ManyToOne
	Student id;

	public long getAccountid() {
		return accountid;
	}

	public void setAccountid(long accountid) {
		this.accountid = accountid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Student getId() {
		return id;
	}

	public void setId(Student id) {
		this.id = id;
	}
	
	
	

}
