package test;

import org.testng.annotations.Test;

import pageobject.LoginPage;
import utilities.Base;

public class LoginTest extends RegisterTest {
  @Test(priority=19)
  public void login() throws InterruptedException {
	  LoginPage obj1=new LoginPage(driver);
	  obj1.loginDetails();
  }
  @Test(priority=20)
  public void login2() throws InterruptedException {
	  LoginPage obj1=new LoginPage(driver);
	  obj1.loginDetails();
  }
}
