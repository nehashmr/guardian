package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.AddGuardianPage;
import pageObjects.DashboardPage;

public class AddGuardianSteps extends CommonFunctions {

    DashboardPage dashboardPage = new DashboardPage(driver);
    AddGuardianPage addGuardianPage = new AddGuardianPage(driver);

    @Given("^I click on \"([^\"]*)\" from navigation menu$")
    public void i_click_on_from_navigation_menu(String arg1)
    {
        implicitWait(10);
        dashboardPage.clickGuardianMainMenu();
    }

    @When("^I click on \"([^\"]*)\" from submenu$")
    public void i_click_on_from_submenu(String arg1)
    {
        implicitWait(5);
        dashboardPage.clickAddNewGuardianSubmenu();
    }

    @Then("^I provide the First Name \"([^\"]*)\"$")
    public void i_provide_the_First_Name(String firstname)throws Exception
    {
        Thread.sleep(1000);
       addGuardianPage.enterFirstName(firstname);
       implicitWait(10);
    }

    @Then("^I provide the Last Name \"([^\"]*)\"$")
    public void i_provide_the_Last_Name(String lastname)
    {
       addGuardianPage.enterLastName(lastname);
       implicitWait(5);
    }

    @Then("^I provide the Email \"([^\"]*)\"$")
    public void i_provide_the_Email(String email)
    {
     addGuardianPage.enterEmail(email);
     implicitWait(5);
    }

    @Then("^I provide the Phone \"([^\"]*)\"$")
    public void i_provide_the_Phone(String phonenum)
    {
      addGuardianPage.enterPhoneNum(phonenum);
      implicitWait(10);
    }

    @Then("^I click on \"([^\"]*)\" Button$")
    public void i_click_on_Button(String arg1)throws Exception
    {
      addGuardianPage.clickAddGuardianBtn();
      Thread.sleep(2000);
    }

    @Then("^I take a Screenshot$")
    public void i_take_a_Screenshot()throws Exception
    {
       takeScreenShot("noData");
    }

}
