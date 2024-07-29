package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic_01 {
	
  @Test
  public void f() {
	  String  projectPath = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver","./browerDriver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  String baseUrl = "https://admin-demo.nopcommerce.com/login";
	  System.out.print("-----------Test First-----------");
	  driver.get(baseUrl);
	  String title = driver.getTitle();
	  System.out.println(title);
	  System.out.print("-----------Test End-----------");
	  Assert.assertEquals("Your store. Login", title);
  }
  
}
