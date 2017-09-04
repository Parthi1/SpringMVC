package com.emids.springmvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity 
@Table(name= "EmployeeDetail")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	//@NotNull
	private int id;
	
	@Column(name="firstname")
	//@NotNull @NotEmpty @Size(min=2, max=30) 
    private String firstname;
	
	@Column(name="lastname")
	//@Size(min=2, max=30) 
    private String lastname;
	
	@Column(name="email")
	//@NotEmpty @NotNull @Email
    private String email;
     
	@Column(name="age")
    //@NotNull @Min(18) @Max(100)
    private Integer age;	
    
	@Column(name="birthday")
    @DateTimeFormat(pattern="MM/dd/yyyy")
    //@NotNull @Past
    private Date birthday;
    
	@Column(name="designation")
   // @NotNull
    private String designation;
    
	@Column(name="department")
   // @NotNull
    private String department;
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
