package pages;


import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy (xpath = "//div[@class='headerBackgroud headerPosition']//button")
    private WebElement hideMenuButton;

    @FindBy (xpath = "//div//button[@id='b_payment_order']")
    private WebElement addPaymentOrderButton;

    @FindBy(xpath = "//div//button[@id='b_all_payment_order']")
    private WebElement listAllPaymentOrderButton;

    @FindBy (xpath = "//div//button[@id='b_swift_order']")
    private WebElement lookSwiftOrderButton;

    public MainPage (WebDriver driver){
        super(driver);
    }

    public void hideMenuButtonClick() throws InterruptedException {
        Assert.assertTrue("hideMenuButton is visible", hideMenuButton.isDisplayed());
        hideMenuButton.click();
    }

    public void addPaymentOrderButtonClick(){
        Assert.assertTrue("addPaymentOrderButton is visible", addPaymentOrderButton.isDisplayed());
        addPaymentOrderButton.click();
    }

    public void listAllPaymentOrderButtonClick(){
        Assert.assertTrue("listAllPaymentOrderButton", listAllPaymentOrderButton.isDisplayed());
        listAllPaymentOrderButton.click();
    }

    public void lookSwiftOrderButtonClick(){
        Assert.assertTrue("lookSwiftOrderButton", lookSwiftOrderButton.isDisplayed());
        lookSwiftOrderButton.click();
    }

}
