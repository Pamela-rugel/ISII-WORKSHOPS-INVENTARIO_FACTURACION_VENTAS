package ec.edu.espol.workshops;
import java.util.Scanner;

public class main {
	
	public static void main (String [ ] args) {
		
		///CarInsurance test1 = new CarInsurance(20, 'M', false,true);
		//System.out.println(test1.calcularBase());
		String edad;
		char sexo;
		boolean maritalStatus;
		boolean validLicense;
		Scanner sn=new Scanner(System.in);
		System.out.println("Ingrese edad:");
		edad=sn.next();
		CarInsurance.validarEdad(edad);
		System.out.println("Ingrese sexo M/F:");
		sexo=sn.next().charAt(0);
		System.out.println("Está casado? true/false:");
		maritalStatus=sn.nextBoolean();
		System.out.println("Tiene licencia de conducir? true/false:");
		validLicense=sn.nextBoolean();
		CarInsurance test1 = new CarInsurance(Integer.parseInt(edad), sexo, maritalStatus,validLicense);
		System.out.println(test1);
		System.out.println(test1.calcularBase());

		
		
		



	}
}
