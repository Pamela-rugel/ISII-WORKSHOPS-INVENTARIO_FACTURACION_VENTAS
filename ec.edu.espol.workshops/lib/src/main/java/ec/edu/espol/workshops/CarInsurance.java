package ec.edu.espol.workshops;

import java.util.Scanner;

/**
 * Class CarInsurance.
 * @author Dennisse Aguirre, Pamela Rugel, Alejandra Quimi
 *
 */

public class CarInsurance {
	
	public static void main (String [ ] args) {
		
				String age;
				char sex;
				String maritalStatus;
				String validLicense;
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
				int basePremium = 500;	
				if (Integer.parseInt(age) < 80 && Integer.parseInt(age) >= 18 && validLicense.equals("true")) {
					if (sex == 'M' && !maritalStatus.equals("true") && Integer.parseInt(age) < 25) {
						basePremium += 1500;
					}
					
					if (maritalStatus.equals("true") && Integer.parseInt(age) > 30 && Integer.parseInt(age) < 60) {
						basePremium -= 50;
					}
					if (!maritalStatus.equals("true") && sex == 'F' &&  Integer.parseInt(age) > 60) {
						basePremium -= 50;
					    }
					if (sex == 'F' || maritalStatus.equals("true")) {
						basePremium -= 200;
					}
					if (Integer.parseInt(age) >= 45 && Integer.parseInt(age) < 65) {
						basePremium -= 100;
					}
				}else {
					basePremium=-1;
				}
				System.out.println("");
		        System.out.println("Premiunm Car Insurance:");
		        System.out.println(""+basePremium);	
	}
	
	private static boolean isInteger(String text) {
	    try {
	      Integer.parseInt(text);
	      return true;
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
	
	
	

}

