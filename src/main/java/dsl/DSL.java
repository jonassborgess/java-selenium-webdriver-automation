package dsl;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DSL {
    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void checkURL(String url) {
        String urlText = driver.getCurrentUrl();
        Assert.assertEquals(urlText, url);
    }
}
