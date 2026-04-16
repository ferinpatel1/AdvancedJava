package com.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {
	
	public static void insertStudent(Student s) {
		try {
			Connection conn = StudentUtil.createConnection();
			String sql = "insert into stu(fname,lname,email,mobile,address,gender) values (?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getAddress());
			pst.setString(6, s.getGender());
			
			pst.executeUpdate();
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Student> getAllStudent(){
		
		List<Student> list = new ArrayList<>();
		try {
			
			Connection conn = StudentUtil.createConnection();
			String sql="select * from stu";
			PreparedStatement pst =conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setFname(rs.getString("lname"));
				s.setFname(rs.getString("email"));
				s.setFname(rs.getString("mobile"));
				s.setFname(rs.getString("address"));
				s.setFname(rs.getString("gender"));
				list.add(s);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return  list;
	}

}
