package Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation { ///create a validation class 

	public boolean Validationemail(String email) { //create a validation for email
		Pattern p=Pattern.compile("^[A-Za-z 0-9+_.]+@(.+)$");
		Matcher m=p.matcher(email);
		if(m.matches()) {
			return true;
		}
		else {
		return false;
		}
	}
	public boolean ValidPassword(String studentpassword) { //create a validation for password
		
		int PASSWORD_LENGTH=8;
		int charCount=0;
		int numCount=0;
		if(studentpassword.length()<PASSWORD_LENGTH)
			return false;
		for(int i=0;i<studentpassword.length();i++)
		{
			char ch=studentpassword.charAt(i);
			if(is_Numeric(ch)) numCount++;
			else if(is_Letter(ch))
			charCount++;
			else return false;
		}
		return(charCount>=2 && numCount>=2);
		
	}
	private boolean is_Numeric(char ch) {
		
		return (ch>='0' && ch<='9');
	}
	private boolean is_Letter(char ch) {
		ch=Character.toUpperCase(ch);
		
		return (ch>='A' && ch<='Z');
	}
	public boolean ValidTechPass(String teacherpassword) { //create a validation for teacher password
		int PASS_LENGTH=9;
		int charcount=0;
		int numCount=0;
		if(teacherpassword.length()<PASS_LENGTH)
			return false;
		for(int i=0;i<teacherpassword.length();i++) {
			char cha=teacherpassword.charAt(i);
			if(Numeric(cha)) numCount++;
			else if(Letter(cha)) charcount++;
			else
				return false;
		}
		return(charcount>=2 && numCount>=2);
	}
	private boolean Letter(char cha) {
		return (cha>='A' && cha<='Z');
	}
	private boolean Numeric(char cha) {
		return (cha>='0' && cha<='9');
	}
	public boolean ValidationEmailID(String techeremailID) {  //create a validation for email ID
		Pattern p=Pattern.compile("^[A-Za-z 0-9+_.]+@(.+)$");
		Matcher m=p.matcher(techeremailID);
		if(m.matches()) {
			return true;
		}
		else {
		return false;
		}
}
	public boolean ValidationName(String studentName) {  ////create a validation for name
		String regex="[a-zA-Z]*$";
		Pattern pat=Pattern.compile(regex);
		Matcher mat=pat.matcher(studentName);
		if(mat.matches()) {
			return true;
		}else {
		return false;
		}
	}
	public boolean ValidationRollno(String rollNo) {  //create a validation for roll no
		Pattern patt=Pattern.compile("^[0-9]*$");
		Matcher matt=patt.matcher(rollNo);
		if(matt.matches()) {
			return true;
		}else {
		return false;
		}
	}
	@SuppressWarnings("unused")
	public boolean ValidationID(String StudentID) { //create a validation for student ID
		String regex="[S]+[-][0-9]*$";
		Pattern patn=Pattern.compile(regex);
		if(Pattern.matches(regex, StudentID)) {
			return true;
		}else {
		return false;
		}
	}
	public boolean Validationrollno(String RollNo) {  //create a validation for Roll no
		Pattern patt=Pattern.compile("^[0-9]*$");
		Matcher matt=patt.matcher(RollNo);
		if(matt.matches()) {
			return true;
		}else {
		return false;
		}
	}
	
	public boolean ValidationEdition(String Edition) {  //create a validation for edition
		String regex="[0-9]+[th]*$";
		@SuppressWarnings("unused")
		Pattern prtn=Pattern.compile(regex);
		if(Pattern.matches(regex, Edition)) {
			return true;
		}else {
		return false;
		}
	}
	public boolean ValidationDate(String takingDate) { //create a validation for date
		String regex="[0-9]+[/]+[0-9]+[/]+[0-9]*$";
		@SuppressWarnings("unused")
		Pattern prtn=Pattern.compile(regex);
		if(Pattern.matches(regex, takingDate)) {
			return true;
		}else {
		return false;
		}
	}
	public boolean ValidationClass(String studentClasse) {
		String regex="[a-zA-Z0-9]*$";
		@SuppressWarnings("unused")
		Pattern prtn=Pattern.compile(regex);
		if(Pattern.matches(regex, studentClasse)) {
			return true;
		}else {
		return false;
		}
	}
}
