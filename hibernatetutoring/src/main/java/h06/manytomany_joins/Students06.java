package h06.manytomany_joins;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/*
 	Many to Many: Students <===> Library Books
 	              For many to many relationships, we need "Link Table"
 	              
 	              When we use Many To Many relationship between Students06 and Books06
 	              tables, Hibernate will create a)Students06 b)Books06 c)Students06_Books06 d)Books06_Students06.
 	              But if we have Students06_Books06 table no need to create Books06_Students06 or if we have
 	              Books06_Students06 table no need to create Students06_Books06. Because of that we will select
 	              just one of them to use.               	              
*/
@Entity
public class Students06 {
	
	@Id
	private int std_id;
	@Column(name="student_name")
	private String name;
	private int grade;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Students06_Books06", joinColumns = {@JoinColumn(name = "std_id")}, 
											inverseJoinColumns = {@JoinColumn(name = "book_id")})
	private List<Books06> booksList = new ArrayList<Books06>();

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
	public List<Books06> getBooksList() {
		return booksList;
	}
	public void setBooksList(List<Books06> booksList) {
		this.booksList = booksList;
	}
	
	@Override
	public String toString() {
		return "Students06 [std_id=" + std_id + ", name=" + name + ", grade=" + grade + ", booksList=" + booksList
				+ "]";
	} 
	
}