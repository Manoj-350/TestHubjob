import java.awt.Desktop.Action;
import java.awt.SecondaryLoop;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class Launch {

WebDriver driver;

@Test
public void launch() {
System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();







driver.get("http://www.demo.guru99.com/V4/");
WebElement username= driver.findElement(By.name("uid"));

WebElement password= driver.findElement(By.name("password"));

WebElement loginbtn = driver.findElement(By.name("btnLogin"));
/*driver.findElement(By.name("uid")).clear();
driver.findElement(By.name("uid")).sendKeys("mngr287263");
// Enter valid Password
driver.findElement(By.name("password")).clear();
driver.findElement(By.name("password")).sendKeys("qAhYjut");
// Click Login
driver.findElement(By.name("btnLogin")).click();

*/
username.clear();
username.sendKeys("mngr355656");
password.clear();
password.sendKeys("vAjahyv");
loginbtn.click();
driver.manage().window().maximize();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement tar= driver.findElement(By.xpath("//body/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));



Actions action=new Actions(driver);
action.moveToElement(tar).build().perform();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
tar.click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
WebElement tar2= driver.findElement(By.xpath("//a[contains(text(),'Flash Movie Demo')]"));


tar2.click();






//close browser
/*
  WebDriverWait wait=new WebDriverWait(driver, 20); WebElement
  guru99seleniumlink; guru99seleniumlink=
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
  "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"
 ))); guru99seleniumlink.click();
 */



/*
Set<String> winid = driver.getWindowHandles();
Iterator<String> iter = winid.iterator();
iter.next();
String tab = iter.next();
driver.switchTo().window(tab);
*/
System.out.println(driver.getTitle());

/*
  WebElement s1= driver.findElement(By.xpath(
  "//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[4]/div/div/div/div/div[1]/div/div/a/i"
  )); Select box=new Select(s1); box.selectByValue("abc");
 */

/*Actions action = new Actions(driver);

action.moveToElement(s1).click().perform();


Actions action12 = new Actions(driver);

action.dragAndDrop(s1, guru99seleniumlink);

*/


}
 @AfterTest
 public void teardown() {
	 driver.close();
	 driver.quit();
 }
}



