package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ClientSelectStep extends PageObject {

    //слайдеры
    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='1']")
    private WebElement clientSelectSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='2']")
    private WebElement mainInformationSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='3']")
    private WebElement contractorSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='4']")
    private WebElement orderPreviewSlider;

    //****************************************************************************************************************** элементы формы Вибір клиента
    @FindBy (xpath = "//input[@formcontrolname='zeroCtrlInput']")
    private WebElement clientSearchInputForm;

    @FindBy (xpath = "//div/button/span[contains(text(), 'Пошук')]")
    private WebElement searchButton;

    @FindBy (xpath = "//*[@formcontrolname='zeroCtrlClientSelect']")
    private WebElement clientDropMenu;

    @FindBy(xpath = "//*[@id='mat-option-430']/span")
    private WebElement firstElementList;

    //****************************************************************************************************************** нижние навигационные кнопки
    @FindBy (xpath = "//button//span[contains(text(), 'Зберегти як чернетку')]/ancestor::button")
    private WebElement draftOrderSaveButton;

    @FindBy (xpath = "//button//span[contains(text(), 'Попередній крок ')]")
    private WebElement previousStepButton;

    @FindBy (xpath = "//span[contains(text(), 'Наступний крок')]/ancestor::button")
    private WebElement nextStepButton;

    @FindBy (xpath = "//button//span[contains(text(), 'Зберегти')]/ancestor::button")
    private WebElement saveOrderButton;

    @FindBy (xpath = "//button//span[contains(text(), 'Вийти')]/ancestor::button")
    private WebElement exitButton;

    // ***************************************************************************************************************** поля степа Вибір клієнта
    @FindBy(xpath = "//*[contains(text(), 'Найменування/ПІБ англійською')]/ancestor::div/input")
    private WebElement clientEngNameField;

    @FindBy (xpath = "//input[@placeholder='Адреса англійською']")
    private WebElement clientEngAdressField;

    @FindBy (xpath = "//*[@id='mat-checkbox-6']/label/span/text()")
    private WebElement checkboxVRus;

    @FindBy (xpath = "//input[@formcontrolname='firstCtrlClientNameRuss']")
    private WebElement clientRusNameField;

    @FindBy (xpath = "//input[@formcontrolname='firstCtrlClientAddressRuss']")
    private WebElement clientRusAdressField;

    public ClientSelectStep(WebDriver driver){
        super(driver);
    }

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
    public void checkboxRusVClickTest() throws InterruptedException {
        checkboxVRus.click();
        Thread.sleep(200);
        checkboxVRus.click();
    }
    public void clientAdressEngConfirm(String clientAdressEng) throws InterruptedException {
        System.out.println("enter in EngAdrMethod");
        clientEngAdressField.clear();
        clientEngAdressField.click();
        System.out.println("click in EngAdrMethod");
        clientEngAdressField.sendKeys(clientAdressEng);
        Thread.sleep(100);
    }
    public void clientNameEngConfirm(String clientEngName) throws InterruptedException {
        System.out.println("enter in EngNameMethod");
        clientEngNameField.clear();
        clientEngNameField.click();
        clientEngNameField.sendKeys(clientEngName);
        Thread.sleep(100);
    }
    public void clientNameRusConfirm(String clientRusName) throws InterruptedException {
        clientRusNameField.clear();
        clientRusNameField.click();
        clientRusNameField.sendKeys(clientRusName);
        Thread.sleep(100);
    }
    public void clientAdressRusConfirm(String clientAdressRus) throws InterruptedException {
        System.out.println("enter in rusAdrMethod");
        clientEngAdressField.clear();
        clientRusAdressField.click();
        clientRusAdressField.sendKeys(clientAdressRus);
        Thread.sleep(100);
    }





}
