package Service;

import java.util.ArrayList;

import Model.Libraryrecord;
import Model.Student;
import Model.Teacher;

public class ListDetails {
	ArrayList<Student> studList = new ArrayList<Student>();  // for storing  dynamic collection for student
	ArrayList<Teacher> techList = new ArrayList<Teacher>();  // for storing  dynamic collection  for teacher
	ArrayList<Libraryrecord> librarylist=new ArrayList<Libraryrecord>();   // for storing  dynamic collection  for library record
	
	public boolean addStudents(Student stud) { //for display registration detail is true or false  
		if(stud == null)
			return false;
		else {
			studList.add(stud);
			return true;
		}
	}
	public boolean addTeacher(Teacher teacher) { //for display teacher detail is true or false   
		if(teacher == null)
			return false;
		else {
			techList.add(teacher);
			return true;
		}
	}
	@SuppressWarnings("unused")
	public boolean ListStudent(Student stud) {//for display Student in list format 
		int temp  = 0;
		for(Student sd: studList) {
			System.out.println(studList.get(0));
			
		}
		if (temp == 0)
		return false;
		else
			return true;
	}

	public boolean addLibraryrecord(Libraryrecord libraryrecord) {//for display library record detail is true or false  
		if(libraryrecord == null)
			return false;
		else {
			librarylist.add(libraryrecord);
			return true;
		}
	}
	@SuppressWarnings("unused")
	public boolean ListLibrary(Libraryrecord libraryrecord) {//for display in list format.
		int temp1  = 0;
		for(Libraryrecord sd: librarylist) {
			System.out.println(librarylist.get(0));
			
		}
		if (temp1 == 0)
		return false;
		else
			return true;
	}
	
}
