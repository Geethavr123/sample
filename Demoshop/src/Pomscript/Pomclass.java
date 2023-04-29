package Pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass 
{
@FindBy(id="email")
private WebElement user_text;
@FindBy(id="pass")
private WebElement pass_text;
@FindBy(name="login")
private WebElement login_btn;
public Pomclass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement username()
{
	return user_text;
}
public WebElement passwd()
{
	return pass_text;
}

public WebElement login()
{
	return login_btn;
}


}
