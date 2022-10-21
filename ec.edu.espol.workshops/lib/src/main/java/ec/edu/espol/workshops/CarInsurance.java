package ec.edu.espol.workshops;

/**
 * Esta clase define el objeto CarInsurance para el calculo de un seguro de un carro
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
	 * 
	 * @param age
	 * @param sex
	 * @param maritalStatus
	 * @param validLicense
	 */
	public CarInsurance(int age, char sex, boolean maritalStatus, boolean validLicense) {
		
			this.age = age;
			this.sex = sex;
			this.maritalStatus = maritalStatus;
			this.validLicense = validLicense;
		
	}

	/**
	 * 
	 * @return
	 */
	public double calcularBase() {
		if(this.age<80 && this.validLicense) {
			if (this.sex=='M' && !this.maritalStatus && this.age<25) {
				this.basePremium+=1500;
			}
			if(this.sex=='F' || this.maritalStatus){
				this.basePremium-=200;
			}
			if(this.age>=45 && this.age<65){
				this.basePremium-=100;
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
	 * 
	 * @param variable
	 * @return
	 */
	
	public int validarEdad(String variable) {
		try {
	    	 Integer.parseInt(variable);
	    	 return 0;    	 	    	
	    }catch(NumberFormatException ex) {
	   	    return -1;
	    }
		
	}
	
		
}


