package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.AllGuardiansPage;
import pageObjects.DashboardPage;

public class AddNewBtnSteps extends CommonFunctions {

    DashboardPage dashboardPage = new DashboardPage(driver);
    AllGuardiansPage allGuardiansPage = new AllGuardiansPage(driver);

    @When("^I click on Add New Button on the page$")
    public void i_click_on_Add_New_Button_on_the_page()throws Exception
    {
        implicitWait(20);
        dashboardPage.clickGuardianMainMenu();
        implicitWait(20);
        dashboardPage.clickAllGuardiansSubmenu();
        implicitWait(10);
        allGuardiansPage.clickAddNew();

    }

    @Then("^I should see the Add Guardian Page\\.$")
    public void i_should_see_the_Add_Guardian_Page()throws Exception
    {
       allGuardiansPage.validateAddNewBtn();
        implicitWait(10);
    }

}
