package com.testdrive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@NotEmpty
	@Column(name="EMPLOYEEID", unique=true, nullable=false)
	private String employeeid;
	
	@NotEmpty
	@Column(name="FIRST_NAME", nullable=false)
	@Size(max=10, message="First Name is not more than 10 characters")
	private String firstName;

	@NotEmpty
	@Column(name="LAST_NAME", nullable=false)
	private String lastName;

	
	@Column(name="EMAIL", nullable=false)
	private String email;
	
	@Column(name="MIDDLE_INITIAL", nullable=true)
	private String middle_initial;

	@Column(name="TITLE", nullable=true)
	private String title;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMiddle_initial() {
		return middle_initial;
	}

	public void setMiddle_initial(String middle_initial) {
		this.middle_initial = middle_initial;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeid=" + employeeid + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", middle_initial=" + middle_initial + ", title=" + title + "]";
	}
	

}
