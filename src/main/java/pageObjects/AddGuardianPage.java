package pageObjects;

import functionLibrary.CommonFunctions;
import functionLibrary.FilePaths;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddGuardianPage {

    CommonFunctions commonFunctions = new CommonFunctions();
    WebDriver driverPa;

    public AddGuardianPage(WebDriver driver)
    {
        this.driverPa = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#guardian_first_name")
    public WebElement firstName;

    @FindBy(css = "#guardian_last_name")
    public WebElement lastName;

    @FindBy(css = "#guardian_email")
    public WebElement emailId;

    @FindBy(css = "#guardian_phone")
    public WebElement phoneNum;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]")
    public WebElement addGuardianBtn;

    @FindBy(partialLinkText = "Go Ba")
    public WebElement goBackBtn;

    public void enterFirstName(String firstname)
    {
        firstName.sendKeys(firstname);
    }

    public void enterLastName(String lastname)
    {
        lastName.sendKeys(lastname);
    }

    public void enterEmail(String email)
    {
        emailId.sendKeys(email);
    }

    public void enterPhoneNum(String phonenum)
    {
        phoneNum.sendKeys(phonenum);
    }

    public void clickAddGuardianBtn()
    {
        addGuardianBtn.click();
    }

    public void clickGoBackBtn()
    {
        goBackBtn.click();
    }

    public void validateGoBackBtn()throws Exception
    {
        String expectedUrl = "http://demo.dontonno.com/cms-test-v2/";
        driverPa.get(FilePaths.DashboardURL);
        try{
             Assert.assertEquals(expectedUrl, driverPa.getCurrentUrl());
             commonFunctions.takeScreenShot("RightPage");
            System.out.println("On the Right Page");
        }catch (Exception e)
        {
            commonFunctions.takeScreenShot("WrongPage");
        }
    }
}
