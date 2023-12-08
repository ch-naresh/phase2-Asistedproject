package testScenario1;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test(priority='1', groups= {"smoke", "functional", "regression"})
	public void openapp() {
		System.out.println("open the browser and open URL");
	}
	@Test(priority='2', groups= {"functional"})
	public void loginSample1() {
		System.out.println("Login Successfully..");
	}
	@Test(priority='3', groups= {"regression"})
	public void loginWithInvaliddata() {
		System.out.println("Login Failed..");
	}
	@Test(priority='4', groups= {"regression"})
	public void loginWithWrongPassword() {
		System.out.println("Wrong password");
	}

}
