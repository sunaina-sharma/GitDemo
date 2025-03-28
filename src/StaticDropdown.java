import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,driver,chrome","C:\\Users\\Sunaina\\OneDrive\\Documents\\chrome-headless-shell-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with select tag
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(2 );
       System.out.println( dropdown.getFirstSelectedOption().getText());
	   dropdown.selectByContainsVisibleText("USD");
	   System.out.println( dropdown.getFirstSelectedOption().getText());
	   dropdown.selectByValue("AED");
	   System.out.println( dropdown.getFirstSelectedOption().getText());
	}

}
