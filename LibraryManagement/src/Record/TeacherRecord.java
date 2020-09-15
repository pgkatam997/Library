package Record;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import Model.Teacher;
import Service.ListDetails;
import Utility.Validation;

public class TeacherRecord {
	
	static Scanner sc=new Scanner(System.in);
	ArrayList<Teacher> techList = new ArrayList<Teacher>();  // for storing  dynamic collection  for teacher
	static Validation vd= new Validation(); //create a object for validation class in utility package.
	static ListDetails sd = new ListDetails(); //create a object for list of student,teacher,and library record also. 
	static Teacher teacher = new Teacher(); //create a object for teacher in model package. 	
	@SuppressWarnings("unused")
	private static Object StudentRecord;
	
	public boolean add(Object TeacherRecord) throws SQLException, Exception {
		
		System.out.println("Teacher First Name");
		boolean flag1=true;
		while(flag1) {
			String techFName=sc.next();
			
		if(vd.ValidationName(techFName)) {   //validation for teacher name
			teacher.setTechName(techFName);
			flag1=false;
		}
		else {
			System.out.println("!!!!Enter only Character!!!!");
		}
		}	
		System.out.println("Teacher Last Name");
		boolean flag2=true;
		while(flag2) {
			String techLName=sc.next();
			
		if(vd.ValidationName(techLName)) {   //validation for teacher name
			teacher.setTechName(techLName);
			flag2=false;
		}
		else {
			System.out.println("!!!!Enter only Character!!!!");
		}
		}	
		System.out.println("Teacher EmailID");
		boolean flag3=true;
		while (flag3) {
			String techeremailID=sc.next();
			
			if(vd.ValidationEmailID(techeremailID)) { // validation for teacher emailID
				teacher.setTecheremailID(techeremailID);
				flag3=false;
			}
			else {
				System.out.println("---Please enter vaild ID---");
			}
			}
		
		System.out.println("Password");
		boolean flag4=true;
		while(flag4) {
			String teacherpassword=sc.next();	
		if(vd.ValidationName( teacherpassword)) {   //validation for teacher name
			teacher.setTeacherpassword(teacherpassword);
			flag4=false;
		}
		else {
			System.out.println("!!!!Enter only Character!!!!");
		}
		}	
		
		boolean temp1 = sd.addTeacher(teacher);
		if(temp1) {
			System.out.println("Login Succefully");
			
			StudentRecord sr=new StudentRecord();
			sr.add1(sr);
		}		
		return true;
		
	}
}
