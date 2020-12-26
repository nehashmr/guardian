import cucumber.api.java.After;
import cucumber.api.java.Before;
import functionLibrary.CommonFunctions;

public class Hooks {
    CommonFunctions commonFunctions = new CommonFunctions();


    @Before
    public void beforeTest()throws Exception
    {
        commonFunctions.openBrowser();
        commonFunctions.implicitWait(10);
        commonFunctions.loginDetails();

    }

    @After
    public void afterTest()
    {
        commonFunctions.closeBrowser();
    }
}

