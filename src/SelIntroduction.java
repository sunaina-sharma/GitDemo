import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,driver,chrome","C:\\Users\\Sunaina\\OneDrive\\Documents\\chrome-headless-shell-win64.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
	driver.quit();

	}

}
