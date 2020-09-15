package Record;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import Controller.Main;
import DAO.LibraryRecordDAO;
import Model.Libraryrecord;
import Service.ListDetails;
import Utility.Validation;

public class LibraryRecord {
	
	ArrayList<Libraryrecord> librarylist=new ArrayList<Libraryrecord>();
	private Object StudentLogin;
	static Scanner sc=new Scanner(System.in);
	static Validation vd= new Validation();
	static ListDetails sd = new ListDetails();
	static LibraryRecordDAO libraryrecorddao=new LibraryRecordDAO();
	static Libraryrecord library=new Libraryrecord(); 
	static StudentRecord sr=new StudentRecord();
	
	@SuppressWarnings("unused")
	public  boolean add(Object LibraryRecord) throws SQLException, Exception {  //create the add library record function for displaying record of library 
		
		System.out.println("Student ID");
		boolean flag1=true;
		while(flag1) {
			String studentID=sc.next(); 
			if(vd.ValidationID(studentID)) { //validation for ID
				library.setStudentID(studentID);
				flag1=false;
			}else {
				System.out.println(" 'S' s must be capital and '-' in mandetory");
			}
		}
		System.out.println("Student Name:");
		boolean flag2=true;
		while(flag2) {
			String StudentName=sc.next();
			
		if(vd.ValidationName(StudentName)) { //validation for name
			library.setStudentName(StudentName);
			flag2=false;
		}
		else {
			System.out.println("!!!!Enter only Character!!!!");
		}
		}	
		
		System.out.println("Roll No.:");
		boolean flag3=true;
		while(flag3) {
			String RollNo=sc.next();
		if(vd.Validationrollno(RollNo)){  //validation for roll no
			library.setRollNo(RollNo);
			flag3=false;
		}else {
			System.out.println("!!!!Enter only Number!!!!");
		}
		}
		
		System.out.println("Book Name:");
		boolean flag4=true;
		while(flag4) {
			String BookName=sc.next();
			
		if(vd.ValidationName(BookName)) { //validation for name 
			library.setBookName(BookName);
			flag4=false;
		}
		else {
			System.out.println("!!!!Enter only Character!!!!");
		}
		}	
		
		System.out.println("Athour Name:");
		boolean flag5=true;
		while(flag5) {
			String AthourName=sc.next();
		if(vd.ValidationName(AthourName)) { ///validation for character 
			library.setAthourName(AthourName);
			flag5=false;
		}
		else {
			System.out.println("!!!!Enter only Charater!!!!");
		}
		}	
		
		System.out.println("Edition:");
		boolean flag6=true;
		while(flag6) {
			String Edition=sc.next();
			if(vd.ValidationEdition(Edition)) { //validation for edition
				library.setEdition(Edition);
				flag6=false;
			}else {
				System.out.println("----'th' is mandetory----");
			}
		}
		
		System.out.println("Taking Date:");
		boolean flag7=true;
		while(flag7) {
			String TakingDate=sc.next();
			if(vd.ValidationDate(TakingDate)) { //validation for date
				library.setTakingDate(TakingDate);
				flag7=false;
			}else {
				System.out.println("-----Enter in only 'dd/mm/yyyy' this format-----");
			}
		}
		
		System.out.println("Return Date:");
		boolean flag8=true;
		while(flag8) {
			String ReturnDate=sc.next();
			if(vd.ValidationDate(ReturnDate)) { //validation for date
				library.setReturnDate(ReturnDate);
				flag8=false;
			}else {
				System.out.println("-----Enter in only 'dd/mm/yyyy' this format-----");
			}
		}
		
		boolean temp1 = sd.addLibraryrecord(library);
		if(temp1) {
			System.out.println("Record Inserted Succefully");
		}
		else {
			System.out.println("Please Check the details");
		}	
		
		boolean temp3 = sd.ListLibrary(library);
		if(temp3) 
		{
			System.out.println("Logged is successfully");
		}
		libraryrecorddao.addLibraryRecord(library);
		while(true) {
			System.out.println("A]   Add new library");
			System.out.println("B]   Delete library details");
			System.out.println("C]   Update library details");
			System.out.println("D]   View library details");
		
		int n=sc.nextInt();
		sc.nextLine();
		switch(n) {
		case 1:			
			sr.add1(StudentLogin);
			break;
		case 2:			
			libraryrecorddao.DeleteLibraryRecord();
			break;
		case 3:
			libraryrecorddao.updatesLibraryRecord(library);
		case 4: 
			libraryrecorddao.displayLibraryRecord();
			break;
		}
		System.out.println("Do you want to continue? 1.yes 2. goto back 3. no");
		int opt = sc.nextInt();
		sc.nextLine();
		if(opt==1) {
			continue;
		}
		else if(opt==2) {
			Main main=new Main();
			Main.main(null);
		}
		else {
			break;
		}
		}
		return true;
				
	}		
	
}
