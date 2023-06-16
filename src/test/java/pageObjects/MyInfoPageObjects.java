package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyInfoPageObjects {
	
	@FindBy (xpath = "//span[text()='My Info']")
	public static WebElement myInfoTab;
	
	@FindBy (xpath="//input[@name='firstName']")
	public static WebElement firstName;
	
	@FindBy (xpath="//input[@name='middleName']")
	public static WebElement middleName;
	
	@FindBy (xpath="//input[@name='lastName']")
	public static WebElement lastName;
	
	@FindBy (xpath="//label[text()='Nickname']/parent::div/following-sibling::div/descendant::input")
	public static WebElement nickName;
	
	@FindBy (xpath="//label[text()='Employee Id']/parent::div/following-sibling::div/descendant::input")
	public static WebElement empId;
	
	@FindBy (xpath="//label[text()='Other Id']/parent::div/following-sibling::div/descendant::input")
	public static WebElement orderId;
	
	
	

}
