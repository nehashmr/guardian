package stepDefinitions;

import cucumber.api.java.en.Then;
import functionLibrary.CommonFunctions;
import pageObjects.AllGuardiansPage;
import pageObjects.DashboardPage;

public class ValidateGuardianSteps extends CommonFunctions {

    DashboardPage dashboardPage = new DashboardPage(driver);
    AllGuardiansPage allGuardiansPage = new AllGuardiansPage(driver);

    @Then("^I should see the email id \"([^\"]*)\" on the page$")
    public void i_should_see_the_email_id_on_the_page(String emailVal)throws Exception
    {
        implicitWait(20);
        dashboardPage.clickGuardianMainMenu();
        implicitWait(20);
        dashboardPage.clickAllGuardiansSubmenu();
        implicitWait(10);
        allGuardiansPage.assertEmailNotFound(emailVal);
        implicitWait(30);
    }
}
