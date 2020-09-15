package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import Model.Student;
import Utility.ConnectionManager;

public class StudentDAO {
	Student stud=new Student();	
	Scanner sc=new Scanner(System.in);
	
	@SuppressWarnings("unused")
	public boolean addstudentdeatils(Student stud) throws Exception {
		
		String studentFName=stud.getStudentFName();
		String studentLName=stud.getStudentLName();
		String studentID=stud.getStudentID();
		String rollNo=stud.getRollNo();
		String email=stud.getEmail();
		String studentpassword=stud.getPassword();
		String studentClasse=stud.getStudentClasse();		
		System.out.println(studentFName);
		ConnectionManager cm=new ConnectionManager();
		String sql="insert into studentdetails(studentFName,studentLName,studentID,rollNo,email,studentpassword,studentClasse)Values(?,?,?,?,?,?,?)";
		PreparedStatement st=ConnectionManager.getConnection().prepareStatement(sql);		
		st.setString(1, studentFName);
		st.setString(2, studentLName);
		st.setString(3, studentID);
		st.setString(4, rollNo);
		st.setString(5, email);
		st.setString(6, studentpassword);
		st.setString(7, studentClasse);
		
		st.executeUpdate();
		ConnectionManager.getConnection().close();// enter the data null values but now Database working
		return true;
		
	}
		@SuppressWarnings("unused")
		public void deletestudentdeatils() {
			try {
				ConnectionManager cm=new ConnectionManager();
				Connection con=ConnectionManager.getConnection();
				System.out.println("Enter the studentID");
				String studentID=sc.nextLine();
				String sql="delete from studentdetails where studentID=?";
				PreparedStatement st=con.prepareStatement(sql); 
				st.setString(1, studentID);
				
				int status=st.executeUpdate();
				if(status>0) {
					System.out.println("-----Student details deleted successfully-----");
					con.close();
				}
				else {
					System.out.println("---Student details does not exit----");
					
				}
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
		@SuppressWarnings("unused")
		public void updatestudentdeatils(Student stud) throws Exception { 
		
				ConnectionManager cm=new ConnectionManager();
				Connection con=ConnectionManager.getConnection();
				System.out.println("Enter the studentFName");
				String studentFName=sc.nextLine();
				System.out.println("Enter the studentLName");
				String studentLName=sc.nextLine();
				System.out.println("Enter the studentID");
				String studentID=sc.nextLine();
				System.out.println("Enter the rollNo");
				String rollNo=sc.nextLine();
				System.out.println("Enter the email");
				String email=sc.nextLine();
				System.out.println("Enter the studentpassword");
				String studentpassword=sc.nextLine();
				System.out.println("Enter the studentClasse");
				String studentClasse=sc.nextLine();
				System.out.println("Enter the old id ");
				String oldstudentid=sc.next();
				sc.close();
				String sql="UPDATE studentdetails SET studentFName=?,studentLName=?,studentID=?,rollNo=?,email=?,studentpassword=?,studentClasse=? WHERE studentid=? ";
				PreparedStatement st=con.prepareStatement(sql); 							
				st.setString(1, studentFName);
				st.setString(2, studentLName);
				st.setString(3, studentID);
				st.setString(4, rollNo);
				st.setString(5, email);
				st.setString(6, studentpassword);
				st.setString(7, studentClasse);
				st.setString(8, oldstudentid);  // this one for old id 
							
			int rowupdate=st.executeUpdate();
			if(rowupdate!=0) {
				
				System.out.println("-----Student details updated successfully-----");
				
				con.close();
				
			}
			else {
				System.out.println("---Student details does not exit----");
				
			}
			}
				
	@SuppressWarnings("unused")
	public boolean displaystudentdeatils(){
		try {
			ConnectionManager cm=new ConnectionManager();
			Connection con=ConnectionManager.getConnection();
			System.out.println("-----Student details view-----");
			String sql="select studentFName,studentLName,rollNo,email,studentpassword,studentClasse,studentID \n"
					+ " from studentdetails \n"
					+"Order by studentID";
			PreparedStatement st=con.prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next()) 
			{
				String studentFName=rs.getString("studentFName");
				String studentLName=rs.getString("studentLName");
				String studentID=rs.getString("studentID");
				String rollNo=rs.getString("rollNo");
				String email=rs.getString("email");
				String studentpassword=rs.getString("studentpassword");
				String studentClasse=rs.getString("studentClasse");	
				System.out.println("studentFName="+studentFName+"\t\t"+"studentLName="+studentLName+"\t\t"+"studentID="+studentID+"\t\t"
						+"rollNo="+rollNo+"\t\t"+"email="+email+"\t\t"+"studentpassword="+studentpassword+"\t\t"+"studentClasse="+studentClasse);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return true;
	}
}