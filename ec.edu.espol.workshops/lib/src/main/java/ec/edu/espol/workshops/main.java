package ec.edu.espol.workshops;
import java.util.Scanner;
import java.util.*;

public class main {
	
	public static void main (String [ ] args) {
		
	
		///CarInsurance test1 = new CarInsurance(20, 'M', false,true);
				//System.out.println(test1.calcularBase());
				String age;
				char sex;
				String maritalStatus;
				String validLicense;
				boolean marital=false;
				boolean license=false;
				Scanner sn=new Scanner(System.in);
				System.out.println("Enter age:\n");
				age=sn.nextLine();
				while(isInteger(age)==false || Integer.parseInt(age)<0) {
					System.out.println("Invalid age, please re-enter your age:\n");
					age=sn.nextLine();
					
				}
				
				System.out.println("Enter gender M/F:\n");
				sex=sn.next().charAt(0);
				while(sex!='F'&& sex!='M') {
					System.out.println("Invalid gender, please re-enter your gender:\n");
					sex=sn.next().charAt(0);
					
				}
				
				sn.nextLine();
				System.out.println("Are you married? true/false:\n");
				maritalStatus=sn.nextLine();
				
				while(!maritalStatus.equals("true") && !maritalStatus.equals("false") ) {
					System.out.println("Invalid, Are you married? true/false:\n");
					maritalStatus=sn.nextLine();
					
				}
				
				System.out.println("Do you have a driver's license? true/false:\n");
				validLicense=sn.nextLine();
				
				while(!validLicense.equals("true") && !validLicense.equals("false") ) {
					System.out.println("Invalid, Do you have a driver's license? true/false:\n");
					validLicense=sn.nextLine();
					
				}
				if(validLicense.equals("true")) {
					license=true;
					
				}
				if(validLicense.equals("false")) {
					license=false;
					
				}
				
				if(maritalStatus.equals("true")) {
					marital=true;
					
				}
				if(maritalStatus.equals("false")) {
					marital=false;
					
				}
						
					
				CarInsurance test1 = new CarInsurance(Integer.parseInt(age), sex, marital,license);
				System.out.println(test1.calcularBase());
				
			
			
				
	}
	
	private static boolean isInteger(String text) {
		int v;
	    try {
	      v=Integer.parseInt(text);
	      return true;
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
	
	
	


	
}