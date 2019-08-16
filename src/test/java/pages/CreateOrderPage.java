package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrderPage extends PageObject {

    //слайдеры
    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='1']")
    private WebElement clientSelectSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='2']")
    private WebElement mainInformationSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='3']")
    private WebElement contractorSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='4']")
    private WebElement orderPreviewSlider;

    //элементы формы поиска клиента
    @FindBy (xpath = "//div/div/input[@id='mat-input-51']")
    private WebElement clientSearchInputForm;

    @FindBy (xpath = "//div/button/span[contains(text(), 'Пошук')]")
    private WebElement searchButton;

    @FindBy (xpath = "//div/mat-form-field[@class='selectClientDropbox mat-form-field ng-tns-c9-93 mat-primary mat-form-field-type-mat-select mat-form-field-appearance-legacy mat-form-field-can-float mat-form-field-has-label mat-form-field-hide-placeholder ng-pristine ng-invalid mat-form-field-invalid ng-touched']")
    private WebElement clientDropMenu;

    //нижние навигационные кнопки
    @FindBy (xpath = "//button//span[contains(text(), 'Зберегти як чернетку')]")
    private WebElement draftOrderSaveButton;

    @FindBy (xpath = "//button//span[contains(text(), 'Попередній крок ')]")
    private WebElement previousStepButton;

    @FindBy (xpath = "//button//span[contains(text(), 'Наступний крок')]")
    private WebElement nextStepButton;

    @FindBy (xpath = "//button//span[contains(text(), 'Зберегти')]")
    private WebElement saveOrderButton;

    @FindBy (xpath = "//button//span[contains(text(), 'Вийти')]")
    private WebElement exitButton;

    public CreateOrderPage (WebDriver driver){
        super(driver);
    }

    //        Assert.assertTrue("addPaymentOrderButton is visible", addPaymentOrderButton.isDisplayed());
    //методы Click по кнопкам
    public void draftOrderSaveButtonClick(){
        Assert.assertTrue("draftOrderSaveButton is visible",draftOrderSaveButton.isDisplayed());
        Assert.assertTrue("draftOrderSaveButton is enabled", draftOrderSaveButton.isEnabled());
        draftOrderSaveButton.click();
    }
    public void previousStepButtonClick(){
        Assert.assertTrue("previousStepButton is visible",previousStepButton.isDisplayed());
        Assert.assertTrue("previousStepButton is enabled", previousStepButton.isEnabled());
        previousStepButton.click();
    }

    public void nextStepButtonClick(){
        Assert.assertTrue("nextStepButton is visible",nextStepButton.isDisplayed());
        Assert.assertTrue("nextStepButton is enabled", nextStepButton.isEnabled());
        nextStepButton.click();
    }

    public void saveOrderButtonClick(){
        Assert.assertTrue("saveOrderButton is visible",saveOrderButton.isDisplayed());
        Assert.assertTrue("saveOrderButton is enabled", saveOrderButton.isEnabled());
        saveOrderButton.click();
    }

    public void exitButtonClick(){
        Assert.assertTrue("exitButton is visible",exitButton.isDisplayed());
        Assert.assertTrue("exitButton is enabled", exitButton.isEnabled());
        exitButton.click();
    }

}
