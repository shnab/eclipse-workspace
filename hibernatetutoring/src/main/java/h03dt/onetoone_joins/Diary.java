package h03dt.onetoone_joins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Diary {
	
	@Id
	private int id;
	private String diary_name;
	
	@OneToOne
	@JoinColumn(name = "student_id")
	private Students03 student;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiary_name() {
		return diary_name;
	}
	public void setDiary_name(String diary_name) {
		this.diary_name = diary_name;
	}
	public Students03 getStudent() {
		return student;
	}
	public void setStudent(Students03 student) {
		this.student = student;
	}
	
	@Override
	public String toString() {
		return "Diary [id=" + id + ", diary_name=" + diary_name + "]";
		}
	
}
