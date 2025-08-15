
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VisibilityOFElementScrollDown {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/");
	
	JavascriptExecutor js =  (JavascriptExecutor) driver;
	Thread.sleep(3000);
    WebElement element = driver.findElement(By.linkText("Loan Calculator"));
    js.executeScript("arguments[0].scrollIntoView();", element);
    Thread.sleep(3000);
    System.out.println(driver.getCurrentUrl());
    driver.quit();

	}

}
