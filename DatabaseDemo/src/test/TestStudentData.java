package test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestStudentData {

	public static void main(String[] args) {
		
		Student s = new Student();
		
//		s.setEmail("hamaguri@hama.com");
//		s.setName("Hamaguri");
//		s.setStudent_id(290);
//		s.setPhone(7898978970L);
		
		int response = 999999;
		
//		try {
//			response = s.addStudent();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			ResultSet res = s.getStudent();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(response);
	}
}
