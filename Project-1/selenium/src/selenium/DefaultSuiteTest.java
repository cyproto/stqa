package selenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class DefaultSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void a() throws Exception {
	Random r = new Random();
	String a = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
	int len = a.length();
	String repo = "";
	for(int i = 0;i<10;i++){
		    repo = repo + a.charAt(r.nextInt(len));
	}
	repo = repo.toLowerCase();
    driver.get("https://github.com/");
    driver.manage().window().setSize(new Dimension(1024, 736));
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("login_field")).click();
    driver.findElement(By.id("login_field")).sendKeys("seleniumtest-123");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("");
    driver.findElement(By.name("commit")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".Header-link > .dropdown-caret:nth-child(2)")).click();
    driver.findElement(By.linkText("New repository")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("repository_name")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("repository_name")).sendKeys(repo);
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".first-in-line")).click();
    driver.findElement(By.linkText("creating a new file")).click();
    driver.findElement(By.name("filename")).click();
    driver.findElement(By.name("filename")).sendKeys("hello.py");
    driver.findElement(By.cssSelector(".CodeMirror-line")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".CodeMirror-code"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '<div style=\"position: relative;\"><div class=\"CodeMirror-gutter-wrapper\" contenteditable=\"false\" style=\"left: -53px;\"><div class=\"CodeMirror-linenumber CodeMirror-gutter-elt\" style=\"left: 0px; width: 21px;\">1</div></div><pre class=\" CodeMirror-line \" role=\"presentation\"><span role=\"presentation\" style=\"padding-right: 0.1px;\">print(\"hello\")</span></pre></div>'}", element);
    }
    driver.findElement(By.id("commit-summary-input")).click();
    driver.findElement(By.id("commit-summary-input")).sendKeys("Create hello.py");
    Thread.sleep(2000);
    driver.findElement(By.id("submit-file")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText(repo)).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("hello.py")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Settings")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".Box-row:nth-child(4) > .details-reset > .btn")).click();
    driver.findElement(By.cssSelector("p:nth-child(4) > .form-control")).click();
    driver.findElement(By.cssSelector("p:nth-child(4) > .form-control")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("p:nth-child(4) > .form-control")).sendKeys(repo);
    driver.findElement(By.cssSelector("p:nth-child(4) > .form-control")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".Header-item:nth-child(7)")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".dropdown-signout")).click();
  }
}
