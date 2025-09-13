package Controller;

import java.util.Scanner;

import Dao.CustomerCurd;
import Dto.CustomerDetails;

public class CustomerMain
{
	public static void main(String[] args) throws Exception
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("*****WEL-COME TO THE BANK******");
      System.out.println("  choose the required option");
      System.out.println("1.Save Cutomer Details\n2.Update Customer Details Based on Account no\n3.Delete Customer Details Based on Account no\n4.Display the Customer Details Based on Account no");
    
      CustomerCurd curd=new CustomerCurd();
      curd.createTable();
      CustomerDetails customerdetails=new CustomerDetails();
      
      int n=sc.nextInt();
      
      switch(n)
      {
            case 1:
            	System.out.println("Enter the FirstName");
            	customerdetails.setFirstname(sc.next());
            	System.out.println("Enter the LastName");
            	customerdetails.setLastname(sc.next());
            	System.out.println("Enter the Mail");
            	customerdetails.setMail(sc.next());
            	System.out.println("Enter the PhoneNumber");
            	customerdetails.setPhoneno(sc.nextLong());
            	System.out.println("Enter the FatherName");
            	customerdetails.setFathername(sc.next());
            	System.out.println("Enter the AccountNO");
            	customerdetails.setAccountno(sc.nextInt());
            	System.out.println("Enter the Branch");
            	customerdetails.setBranch(sc.next());
            	curd.saveCustomerDetails(customerdetails);
            	break;
            case 2:
                	System.out.println("Enter updated FirstName");
                	customerdetails.setFirstname(sc.next());
                	System.out.println("Enter Updated LastName");
                	customerdetails.setLastname(sc.next());
                	System.out.println("Enter Updated Mail");
                	customerdetails.setMail(sc.next());
                	System.out.println("Enter updated PhoneNumber");
                	customerdetails.setPhoneno(sc.nextLong());
                	System.out.println("Enter updated FatherName");
                	customerdetails.setFathername(sc.next());
                	System.out.println("Enter updated Branch");
                	customerdetails.setBranch(sc.next());
                	System.out.println("Enter the AccountNO");
                	customerdetails.setAccountno(sc.nextInt());
                	curd.updateCustomerDetailsBasedOnAccountNO(customerdetails);
   
            	break;
            case 3:
            	    System.out.println("Enter The Account NO");
            	    customerdetails.setAccountno(sc.nextInt());
            	    curd.deleteCustomerDetailsBasedOnAccountNo(customerdetails);
         
            	break;
            case 4:
            	System.out.println("Enter The Account NO");
        	    customerdetails.setAccountno(sc.nextInt());
        	    curd.fetchCustomerDetailsOnAccountNo(customerdetails);
            	break;
            default:
            	System.err.println("Invalid Input");
            	
    	  
      }
      
	}
      
	
}
