package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    public static WebDriver driver;

    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    public void closeBrowser()
    {
        driver.quit();
    }

    public void implicitWait(int waittime)
    {
        driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
    }

    public void explicitWait(WebDriver driver, WebElement element,int timeout)
    {
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void takeScreenShot(String fileName)throws Exception
    {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(FilePaths.errorShots+fileName+".png");
        FileUtils.copyFile(srcFile,destFile);
    }

    public void loginDetails()
    {
        driver.get(FilePaths.DashboardURL);
        driver.findElement(By.xpath(FilePaths.userName)).sendKeys("admin@coaching.com");
        driver.findElement(By.xpath(FilePaths.password)).sendKeys("22091671");
        driver.findElement(By.xpath(FilePaths.loginBtn)).click();
    }

    public void validateEmail()
    {
        driver.getPageSource().contentEquals("emailVal");
    }
}
