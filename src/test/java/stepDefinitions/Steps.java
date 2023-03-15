package stepDefinitions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import pageObjects.SearchPage;

public class Steps {
	
	public WebDriver driver;
	public SearchPage sp;

	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized");
		
		driver = new ChromeDriver(options);
		sp = new SearchPage(driver);
		
		
		
	}

	@Given("User opens url {string}")
	public void user_opens_url(String string) {
		driver.get(string);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	   
	}

	@When("User want to search for tutorials as {string} in the search bar")
	public void user_want_to_search_for_tutorials_as_in_the_search_bar(String string) throws InterruptedException {
		
		
		sp.searchTutorial(string);
		Thread.sleep(2000);
	   
	}
	@Then("user see a list of tutorials")
	public void user_see_a_list_of_tutorials() {
	    
	}
	
	@When("suggestion contians as {string}")
	public void suggestion_contians_as(String string) {
	    
	}

	@Then("User click on suggested tutorial")
	public void user_click_on_suggested_tutorial() throws InterruptedException {
		sp.clickSearchBtn();
	    Thread.sleep(1000);
	}

	@Then("user does not see any suggestion")
	public void user_does_not_see_any_suggestion() {
	    
	}

	
	
	
	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}
	
	
	

}
