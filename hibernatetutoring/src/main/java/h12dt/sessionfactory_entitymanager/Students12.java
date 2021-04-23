package h12dt.sessionfactory_entitymanager;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students12 { //this is simple POJO class
	
	@Id
	private int id;
	private String name;
	private int mathGrade;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMathGrade() {
		return mathGrade;
	}
	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", mathGrade=" + mathGrade + "]";
	}
	
}
