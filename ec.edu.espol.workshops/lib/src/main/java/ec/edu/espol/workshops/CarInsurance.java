package ec.edu.espol.workshops;

import java.util.Scanner;

/**
 * Class CarInsurance.
 * @author Dennisse Aguirre, Pamela Rugel, Alejandra Quimi
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
			    }
			if (this.sex == 'F' || this.maritalStatus) {
				this.basePremium -= 200;
			}
			if (this.age >= 45 && this.age < 65) {
				this.basePremium -= 100;
			}
			return this.basePremium;
			
		}
		
<<<<<<< HEAD
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
=======
		
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
		if (this.age < 80 && this.age >= 18 && this.validLicense) {
			if (this.sex == 'M' && !this.maritalStatus && this.age < 25) {
				this.basePremium += 1500;
			}
			if (this.maritalStatus && this.age > 30 && this.age < 60) {
				basePremium -= 50;
			}
			if (!this.maritalStatus && sex == 'F' &&  this.age > 60) {
				basePremium -= 50;
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
>>>>>>> origin/main
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
	/**
	 * Method to validate age.
	 * @param variable represent variable
	 * @return Integer
	 * @throws Exception when variable is null
	 */
	
	public static int validarEdad(String variable) {
		try {
	    	 return Integer.parseInt(variable); 	 	    	
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

