package Pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 
{
@FindBy(name="username")
private WebElement user_btn;
@FindBy(name="password")
private WebElement pss_btn;
public Pom2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement user()
{
	return user_btn;
}
public WebElement pass()
{
	return pss_btn;
}
}
