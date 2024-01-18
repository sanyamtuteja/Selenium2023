import org.Selenium.Base.BaseSetup;
import org.Selenium.PageObjects.LoginPage;
import org.testng.annotations.Test;

import java.sql.Driver;

public class test extends BaseSetup {

    @Test
    public void test_001(){
        LoginPage loginPage = new LoginPage(driver);
    }
}
