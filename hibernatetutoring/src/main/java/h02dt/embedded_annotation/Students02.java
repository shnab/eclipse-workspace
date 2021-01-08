package h02dt.embedded_annotation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students02 {
	
	@Id
	private int std_id;
	private String name;
	private int grade;
	
	private Courses02 course;
	
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Courses02 getCourse() {
		return course;
	}
	public void setCourse(Courses02 course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Students02 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + "]";
	}
	
}
