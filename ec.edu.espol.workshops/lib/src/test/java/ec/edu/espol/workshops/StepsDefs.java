package ec.edu.espol.workshops;
import ec.edu.espol.workshops.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepsDefs {
//
 private int actualAnswer;
 public CarInsurance carInsurance= new CarInsurance (23, 'F', false, true);
 
 //1
 
 @Given("The customer has 50 years old, is single and female, and her license is valid")
 public void customer_has_50years() {
	 carInsurance.setAge(50);
	 carInsurance.setSex('F');
	 carInsurance.setmaritalStatus(false);
	 carInsurance.setvalidLicense(true);
	 
 }
 
 @When("We Calculate the base premium car insurance")
 public void calculate_base_premium_1() {
	 actualAnswer = (int) carInsurance.calcularBase();
 }
 
 @Then("I should be told 200")
 public void i_should_be_told_1() {
	 assertEquals(200, actualAnswer);
 }

 //2
 
 @Given("The customer has 86 years old, is single and female, and her license is valid")
 public void customer_has_86years() {
	 carInsurance.setAge(86);
	 carInsurance.setSex('F');
	 carInsurance.setmaritalStatus(false);
	 carInsurance.setvalidLicense(true);
	 
 }
 
 @When("The customer gives her age")
 public void calculate_base_premium_2() {
	 actualAnswer = (int) carInsurance.calcularBase();
 }
 
 @Then("I should be told -1")
 public void  i_should_be_told_2() {
	 assertEquals(-1, actualAnswer);
 }
 
 //3
 
 @Given("The customer has 28 years old, is single and male, and his license is valid")
 public void customer_has_28years() {
	 carInsurance.setAge(28);
	 carInsurance.setSex('M');
	 carInsurance.setmaritalStatus(false);
	 carInsurance.setvalidLicense(true);
 }
 
 @When("The customer Calculates the premium car insurance")
 public void calculate_base_premium_3() {
	 actualAnswer = (int) carInsurance.calcularBase();
 }
 
 @Then("I should be told 500")
 public void  i_should_be_told_3() {
	 assertEquals(500, actualAnswer);
 }
 
 //4
 
 @Given("The customer has \"{int}\" years old, is married and female, and her license is valid")
 public void customer_has_45_65_years(int age) {
	 carInsurance.setAge(age);
	 carInsurance.setSex('M');
	 carInsurance.setmaritalStatus(true);
	 carInsurance.setvalidLicense(true);
 }
 
 @When("The customer calculates the premium car insurance")
 public void calculate_base_premium_4() {
	 actualAnswer = (int) carInsurance.calcularBase();
 }
 
 @Then("I must be told \"{int}\"")
 public void  i_should_be_told_4(int expected) {
	 assertEquals(expected,actualAnswer);
 }

}