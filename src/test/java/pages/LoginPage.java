package pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://10.223.41.72:81/login")
public class LoginPage extends PageObject {

    @FindBy (xpath = "")
    private WebElement logInButton;

    @FindBy (xpath = "//span/button/span[contains(text(), 'Controller')]")
    private WebElement controllerlogInButton;

    @FindBy (xpath = "//span/button/span[contains(text(), 'Supervisor')]")
    private WebElement supervisorlogInButton;

    @FindBy (xpath = "//span/button/span[contains(text(), 'admin FCY')]")
    private WebElement adminFCYlogInButton;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void logInButtonClick(){

    }
    public void logInButtonCheck(){

    }


    public void controllerlogInButtonButtonClick(){
        controllerlogInButton.click();
    }
    public void controllerlogInButtonButtonCheck(){

    }

    public void supervisorlogInButtonButtonClick(){
        supervisorlogInButton.click();

    }
    public void supervisorlogInButtonButtonCheck(){

    }

    public void adminFCYlogInButtonButtonClick(){
        adminFCYlogInButton.click();

    }
    public void adminFCYlogInButtonButtonCheck(){

    }
    protected String getCurrentTitle(){
        return getDriver().getTitle();
    }





}
