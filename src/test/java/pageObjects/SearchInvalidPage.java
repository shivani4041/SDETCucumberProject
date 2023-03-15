package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchInvalidPage {
public WebDriver ldriver;
	
	public SearchInvalidPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(css="#search2")
	WebElement searchBar;
	
	@FindBy(css="#learntocode_searchbtn")
	WebElement searchBtn;
	
	
	public void searchTutorial(String search)
	{
		
		searchBar.clear();
		searchBar.sendKeys(search);
		
	}
	
	public void clickSearchBtn()
	{
		searchBtn.click();
	}

}
