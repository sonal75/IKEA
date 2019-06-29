package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestIKEA1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  
  public void setUp() throws Exception {
      System.setProperty("webdriver.chrome.driver","c:\\qa\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    //driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //driver.manage().window().maximize();
  }

  @Test
  public void testIKEA1() throws Exception {
    driver.get("https://www.ikea.com/");
    driver.findElement(By.linkText("Take me to IKEA United States")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Log In/Sign Up'])[1]/following::div[6]")).click();
    driver.findElement(By.linkText("Dining")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Gather for the food. Stay for the stories.'])[1]/following::img[1]")).click();
    driver.findElement(By.id("imgThmbProduct2")).click();
    driver.findElement(By.id("jsButton_saveToList_lnk")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Shopping list'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Log In/Sign Up'])[1]/following::div[6]")).click();
    driver.findElement(By.linkText("Bedroom")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pillows'])[2]/following::img[4]")).click();
    driver.findElement(By.id("imgThmbProduct1")).click();
    driver.findElement(By.id("jsButton_saveToList_lnk")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Shopping list'])[1]/following::input[1]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
