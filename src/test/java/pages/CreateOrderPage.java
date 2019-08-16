package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrderPage extends PageObject {

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='1']")
    private WebElement clientSelectSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='2']")
    private WebElement mainInformationSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='3']")
    private WebElement contractorSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='4']")
    private WebElement orderPreviewSlider;

    @FindBy (xpath = "//div/div/input[@id='mat-input-51']")
    private WebElement clientSearchInputForm;

    @FindBy (xpath = "//div/button/span[contains(text(), 'Пошук')]")
    private WebElement searchButton;

    @FindBy (xpath = "//div/mat-form-field[@class='selectClientDropbox mat-form-field ng-tns-c9-93 mat-primary mat-form-field-type-mat-select mat-form-field-appearance-legacy mat-form-field-can-float mat-form-field-has-label mat-form-field-hide-placeholder ng-pristine ng-invalid mat-form-field-invalid ng-touched']")
    private WebElement clientDropMenu;



    public CreateOrderPage (WebDriver driver){
        super(driver);
    }

}
