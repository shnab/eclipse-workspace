package h03dt.onetoone_joins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/*	
 * 
  OnetoOne relationship is like Student and Diary relationship.
  For every student you will have a single diary, and for every diary you will have a single student
 									Student <==> Diary
 */

@Entity
public class Students03 {
	
	@Id
	private int id;
	@Column(name = "std_name")
	private String name;
	private int grade;
	
	@OneToOne(mappedBy = "student")
	private Diary diary;
	
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Diary getDiary() {
		return diary;
	}
	public void setDiary(Diary diary) {
		this.diary = diary;
	}
	
	@Override
	public String toString() {
		return "Students03 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
		
	}

}
