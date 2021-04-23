package com.techproed.restapi04;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.jpa.repository.JpaRepository;

@Entity
@Table(name="students")
public class SB15StudentBean {

	@Id
	private Long id; //Buraya da id belirtmek icin Long yaziyoruz. public interface SB11StudentBeanRepository extends JpaRepository<SB10StudentBean, Long>{
	private String name;
	private String email;
	private LocalDate dob; //LocalDate is class name so we can use it like String etc
	@Transient //i was ignoring age
	private Integer age;
	
	public SB15StudentBean() {
	}

	public SB15StudentBean(Long id, String name, String email, LocalDate dob) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return Period.between(dob, LocalDate.now()).getYears();
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SB07StudentBean [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age
				+ "]";
	}
	
	
}
