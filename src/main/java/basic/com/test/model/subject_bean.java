package basic.com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class subject_bean {

	
	@Id
	private int sub_id;
	@Column(name="subject_name")
	private String sub_name;
	@Column(name="student_id")
	private int student_id;
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	@Override
	public String toString() {
		return "subject_bean [sub_id=" + sub_id + ", sub_name=" + sub_name + ", student_id=" + student_id + "]";
	}
	
	
}
