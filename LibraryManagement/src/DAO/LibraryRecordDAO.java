package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import Model.Libraryrecord;
import Utility.ConnectionManager;

public class LibraryRecordDAO {
	Libraryrecord library=new Libraryrecord();
	Scanner sc=new Scanner(System.in);
	
	@SuppressWarnings("unused")
		public void addLibraryRecord(Libraryrecord library) throws  Exception {
			
		    String StudentName=library.getStudentName();
			String studentID=library.getStudentID();
			String RollNo=library.getRollNo();
			String BookName=library.getBookName();
			String AthourName=library.getAthourName();
			String Edition=library.getEdition();
			String TakingDate=library.getTakingDate();
			String ReturnDate=library.getReturnDate();
			System.out.println("StudentName");
			ConnectionManager cm=new ConnectionManager();
			String sql="insert into libraryrecord(StudentName,studentID,RollNo,BookName,AthourName,Edition,TakingDate,ReturnDate)Values(?,?,?,?,?,?,?,?)";
			PreparedStatement st=ConnectionManager.getConnection().prepareStatement(sql);
			st.setString(1, StudentName);
			st.setString(2, studentID);
			st.setString(3, RollNo);
			st.setString(4, BookName);
			st.setString(5, AthourName);
			st.setString(6, Edition);
			st.setString(7, TakingDate);
			st.setString(8, ReturnDate);
			
			st.executeUpdate();
			ConnectionManager.getConnection().close();
		}
			@SuppressWarnings("unused")
			public void DeleteLibraryRecord() {
			try {
				ConnectionManager cm=new ConnectionManager();
				Connection con=ConnectionManager.getConnection();
				String studentID=sc.nextLine();
				String sql="delete from libraryrecord where studentID=?";
				PreparedStatement st=con.prepareStatement(sql); 
				st.setString(1, studentID);
				
				int status=st.executeUpdate();
				if(status>0) {
					System.out.println("-----library record deleted successfully-----");
					con.close();
				}
				else {
					System.out.println("---Library record does not exit----");
					con.close();
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		@SuppressWarnings("unused")
		public void updatesLibraryRecord(Libraryrecord library) throws Exception {
			
			ConnectionManager cm=new ConnectionManager();
			Connection con=ConnectionManager.getConnection();
			System.out.println("Enter the studentID");
			String studentID=sc.nextLine();
			System.out.println("Enter the studentName");
			String studentName=sc.nextLine();			
			System.out.println("Enter the rollNo");
			String rollNo=sc.nextLine();
			System.out.println("Enter the BookName");
			String BookName=sc.nextLine();
			System.out.println("Enter the AthourName");
			String AthourName=sc.nextLine();
			System.out.println("Enter the Edition");
			String Edition=sc.nextLine();
			System.out.println("Enter the TakingDate");
			String TakingDate=sc.nextLine();
			System.out.println("Enter the ReturnDate");
			String ReturnDate=sc.nextLine();
			System.out.println("Enter the old id");
			String olddstudentid=sc.next();
			sc.close();
			String sql="UPDATE libraryrecord SET studentName=?,studentID=?,rollNo=?,BookName=?,AthourName=?,Edition=?,TakingDate=?,ReturnDate=? WHERE studentID=?";
			PreparedStatement st=con.prepareStatement(sql); 							
			st.setString(1, studentID);
			st.setString(2, studentName);
			st.setString(3, rollNo);
			st.setString(4,BookName);
			st.setString(5, AthourName);
			st.setString(6, Edition);
			st.setString(7, TakingDate);
			st.setString(8, ReturnDate);
			st.setString(9, olddstudentid);  // this one for old id 
						
		int rowupdate=st.executeUpdate();
		System.out.println(rowupdate);
		if(rowupdate!=0) {
			System.out.println("-----Library record updated successfully-----");
			con.close();
		}
		else {
			System.out.println("---Library record does not exit----");
		}
		}


		@SuppressWarnings("unused")
		public void displayLibraryRecord() {
			try {
				ConnectionManager cm=new ConnectionManager();
				Connection con=ConnectionManager.getConnection();
				System.out.println("-----View Library Record-----");
				String sql="select StudentName,studentID,RollNo,BookName,AthourName,Edition,TakingDate,ReturnDate \n"
						+ "from libraryrecord \n"
						+"order by studentID ASC";
				PreparedStatement st=con.prepareStatement(sql);
				ResultSet rs=st.executeQuery();
				while(rs.next()) {
					String studentName=rs.getString("studentName");
					String studentID=rs.getString("studentID");
					String rollNo=rs.getString("rollNo");
					String BookName=rs.getString("BookName");
					String AthourName=rs.getString("AthourName");
					String Edition=rs.getString("Edition");
					String TakingDate=rs.getString("TakingDate");
					String ReturnDate=rs.getString("ReturnDate");
					System.out.println("studentName:"+studentName+"\t\t"+"studentID:"+studentID+"\t\t"+"RollNo:"+rollNo+"\t\t"+"BookName:"+BookName+
							"\t\t"+"AthourName:"+AthourName+"\t\t"+"Edition:"+Edition+"\t\t"+"TakingDate:"+TakingDate+"\t\t"+"ReturnDate:"+ReturnDate);
				}
			} catch(Exception e) {
				System.out.println(e);
			}
		}
}
