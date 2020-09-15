package Model;

public class Libraryrecord {
	
	private String StudentName;
	private String studentID;
	private String RollNo;
	private String BookName;
	private String AthourName;
	private String Edition;
	private String TakingDate;
	private String ReturnDate;
	
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getRollNo() {
		return RollNo;
	}

	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAthourName() {
		return AthourName;
	}

	public void setAthourName(String athourName) {
		AthourName = athourName;
	}

	public String getEdition() {
		return Edition;
	}

	public void setEdition(String edition) {
		Edition = edition;
	}

	public String getTakingDate() {
		return TakingDate;
	}

	public void setTakingDate(String takingDate) {
		TakingDate = takingDate;
	}

	public String getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(String returnDate) {
		ReturnDate = returnDate;
	}

	public Libraryrecord() {			
	}
	
	public String toString() {
		return "\nLibrary Record:"+"\nStudent ID:"+this.studentID+"\nStudent Name:"+this.StudentName+"\nRoll No.:"+this.RollNo+
				"\nBook Name:"+this.BookName+"\nAthour Name:"+this.AthourName+"\nEdition:"+this.Edition+"\nTaking Date:"+this.TakingDate+"\nReturn Date:"+this.ReturnDate;
	}
	
}
