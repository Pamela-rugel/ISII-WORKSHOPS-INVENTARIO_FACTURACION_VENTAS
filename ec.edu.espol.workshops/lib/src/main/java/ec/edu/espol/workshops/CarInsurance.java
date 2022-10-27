package ec.edu.espol.workshops;

/**

 * Class CarInsurance.

 * @author Alejandra Quimi 
 *
 */

public class CarInsurance {
	private int age; 
	private char sex;
	private boolean maritalStatus;
	private boolean validLicense;
	private double basePremium = 500;	
	/**
	 
	 * Constructor for car insurance class.

	 * @param age represent age
	 * @param sex represent sex
	 * @param maritalStatus represent maritalStatus
	 * @param validLicense represent validLicense
	 * @throws Exception when is null
	 */
	
	public CarInsurance(int age, char sex, boolean maritalStatus, boolean validLicense) {
		
		
		this.age=age;
		

		this.sex = sex;
		this.maritalStatus = maritalStatus;
		this.validLicense = validLicense;
		
	}

	/**

	 * Method to calculate the base and return an double.

	 * @return Double
	 */
	
	public double calcularBase() {
		if (this.age < 80 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
		
		return -1;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean ismaritalStatus() {
		return maritalStatus;
	}

	public void setmaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public boolean isvalidLicense() {
		return validLicense;
	}

	public void setvalidLicense(boolean validLicense) {
		this.validLicense = validLicense;
	}

	public double getbasePremium() {
		return basePremium;
	}
	
	public void setbasePremium(double basePremium) {
		this.basePremium = basePremium;
	}
	
	/**

	 * Method to validate age.

	 * @param variable represent variable
	 * @return Integer
	 * @throws Exception when variable is null
	 */
	
	public static int validarEdad(String variable) {
		try {
	    	 
	    	 return Integer.parseInt(variable); 	 	    	
	    } catch (NumberFormatException ex) {
	   	    return -1;
	    }
		
	}
	
		
}


