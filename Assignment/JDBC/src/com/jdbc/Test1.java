package com.jdbc;
import java.sql.*;
import java.util.Scanner;
import java.sql.DriverManager;

public class Test1 {
     public static void main(String args[]){
        int ch=0;
        int id, sub1, sub2, sub3;
        String n;
        while(true){
        System.out.println("1 Insert record");
        System.out.println("2 Update record");
        System.out.println("3 Delete record ");
        System.out.println("4 Display Record");
        System.out.println("5 Display Particular Record");
        System.out.println("Enter your choice");
        Scanner sc =new Scanner(System.in);
        ch =sc.nextInt();
    	 try {
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("Driver Loaded");
			 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			// System.out.println("Connection to Database..");
			 
			
			 switch(ch){
			 case 1:
			 {   System.out.println("Enter Values");
			     id = sc.nextInt();
			     n=sc.next();
			     sub1=sc.nextInt();
			     sub2=sc.nextInt();
			     sub3=sc.nextInt();
				 PreparedStatement pstmt =conn.prepareStatement("insert into student values (?,?,?,?,?)");
				 pstmt.setInt(1, id);
				 pstmt.setString(2, n);
				 pstmt.setInt(3, sub1);
				 pstmt.setInt(4, sub2);
				 pstmt.setInt(5, sub3);
				 pstmt.executeUpdate();
				 break;
			 }
			 case 2:
			 {
				 System.out.println("Enter Rollno ");
				     id=sc.nextInt();
				     System.out.println("Enter Changes ");
				     n=sc.next();
				     sub1=sc.nextInt();
				     sub2=sc.nextInt();
				     sub3=sc.nextInt();
					 PreparedStatement pstmt =conn.prepareStatement("Update Student set name=?, subject1=?, subject2=?, subject3=?  where rollno=?");
					 pstmt.setString(1, n);
					 pstmt.setInt(2, sub1);
					 pstmt.setInt(3, sub2);
					 pstmt.setInt(4, sub3);
					 pstmt.setInt(5, id);
					 pstmt.executeUpdate();
					 break;
			 }
			 case 3:
			 {
				 System.out.println("Enter Roll Number");
				 id= sc.nextInt();
				 Statement stmt = conn.createStatement();
				 stmt.executeUpdate("Delete from Student where rollno="+id);
				 break;
			 }
			 case 4:{	
				Statement stmt = conn.createStatement(); 
			 ResultSet rs = stmt.executeQuery("Select * from Student");
			 while(rs.next()){
				 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getLong(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5));
			 }
			 }
			 case 5:{
				 System.out.println("Enter Roll Number ");
				 id =sc.nextInt();
				 PreparedStatement pstmt = conn.prepareStatement("Select  name=?, subject1=?, subject2=?, subject3=? from Student where rollno=?");
				 ResultSet rs =pstmt.executeQuery();
		        
			 }
			 default:{
				 
			 }
			 }
			 conn.close();
    	  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	
        }
       
     
}    
}
    	 
    	// try {
//    			Class.forName("com.mysql.jdbc.Driver");
//    			System.out.println("Driver Loaded...");
//    		    Connection conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","root");
//    		     System.out.println("Connected to Database.....");
	
     



