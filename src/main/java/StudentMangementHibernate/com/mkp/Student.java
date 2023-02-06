package StudentMangementHibernate.com.mkp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@Column(name = "sid")
	private int id;
	
	@Column(name= "sname")
	private String sName;
	
	@Column(name= "sphone")
	private String sPhone;
	
	@Column(name = "scity")
	private String sCity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPhone() {
		return sPhone;
	}

	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	
	
	public Student(String sName, String sPhone, String sCity) {
		super();
		this.sName = sName;
		this.sPhone = sPhone;
		this.sCity = sCity;
	}
	
	

	public Student(int id, String sName, String sPhone, String sCity) {
		super();
		this.id = id;
		this.sName = sName;
		this.sPhone = sPhone;
		this.sCity = sCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sName=" + sName + ", sPhone=" + sPhone + ", sCity=" + sCity + "]";
	}
	
	

}
