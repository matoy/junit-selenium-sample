package com.lambdatest;

// Generated by Selenium IDE
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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

// not imported by Selenium IDE
import org.openqa.selenium.chrome.ChromeOptions;

public class MySiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    ChromeOptions handlingSSL = new ChromeOptions();
    handlingSSL.setAcceptInsecureCerts(true);

    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), handlingSSL);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void mysite() {
    driver.get("https://lambdatest.github.io/sample-todo-app/");

    //Let's mark done first two items in the list.
    driver.findElement(By.name("li1")).click();
    driver.findElement(By.name("li2")).click();

    // Let's add an item in the list.
    driver.findElement(By.id("sampletodotext")).sendKeys("Yey, Let's add it to list");
    driver.findElement(By.id("addbutton")).click();

    driver.close();
  }
}
