package ec.edu.espol.workshops;

public class CarInsurance {

	private int age;
	private char sex;
	private boolean marital_status;
	private boolean valid_license;
	private double base_premium = 500;
	
	public CarInsurance(int age, char sex, boolean marital_status, boolean valid_license) {
		
			this.age = age;
			this.sex = sex;
			this.marital_status = marital_status;
			this.valid_license = valid_license;
		
	}


	public double calcularBase() {
		if(this.age<80 && this.valid_license) {
			if (this.sex=='M' && !this.marital_status && this.age<25) {
				this.base_premium+=1500;
			}if(this.sex=='F' || this.marital_status){
				this.base_premium-=200;
			}if(this.age>=45 && this.age<65){
				this.base_premium-=100;
			}
			return this.base_premium;
			
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

	public boolean isMarital_status() {
		return marital_status;
	}

	public void setMarital_status(boolean marital_status) {
		this.marital_status = marital_status;
	}

	public boolean isValid_license() {
		return valid_license;
	}

	public void setValid_license(boolean valid_license) {
		this.valid_license = valid_license;
	}

	public double getBase_premium() {
		return base_premium;
	}

	public void setBase_premium(double base_premium) {
		this.base_premium = base_premium;
	}
	
	public int validarEdad(String variable) {
		try {
	    	 Integer.parseInt(variable);
	    	 return 0;    	 	    	
	    }catch(NumberFormatException ex) {
	   	    return -1;
	    }
		
	}
	
		
}


