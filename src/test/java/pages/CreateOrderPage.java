package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//НАДО БУДЕТ ПРИ НАПИСАНИИ ТЕСТОВ ПЕРЕПРОВЕРИТЬ КОРРЕКТНОСТЬ XPATH-ов  СО СТЕПЕРА "ОСНОВНАЯ ИНФОРМАЦИЯ" И ДАЛЕЕ.

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
    @FindBy (xpath = "//div/div/input[@id='mat-input-2']")
    private WebElement clientSearchInputForm;

    @FindBy (xpath = "//div/button/span[contains(text(), 'Пошук')]")
    private WebElement searchButton;

//    @FindBy (xpath = "//*[@id='mat-select-14']/div/div[1]")
    @FindBy (xpath = "//*[@id='cdk-step-content-0-0']/app-client-search/form/div/mat-form-field[2]/div/div[1]/div")
    private WebElement clientDropMenu;

    @FindBy(xpath = "//*[@id='mat-option-430']/span")
    private WebElement firstElementList;

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

    //поля степа Вибір клієнта
    @FindBy (xpath = "//div[@class='mat-form-field-infix']//input[@id='mat-input-0']")
    private WebElement clientInputForm;

    @FindBy (xpath = "//*[@id='mat-select-0']")
    private WebElement clientSelectDropMenu;

    @FindBy (xpath = "//*[@id='mat-input-21']")
    private WebElement clientEngNameField;

    @FindBy (xpath = "//*[@id='mat-input-26']")
    //*[@id='mat-input-77']
    private WebElement clientEngAdressField;

    @FindBy (xpath = "//input[@id='mat-checkbox-13-input']")
    private WebElement checkboxVRus;

    @FindBy (xpath = "//*[@id='mat-input-65']")
    private WebElement clientRusNameField;

    @FindBy (xpath = "//*[@id='mat-input-30']")
    private WebElement clientRusAdressField;

    @FindBy (xpath = "//*[@id='mat-input-23']")
    private WebElement clientContactPersonNameField;

    @FindBy (xpath = "//*[@id='mat-input-24']")
    private WebElement clientContactPersonPhoneField;

    //поля степа Основа інформація
    @FindBy (xpath = "//*[@id='mat-select-1']")
    private WebElement newOrderDropMenu;

    @FindBy (xpath = "//*[@id='mat-select-2']")
    private WebElement categoryOrderDropMenu;

    @FindBy (xpath = "//*[@id='mat-select-3']")
    private WebElement typeOrderDropMenu;

    @FindBy (xpath = "//*[@id='mat-input-1']")
    private WebElement numberOrderInputForm;

    @FindBy (xpath = "//*[@id='mat-input-2']")
    private WebElement orderStartedDateField;

    @FindBy (xpath = "//*[@id='mat-input-13']")
    private WebElement orderFinishedDateField;

    @FindBy (xpath = "//*[@id='mat-select-7']")
    private WebElement currencyOrderDropMenu;

    @FindBy (xpath = "//*[@id='mat-input-3']")
    private WebElement clientIBANField;

    @FindBy (xpath = "//*[@id='mat-input-4']")//not used
    private WebElement clientRegionField;

    @FindBy (xpath = "")//not used
    private WebElement clientBankDivisionField;

    @FindBy (xpath = "//*[@id='mat-input-6']")//not used
    private WebElement clientBankMFOField;

    @FindBy (xpath = "//*[@id='mat-input-16']")
    private WebElement orderSumField;

    @FindBy (xpath = "//*[@id='mat-select-8']")
    private WebElement commisionOrderDropMenu;

    @FindBy (xpath = "//*[@id='mat-select-4']")
    private WebElement targetPperationDropMenu;

    @FindBy (xpath = "//*[@id='mat-select-5']")
    private WebElement operationTypeDropMenu;

    @FindBy (xpath = "//div//*[@class='shortFieldWithCheckBox mat-form-field ng-tns-c15-21 mat-primary mat-form-field-type-mat-select mat-form-field-appearance-legacy mat-form-field-can-float mat-form-field-has-label mat-form-field-hide-placeholder mat-form-field-should-float ng-dirty ng-valid ng-touched']")
    private WebElement indexRiskDropMenu;

    //поля степа Контрагент

    @FindBy (xpath = "//div[@id='cdk-step-content-0-2']//button[@class='mat-stroked-button mat-primary']")
    private WebElement addContractorButton;

    @FindBy (xpath = "//*[@id='mat-input-55']")
    private WebElement contractorNameField;

    @FindBy (xpath = "//*[@id='mat-select-5']")
    private WebElement contractorCountryDropMenu;

    @FindBy (xpath = "//span/*[@class='separate mat-form-field ng-tns-c15-103 mat-primary mat-form-field-type-mat-input mat-form-field-appearance-legacy mat-form-field-can-float mat-form-field-has-label mat-form-field-hide-placeholder ng-valid mat-form-field-should-float ng-dirty ng-touched']")
    private WebElement contractorCodeField;

    @FindBy (xpath = "//*[@id='button_search']")
    private WebElement contractorSearchButton;

    @FindBy (xpath = "")
    private WebElement contractorSearchDropMenu;

    @FindBy (xpath = "//*[@class='mat-stroked-button mat-primary']//a[contains(text(), 'Створити контрагента')]")
    private WebElement newContractorButton;

    @FindBy (xpath = "//button[@class='mat-raised-button mat-accent ng-star-inserted']//*[contains(text(), 'Наступний крок')]")
    private WebElement nextStepContractorButton;

    @FindBy (xpath = "")
    private WebElement previousStepContractorButton;

    @FindBy (xpath = "//button[@class='mat-raised-button mat-warn']//*[contains(text(), 'Скасувати')]")
    private WebElement cancelContractorButton;

    @FindBy (xpath = "//*[@id='mat-input-49']")
    private WebElement contractorNameInputForm;

    @FindBy (xpath = "//*[@id='mat-input-50']")
    private WebElement contractorCodeForm;

    @FindBy (xpath = "//*[@id='mat-input-51']")
    private WebElement contractorAdressInputForm;

    @FindBy (xpath = "//*[@id='mat-select-15']")
    private WebElement newContractorCountryDropMenu;

    @FindBy (xpath = "//*[@id='mat-select-16']")
    private WebElement contractorResidentDropMenu;

    @FindBy (xpath = "//div[@id='cdk-step-content-2-1']//button")
    private WebElement addContractorBankDetailsButton;

    @FindBy (xpath = "//div[@id='cdk-accordion-child-12']//button")
    private WebElement newContractorBankDetailsButton;

    @FindBy (xpath = "")
    private WebElement searchContractorField;

    @FindBy (xpath = "")
    private WebElement searchContractorButton;

    @FindBy (xpath = "")
    private WebElement contractorDetailsSelectDropMenu;

    @FindBy (xpath = "//div[@id='cdk-accordion-child-13']//button[1]")
    private WebElement searchContractorBankButton;

    @FindBy (xpath = "//*[@id=\"mat-dialog-4\"]/app-requisite-form/mat-card-actions/button[1]/span")
    private WebElement saveDetailsButton;

    //@FindBy (xpath = "//*[@class='mat-card-actions']//button/span[contains(text(), 'Скасувати')]")//не работает. 2 элемента.
    @FindBy (xpath = "//*[@id=\"mat-dialog-4\"]/app-requisite-form/mat-card-actions/button[2]/span")
    private WebElement cancelDetailsButton;

    @FindBy (xpath = "//*[@id='mat-input-69']")
    private WebElement contractorSwiftCodeInputForm;

    @FindBy (xpath = "//*[@id='mat-input-70']")
    private WebElement contractorBankNameInputForm;

    @FindBy (xpath = "//*[@id='mat-input-71']")
    private WebElement contractorBankAdressInputForm;

    @FindBy (xpath = "//*[@id='mat-input-72']")
    private WebElement contractorCliringCodeForm;

    @FindBy (xpath = "//*[@id='mat-select-21']")
    private WebElement contractorBankCountryDropMenu;

    @FindBy (xpath = "//*[@id='mat-input-73']")
    private WebElement contractorIbanInputForm;

    @FindBy (xpath = "//*[@id='mat-input-74']")
    private WebElement contractorCorrespondingAccountRuInputForm;

    @FindBy (xpath = "//button/span[contains(text(), 'Вийти')]")
    private WebElement exitOrderButton;





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

    public void searchClient(String clientNumName) throws InterruptedException {//введение данных на первом степере
        clientSearchInputForm.click();
        clientSearchInputForm.clear();
        clientSearchInputForm.sendKeys(clientNumName);
        searchButton.click();
        Thread.sleep(200);
        clientDropMenu.click();
        firstElementList.click();

    }

    public void clientAdressEngConfirm(String clientAdressEng) throws InterruptedException {
        clientEngAdressField.click();
        clientEngAdressField.sendKeys(clientAdressEng);
        Thread.sleep(100);
    }
    public void clientAdressRusConfirm(String clientAdressRus) throws InterruptedException {
        clientRusAdressField.click();
        clientRusAdressField.sendKeys(clientAdressRus);
        Thread.sleep(100);
    }
}
