package TestNG_Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Project_Two {

	@Test
	public void init() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// add category
		WebElement typebox = driver.findElement(By.name("categorydata"));
		WebElement add = driver.findElement(By.xpath("//*[@id=\"extra\"]/input[2]"));
		typebox.sendKeys("New_item_MR_chapai");
		add.click();

		String Actualurl = driver.getCurrentUrl();
		String Expecteurl = "https://techfios.com/test/101/todo.php";

		if (Actualurl.equals(Expecteurl)) {
			System.out.println("The category you want to add already exists");
		} else {
			System.out.println("The Actual page url and Expected page url is not matching");
			System.out.println("Actual page url is :" + Actualurl);
			System.out.println("Actual page url is :" + Expecteurl);

		}

		driver.close();

	}

}
