package functionLibrary;

import java.io.File;

public class FilePaths extends CommonFunctions {

    public static String errorShots = new File("src/main/resources/errorShots/").getAbsolutePath();
    public static String DashboardURL = "http://demo.dontonno.com/cms-test-v2/";
    public static String userName ="//input[@id='identity']";
    public static String password ="//input[@id='password']";
    public static String loginBtn = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[4]/div[1]/input[1]";

}
