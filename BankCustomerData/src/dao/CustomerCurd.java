package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Dto.CustomerDetails;

public class CustomerCurd 
{
	CustomerDetails customerdetails=new CustomerDetails();
	
   public Connection createTable() throws ClassNotFoundException, SQLException
   {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankcustomerdata?createDatabaseIfNotExist=true&user=root&password=12345");;
	   Statement ste=con.createStatement();
	   ste.execute("create table if not exists customerdata(firstname  Varchar(45),lastname Varchar(40) ,mail Varchar(25),phoneno bigint,fathername Varchar(15),accountno int primary key,branch Varchar(25))");
	   return con;
   }
   public void saveCustomerDetails(	CustomerDetails customerdetails) throws ClassNotFoundException, SQLException
      {
	   Connection con=createTable();
	   PreparedStatement pste= con.prepareStatement("insert into customerdata values(?,?,?,?,?,?,?)");
	   pste.setString(1,customerdetails.getFirstname() );
	   pste.setString(2, customerdetails.getLastname());
	   pste.setString(3, customerdetails.getMail());
	   pste.setLong(4,customerdetails.getPhoneno());
	   pste.setString(5, customerdetails.getFathername());
	   pste.setInt(6, customerdetails.getAccountno());
	   pste.setString(7, customerdetails.getBranch());
	   int inserted=pste.executeUpdate();
	   System.out.println(inserted+" row inserted");
	   }
   public void updateCustomerDetailsBasedOnAccountNO(CustomerDetails customerdetails) throws ClassNotFoundException, SQLException
       {
	    Connection con=createTable();
	    PreparedStatement pste=con.prepareStatement("update customerdata set firstname=?,lastname=?,mail=?,phoneno=?,fathername=?,branch=? where accountno=?");
	    pste.setString(1, customerdetails.getFirstname());
	    pste.setString(2, customerdetails.getLastname());
	    pste.setString(3, customerdetails.getMail());
	    pste.setLong(4, customerdetails.getPhoneno());
	    pste.setString(5, customerdetails.getFathername());
	    pste.setString(6, customerdetails.getBranch());
	    pste.setInt(7, customerdetails.getAccountno());
	    pste.execute();
	    System.out.println("Updated  record Successfully");
	   
       }
   public void deleteCustomerDetailsBasedOnAccountNo(CustomerDetails customerdetails) throws Exception
       {
	    Connection con=createTable();
	    PreparedStatement pste=con.prepareStatement("delete from customerdata where accountno=?");
	    pste.setLong(1, customerdetails.getAccountno());
	    pste.execute();
	    System.out.println("Deleted record successfully");
       }
   public void fetchCustomerDetailsOnAccountNo(CustomerDetails customerdetails) throws Exception, Exception
       {
	     Connection con=createTable();
	     PreparedStatement pste=con.prepareStatement("select * from customerdata where accountno=?");
	     pste.setLong(1, customerdetails.getAccountno());
	     ResultSet res=pste.executeQuery();
	     if(res.next())
	     {
	    	 System.out.println(res.getString(1));
	    	 System.out.println(res.getString(2));
	    	 System.out.println(res.getString(3));
	    	 System.out.println(res.getString(4));
	    	 System.out.println(res.getString(5));
	    	 System.out.println(res.getString(7));
	    	 
	     }
	     else
	     {
	    	 System.out.println("No record found");
	     }
	   
       }
   
}