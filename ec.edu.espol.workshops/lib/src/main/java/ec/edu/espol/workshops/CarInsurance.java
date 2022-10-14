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
	
	
	
}
