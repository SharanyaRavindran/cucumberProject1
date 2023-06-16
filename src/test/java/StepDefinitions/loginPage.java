package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPage {
	WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver, 10);

	@Given("user is on the login page")
	public void launchPage() throws Exception{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16023\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
	}

	@When("user enters valid username and password")
	public void enterVaidData() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
	@And("user clicks login button")
	public void clickLoginBtn() {
		driver.findElement(By.xpath("//button")).click();
	}
	@Then("user is navigated to the home page")
	public void homePageCheck() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='oxd-userdropdown-name']")));
		if(driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed()) {
		System.out.println("Test Case is passed");
		}
	}
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
}
