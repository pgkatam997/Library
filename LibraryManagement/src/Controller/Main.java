package Controller;


import java.sql.Connection;
import java.util.Scanner;
import DAO.LibraryRecordDAO;
import DAO.StudentDAO;
import Model.Student;
import Model.Teacher;
import Record.StudentRecord;
import Record.TeacherRecord;
import Utility.ConnectionManager;
import Utility.Validation;

public class Main {
	//create a object
	static Validation vd= new Validation(); //create a object for validation class in utility package.
	static Scanner sc=new Scanner(System.in);
	private static Object studentRecord;
	private static Object TeacherRecord;
	static StudentRecord sr=new StudentRecord(); 
	static StudentDAO studentdao=new StudentDAO();
	static LibraryRecordDAO libraryrecorddao=new LibraryRecordDAO();
	static Student stud=new Student();
	static Teacher teacher = new Teacher();
	
	public static void main(String[] args)throws Exception
	{
		@SuppressWarnings("unused")
		Connection con;
		con=ConnectionManager.getConnection();
		
		while(true) {
		System.out.println("---------LIBRARY MANAGEMENT FOR SCHOOL AND COLLEGE---------");	
		System.out.println("1. New Student Registration");
		System.out.println("2. Teacher Login");
		
		
		int n=sc.nextInt();
		sc.nextLine();
		switch(n) {
		case 1:   //create a registration part 
			sr.add(studentRecord);  //using this go to student record class
			break;
		case 2: //create a teacher part 
			TeacherRecord tr=new TeacherRecord(); // call the class 
			tr.add(TeacherRecord);		//using this go to  teacher record class
			break;
		}
		
		System.out.println("Do you want to continue? 1. Yes 2. No");
		int opt = sc.nextInt();
		sc.nextLine();
		if(opt==1) {
			continue;
		}
		else
			break;
		}
		sc.close();	
	}
}
