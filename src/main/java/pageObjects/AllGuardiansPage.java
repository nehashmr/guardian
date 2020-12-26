package pageObjects;

import functionLibrary.CommonFunctions;
import functionLibrary.FilePaths;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllGuardiansPage {


    CommonFunctions commonFunctions = new CommonFunctions();

    WebDriver driverPage;

    public AllGuardiansPage(WebDriver driver) {
        this.driverPage = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Add N")
    public WebElement addNewBtn;

    public void assertEmailNotFound(String emailVal) throws Exception {

        if (driverPage.getPageSource().contains(emailVal)) {
            System.out.println("Guardian Successfully Added");
        } else {
            commonFunctions.takeScreenShot("invalidemailfound");
            System.out.println("Email not found");
        }

    }

    public void clickAddNew() {
        addNewBtn.click();
    }

    public void validateAddNewBtn() throws Exception {

        if(driverPage.getPageSource().contains("Add New Guardian")){

            System.out.println("on correct page");
        }
        else {
            commonFunctions.takeScreenShot("WrongPage");
            System.out.println("Not on Add Guardian Page");
        }


    }


}