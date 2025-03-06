import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,driver,chrome","C:\\Users\\Sunaina\\OneDrive\\Documents\\chrome-headless-shell-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        //driver.findElement(By.id("hrefIncAdt")).click();
        for(int i=1;i<5;i++) 
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
        
        driver.findElement(By.xpath("(//input[@id='btnclosepaxoption'])[1]"));
	}

}
