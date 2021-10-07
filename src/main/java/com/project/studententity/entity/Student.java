package com.project.studententity.entity;

import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "student_name")
	private String studentname;

	@Column(name = "City")
	private String city;

	@Column(name = "State")
	private String state;

	@Column(name = "Pincode")
	private Integer pincode;

	@Column(name = "BloodGroup")
	private String bloodGroup;

	@Column(name = "percent")
	private Integer percentage;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "mailid")
	private String mailid;

	@Column(name = "college")
	private String college;

	@Column(name = "qualification")
	private String qualification;
	
	public Student() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bloodGroup, city, college, dob, id, mailid, percentage, pincode, qualification, state,
				studentname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(bloodGroup, other.bloodGroup) && Objects.equals(city, other.city)
				&& Objects.equals(college, other.college) && Objects.equals(dob, other.dob)
				&& Objects.equals(id, other.id) && Objects.equals(mailid, other.mailid)
				&& percentage == other.percentage && pincode == other.pincode
				&& Objects.equals(qualification, other.qualification) && Objects.equals(state, other.state)
				&& Objects.equals(studentname, other.studentname);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", bloodGroup=" + bloodGroup + ", percentage=" + percentage + ", dob=" + dob
				+ ", mailid=" + mailid + ", college=" + college + ", qualification=" + qualification + "]";
	}
	
}
	