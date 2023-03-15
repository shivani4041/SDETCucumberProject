package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver ldriver;
	
	public SearchPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(css="#search2")
	WebElement searchBar;
	
	@FindBy(xpath="//span[text()='JAVA Tutorial']")
	WebElement searchSuggestion;
	
	@FindBy(css="#learntocode_searchbtn")
	WebElement searchBtn;
	
	
	public void searchTutorial(String search)
	{
		
		searchBar.clear();
		searchBar.sendKeys(search);
		
	}
	
	public void clickSearchBtn()
	{
		searchSuggestion.click();
	}
	
	

}
