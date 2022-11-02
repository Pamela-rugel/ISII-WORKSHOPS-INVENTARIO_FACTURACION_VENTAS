package ec.edu.espol.workshops;
import ec.edu.espol.workshops.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepsDefs {

 private int actualAnswer;
 public CarInsurance carInsurance= new CarInsurance (23, 'F', false, true);
 
 //1
 
 @Given("The customer has 50 years old, is single and female, and her license is valid.")
 public void customer_has_50years() {
	 carInsurance.setAge(50);
	 carInsurance.setSex('F');
	 carInsurance.setmaritalStatus(false);
	 carInsurance.setvalidLicense(true);
	 
 }
 
 @When("We Calculate the base premium car insurance")
 public void calculate_baseprenium_() {
 actualAnswer = (int) carInsurance.calcularBase();
 }
 
 @Then("I should be told ")
 public void i_should_be_told() {
 assertEquals(200, actualAnswer);
 }
 
 //2
 
 @Given("The customer has 86 years old, is single and female, and her license is valid.")
 public void customer_has_86years() {
	 carInsurance.setAge(86);
	 
 }
 
 @When("The customer gives her age")
 public void calculatebaseprenium_insurance() {
 actualAnswer = carInsurance.validarEdad(String.valueOf(carInsurance.getAge()));
 }
 
 @Then("I should be told ")
 public void should_be_told() {
 assertEquals(-1, actualAnswer);
 }
 
 //3
 
 @Given("The customer has 28 years old, is single and male, and his license is valid.")
 public void customer_has_28years() {
	 carInsurance.setAge(28);
	 carInsurance.setSex('M');
	 carInsurance.setmaritalStatus(false);
	 carInsurance.setvalidLicense(true);
 }
 
 @When("We Calculate the base premium car insurance")
 public void calculate_baseprenium_insurance() {
 actualAnswer = (int) carInsurance.calcularBase();
 }
 @Then("I should be told ")
 public void i_shouldbe_told() {
 assertEquals(300, actualAnswer);
 }
 
 
 
 
 
 
 
 
 
 //3
}