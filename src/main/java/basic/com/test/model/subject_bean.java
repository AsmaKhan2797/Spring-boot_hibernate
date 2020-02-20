package basic.com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class subject_bean {

	
	@Id
	private int s_id;
	@Column(name="student_name")
	private String s_name;
	@Column(name="student_fees")
	private String s_fees;
	public String getS_fees() {
		return s_fees;
	}
	public void setS_fees(String s_fees) {
		this.s_fees = s_fees;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	@Override
	public String toString() {
		return "student_bean [s_id=" + s_id + ", s_name=" + s_name + ", s_fees=" + s_fees + "]";
	}
	
}
