package Model;

public class Student {
	
	private String studentFName;
	private String studentLName;
	private String studentID;
	private String rollNo;
	private String email;
	private String studentpassword;
	private String studentClasse;
	
	public String getStudentFName() {
		return studentFName;
	}
	public void setStudentFName(String studentFName) {
		this.studentFName = studentFName;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return studentpassword;
	}
	public void setPassword(String studentpassword) {
		this.studentpassword = studentpassword;
	}
	public String getStudentClasse() {
		return studentClasse;
	}
	public void setStudentClasse(String studentClasse) {
		this.studentClasse = studentClasse;
	}
	
	public String getStudentLName() {
		return studentLName;
	}
	public void setStudentLName(String studentLName) {
		this.studentLName = studentLName;
	}
	public String toString() {
		return "\nStudent Record:"+"\nStudent First Name:"+this.studentFName+"\nStudent Last Name:"+this.studentLName+"\nStudent ID:"+this.studentID+"\nRoll No.:"+this.rollNo+
				"\nEmailID:"+this.email+"\nStudent Password:"+this.studentpassword+"\nStudent Class:"+this.studentClasse;
		}
}