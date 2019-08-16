package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import steps.UserSteps;

public class BaseTest {
    @Steps
    protected UserSteps user;

    @Managed(driver = "chrome")
    protected WebDriver driver;

    @Before
    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
    }

}
