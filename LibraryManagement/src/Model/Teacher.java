package Model;

public class Teacher {
	private String techFName;
	private String techLName;
	private String techeremailID;
	private String teacherpassword;
	

	public String getTechFName() {
		return techFName;
	}
	public void setTechName(String techFName) {
		this.techFName = techFName;
	}
	public String getTecheremailID() {
		return techeremailID;
	}
	public void setTecheremailID(String techeremailID) {
		this.techeremailID = techeremailID;
	}
	public String getTeacherpassword() {
		return teacherpassword;
	}
	public void setTeacherpassword(String teacherpassword) {
		this.teacherpassword = teacherpassword;
	}
	public String getTechLName() {
		return techLName;
	}
	public void setTechLName(String techLName) {
		this.techLName = techLName;
	}
	public String toString() {
		return "\nTeacher Record:"+"\nTeacher First Name:"+this.techFName+"\nTeacher Last Name:"+this.techLName+
				"\nTeacher emailID:"+this.techeremailID+"\nTeacher Password:"+this.teacherpassword;
		}
}
