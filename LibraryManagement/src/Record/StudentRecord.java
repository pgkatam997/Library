package Record;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import Controller.Main;
import DAO.StudentDAO;
import Model.Student;
import Service.ListDetails;
import Utility.ConnectionManager;
import Utility.Validation;

public class StudentRecord {
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Student> studList = new ArrayList<Student>();
	static Scanner sc=new Scanner(System.in);
	static Student stud=new Student();
	static Main main=new Main();
	static Validation vd= new Validation();
	static ListDetails sd = new ListDetails();
	static StudentDAO studentdao=new StudentDAO();
	static StudentRecord sr=new StudentRecord();
	static ConnectionManager cm=new ConnectionManager();
	private static Object LibraryRecord;
	private String[] args;

	public boolean add1(Object StudentLogin) throws SQLException, Exception
	{
		System.out.println("Student ID");
		boolean flag1=true;
		while(flag1) {
			String studentID=br.readLine(); 
			if(vd.ValidationID(studentID)) { //validation for ID
				stud.setStudentID(studentID);
		flag1=false;
			}else {
				System.out.println(" 'S' s must be capital and '-' in mandetory");
			}
		}
		
		System.out.println("Student Password:");
		boolean flag2=true;
		while(flag2) {//flag variable is used as signal in program know that a certain condition it act as a boolean  
			String studentpassword=br.readLine();	
		if(vd.ValidPassword(studentpassword)) {  //validation for password
			stud.setPassword(studentpassword);
			flag2=false;
		}else {
			System.out.println("----please enter first letter is capital and at least 2 number----");
		}
		}
		
		System.out.println("Login successfully");
		
		
		LibraryRecord lr=new LibraryRecord();
		lr.add(LibraryRecord);   //if login successfully then goes to library record class
		return true;
		
	}
	
	@SuppressWarnings("unused")
	public boolean add(Object studentRecord) throws SQLException, Exception {
		System.out.println("Student First Name:");
		boolean flag3=true;
		while(flag3) {
			String studentFName=br.readLine();				
		if(vd.ValidationName(studentFName)) {   //Validation for name using validation class 
			stud.setStudentFName(studentFName);
			flag3=false;
		}
		else {
			System.out.println("!!!!Enter only Character!!!!");
		}
		}	
		System.out.println("Student Last Name:");
		boolean flag4=true;
		while(flag4) {
			String studentLName=br.readLine();				
		if(vd.ValidationName(studentLName)) {   //Validation for name using validation class 
			stud.setStudentLName(studentLName);
			flag4=false;
		}
		else {
			System.out.println("!!!!Enter only Character!!!!");
		}
		}	
		
		System.out.println("Student ID:");
		boolean flag5=true;
		while(flag5) {
			String studentID=br.readLine(); 
			if(vd.ValidationID(studentID)) {   ///validation for ID using validation class 
				stud.setStudentID(studentID);
				flag5=false;
			}else {
				System.out.println("'S' and '-' in mandetory");
			}
		}
		
		System.out.println("Student RollNO:");
		boolean flag6=true;
		while(flag6) {
		String rollNo=br.readLine();
		if(vd.ValidationRollno(rollNo)){   ///validation for Roll no. using validation class. 
			stud.setRollNo(rollNo);
			flag6=false;
		}else {
			System.out.println("!!!!Enter only Number!!!!");
		}
		}
		
		System.out.println("Student EmailID:");
		boolean flag7=true;
		while (flag7) {
			String email=br.readLine();
			
			if(vd.Validationemail(email)) {  //////validation for emailID using validation class 
				stud.setEmail(email);
				flag7=false;
			}
			else {
				System.out.println("---Please enter vaild emailID---");
			}
			}
		
		System.out.println("Student Password:");
		boolean flag8=true;
		while(flag8) {
			String studentpassword=br.readLine();
			
		if(vd.ValidPassword(studentpassword)) {   ///validation for Password using validation class 
			stud.setPassword(studentpassword);
			flag8=false;
		}else {
			System.out.println("----please enter first letter is capital and at least 2 number----");
		}
		}
		
		System.out.println("Student Class:");
		
		boolean flag9=true;
		while(flag9) {
			String studentClasse=br.readLine();
		if(vd.ValidationClass(studentClasse)) {   ///validation for classes using validation class 
			stud.setStudentClasse(studentClasse);
			flag9=false;
		}else {
			System.out.println("-----enter only character and number-------");
		}
		}
			
			boolean temp = sd.addStudents(stud);
			if(temp) {
				System.out.println("Record Inserted Succefully");
				
			}
			else {
				System.out.println("Please Check the details");
				
			}
			
			boolean temp2 = sd.ListStudent(stud);
			if(temp2) 
			{
				System.out.println("Log in successfully");
			}
			studentdao.addstudentdeatils(stud);	
			
		while(true) {
			System.out.println("A]   Add new student");
			System.out.println("B]   Delete student details");
			System.out.println("C]   Update student details");
			System.out.println("D]   View student details");
		
		int n=sc.nextInt();
		sc.nextLine();
		switch(n) {
		case 1:
			sr.add(studentRecord);	
		break;
		case 2:
			studentdao.deletestudentdeatils();
			break;
		case 3: 
			studentdao.updatestudentdeatils(stud);//update is must sir???
			break;
		case 4: 
			studentdao.displaystudentdeatils();
			break;
		}
		System.out.println("Do you want to continue? 1.yes 2. goto back 3. no");
		int opt=sc.nextInt();
		sc.nextLine();
		if(opt==1) {
			continue;
		}
		else if(opt==2) {
			Main main=new Main();
			Main.main(args);
		}
		else {
			break;
		}
		sc.close();	
			
		return true;
		
	}
		return true;
	}
	}
	



