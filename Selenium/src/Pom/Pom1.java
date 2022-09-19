package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1{
	@FindBy(id="email")
	private WebElement us;
	
	@FindBy()
	private WebElement pwd;
	
	@FindBy()
	private WebElement log;
	
	public Pom1(WebDriver D)
	{PageFactory.initElements(D, this);
	
	}
	public void usrTex(String p)
	{us.sendKeys(p);
	}
	
	public void pwdTex(String pw)
	{pwd.sendKeys(pw);}
	
	public void logtb()
	{log.click();
	
	}
	
}
