package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public WebDriver driverPage;
    public DashboardPage(WebDriver driver)
    {
        this.driverPage = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]")
    public WebElement guardiansMainMenu;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[1]/div[4]/div[1]/ul[1]/li[6]/ul[1]/li[2]/a[1]")
    public  WebElement addNewGuardianSubmenu;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[1]/div[4]/div[1]/ul[1]/li[6]/ul[1]/li[1]/a[1]")
    public WebElement allGuardiansSubmenu;

    public void clickGuardianMainMenu()
    {
        guardiansMainMenu.click();
    }

    public void clickAddNewGuardianSubmenu()
    {
        addNewGuardianSubmenu.click();
    }

    public void clickAllGuardiansSubmenu()throws Exception
    {
        Thread.sleep(1000);
        allGuardiansSubmenu.click();
    }

}
