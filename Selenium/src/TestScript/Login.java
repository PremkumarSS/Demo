package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pom.Pom2;

public class Login extends Generic{
public Login(WebDriver D) {
		super(D);
		// TODO Auto-generated constructor stub
	}

@Test
public void validLogin() throws InterruptedException
{
Pom2 p=new Pom2(D);
p.usrTex("premkumar.mbl(@gmail.com");
Thread.sleep(2000);
p.pwdTex("Premkumar@123");
Thread.sleep(2000);
p.logtb();

}
















































































}
