package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.AddGuardianPage;
import pageObjects.DashboardPage;

public class GoBackSteps extends CommonFunctions {

    DashboardPage dashboardPage = new DashboardPage(driver);
    AddGuardianPage addGuardianPage = new AddGuardianPage(driver);

    @When("^I click on Go Back Button on the page$")
    public void i_click_on_Go_Back_Button_on_the_page()
    {
        implicitWait(20);
        dashboardPage.clickGuardianMainMenu();
        implicitWait(20);
        dashboardPage.clickAddNewGuardianSubmenu();
        implicitWait(10);
        addGuardianPage.clickGoBackBtn();

    }

    @Then("^I should see the dashboard\\.$")
    public void i_should_see_the_dashboard()throws Exception
    {
       addGuardianPage.validateGoBackBtn();
       implicitWait(10);
    }

}
