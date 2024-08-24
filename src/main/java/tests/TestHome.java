package tests;

import dsl.DSL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestHome {

    WebDriver driver;
    DSL dsl;

    @Before
    public void initialExecution() {
        driver = new FirefoxDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        dsl = new DSL(driver);
    }

    @Test
    public void elements() {
        WebElement element = driver.findElement(By.xpath("//div[@class=\"card-body\"]/h5[text()=\"Elements\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        dsl.checkURL("https://demoqa.com/elements");
    }

    @Test
    public void forms() {
        WebElement element = driver.findElement(By.xpath("//div[@class=\"card-body\"]/h5[text()=\"Forms\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        dsl.checkURL("https://demoqa.com/forms");
    }

    @Test
    public void alertsFrameWindows() {
        WebElement element = driver.findElement(By.xpath("//div[@class=\"card-body\"]/h5[text()=\"Alerts, Frame & Windows\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        dsl.checkURL("https://demoqa.com/alertsWindows");
    }

    @Test
    public void widget() {
        WebElement element = driver.findElement(By.xpath("//div[@class=\"card-body\"]/h5[text()=\"Widgets\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        dsl.checkURL("https://demoqa.com/widgets");
    }

    @Test
    public void interactions() {
        WebElement element = driver.findElement(By.xpath("//div[@class=\"card-body\"]/h5[text()=\"Interactions\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        dsl.checkURL("https://demoqa.com/interaction");
    }

    @Test
    public void bookStoreApplication() {
        WebElement element = driver.findElement(By.xpath("//div[@class=\"card-body\"]/h5[text()=\"Book Store Application\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        dsl.checkURL("https://demoqa.com/books");
    }

    @After
    public void closeTab() {
        driver.quit();
    }
}
