package test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class Report_Test {

    private Selenium selenium;
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();
    private StringBuffer pausa = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://stage-registration.23traders.com/reports/deposit_group_behavior/");
        selenium.start();
        //driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void Report_Test() throws Exception {
        selenium.open("http://stage-registration.23traders.com/reports/deposit_group_behavior/");
        //selenium.waitForPageToLoad("10000");
        selenium.type("id=name", "23traders_admin");
        selenium.type("id=UserPassword", "U6-Jjq/c!zm3");
        selenium.click("class=form-control btn btn-primary");
        selenium.waitForPageToLoad("20000");

        assertTrue("Deposit_group_behavior: Test cannot find element", isElementPresent(By.name("Period")));
        //assertTrue("Deposit_group_behavior: Test cannot find element", isElementPresent(By.className("submit")));
        //selenium.click("link=Sign Out");
        //selenium.click("class=so-logout");
        //selenium.waitForPageToLoad("30000");

    

/*
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();
    private StringBuffer pausa = new StringBuffer();


    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Test
    public void Report_Test() throws Exception {

        driver.get("https://www.23traders.com/en/");

        <form novalidate="" autocomplete="off" name="loginform" id="loginform" class="hide-for-not-supported so-login" action="#" method="POST"><\form>                                      </form>

        try {
            Thread.sleep(10000);
        } catch (Error e) {
            pausa.append(e.toString());
        }

        //driver.findElement(By.xpath("//*[@id="sb_ifc0"]")).sendKeys("qwertys");

      driver.get("https://www.23traders.com/en/");

        try {
            Thread.sleep(30000);
        } catch (Error e) {
            pausa.append(e.toString());
        }

        driver.findElement(By.name("email")).sendKeys("pavel@23traders.com");
        driver.findElement(By.name("password")).sendKeys("qwertysun");
        driver.findElement(By.name("wp-submit")).click();

        //driver.get("https://23traders_admin:U6-Jjq%2Fc!zm3@stage-registration.23traders.com/reports/deposit_group_behavior/");
        

      driver.get("http://stage-registration.23traders.com/reports/deposit_group_behavior/");
        driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("23traders_admin");
        driver.findElement(By.xpath("//*[@id=\"UserPassword\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"UserPassword\"]")).sendKeys("U6-Jjq/c!zm3");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"UserLoginForm\"]/div[4]/input"));
        loginButton.click();
        //driver.findElement(By.xpath("//*[@id=\"UserLoginForm\"]/div[4]/input")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//*[@id=\"UserLoginForm\"]/div[4]/input")).click();

*/

        //assertTrue("Deposit_group_behavior: Test cannot find element", isElementPresent(By.name("Period")));
        //assertTrue("23Traders: Test cannot find element", isElementPresent(By.name("rememberme")));


        String se = "23Traders:";
        System.out.print(se);
        String sf = " Success Report_Test";
        System.out.println(sf);

    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            //driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }
    
}



