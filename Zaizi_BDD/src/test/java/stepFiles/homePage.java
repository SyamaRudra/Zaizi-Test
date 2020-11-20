package stepFiles;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class homePage {

	public class Login {
		WebDriver driver;
		@Before
	public void setUp() {
			System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Software\\WebDrivers\\chromedriver.exe");
			this.driver = new ChromeDriver();
			this.driver.manage().window().maximize();
			this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}
			@After
		public void tearDown() {
			this.driver.manage().deleteAllCookies();
			this.driver.quit();
			this.driver = null;
		}
			@Given("user navigates to Zaizi website")
			public void user_navigates_to_zaizi_website()throws Throwable {
				driver.get("https://www.stackoverflow.com");
			}

			@And("user click search field and enter digital in the search field")
			public void user_click_search_field_and_enter_digital_in_the_search_field() throws Throwable {
			   driver.findElement(By.className("zaizi-search-field")).sendKeys("digital");
			}

			@When("user clicks on Putting Digital in your DNA on search results screen")
			public void user_clicks_on_putting_digital_in_your_dna_on_search_results_screen()throws Throwable {
			  driver.findElement(By.xpath("//a[contains(text(),'Putting Digital in Your DNA')]")).click();
			 }

			@Then("verify Putting digital in your DNA ttile displaying")
			public void verify_putting_digital_in_your_dna_ttile_displaying() throws Throwable {
				driver.findElement(By.xpath("//a[contains(text(),'Putting Digital in Your DNA')]")).isDisplayed();
				driver.findElement(By.xpath("//a[contains(text(),'Putting Digital in Your DNA')]")).getText();
				System.out.println("Successfully validated the Text Message");
				System.out.println("Test Completed");
				
			}
	}
}

