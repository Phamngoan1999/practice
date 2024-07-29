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
	  System.out.print("-----------Test first-----------");
	  driver.get(baseUrl);
	  driver.manage().window().maximize();
	  String title = driver.getTitle();
	  Assert.assertEquals("Your store. Login", title);
	  System.out.print("-----------Test end-----------");
	  driver.close();
  }
  
}
