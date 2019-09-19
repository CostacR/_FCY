package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainInformationStep extends PageObject {

    //слайдеры
    @FindBy(xpath = "//div//mat-step-header[@aria-posinset='1']")
    private WebElement clientSelectSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='2']")
    private WebElement mainInformationSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='3']")
    private WebElement contractorSlider;

    @FindBy (xpath = "//div//mat-step-header[@aria-posinset='4']")
    private WebElement orderPreviewSlider;

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

    //****************************************************************************************************************** поля степа Основа інформація
    @FindBy (xpath = "//*[@formcontrolname='secondCtrlContractSourceType']/div")
    private WebElement newOrderDropMenu;

    @FindBy (xpath = "//div/div/div/*/*[contains(text(), 'Новий договір')]")
    private WebElement selectNewOrderInMenu;

    @FindBy (xpath = "//div/div/div/*/*[contains(text(), ' Передача договору  з іншого банку ')]")
    private WebElement selectFromOtherBankInMenu;

    @FindBy (xpath = "//*[@formcontrolname='secondCtrlCategory']/div")
    private WebElement categoryOrderDropMenu;

    @FindBy (xpath = "//div/div/div/mat-option/*[contains(text(), 'ЗЕД')]")
    private WebElement categoryOrderZEDDropMenu;


    @FindBy (xpath = "//*[@formcontrolname='secondCtrlContractType']/div")
    private WebElement typeOrderDropMenu;

    @FindBy (xpath = "//div/div/div/mat-option/*[contains(text(), 'Імпортний')]")
    private WebElement typeOrderImportDropMenu;

    @FindBy (xpath = "//div/div/div/mat-option/*[contains(text(), 'Експортний')]")
    private WebElement typeOrderExportDropMenu;

    @FindBy (xpath = "//div/div/div/mat-option/*[contains(text(), 'Імпортно-експортний')]")
    private WebElement typeOrderImportExportDropMenu;

    @FindBy (xpath = "//*[@formcontrolname='secondCtrlIsLowTotal']")
    private WebElement minorSumCheckbox;

    @FindBy (xpath = "//input[@formcontrolname='secondCtrlContractNumber']")
    private WebElement numberOrderInputForm;

    @FindBy (xpath = "//div/div/div/*[@placeholder='Дата договору']")
    private WebElement orderStartedDateField;

    @FindBy (xpath = "//div/div/div/*[@placeholder='Дата закінчення договору']")
    private WebElement orderFinishedDateField;

    @FindBy (xpath = "//*[@formcontrolname='secondCtrlWithoutContractEndDate']")
    private WebElement BdzCheckbox;

    @FindBy (xpath = "//*[@formcontrolname='secondCtrlContractCurrency']/div")
    private WebElement currencyOrderDropMenu;

    //****************************************************************************************************************** ВАЛЮТЫ
    @FindBy (xpath = "//div/div/*/span[contains(text(), '  Долар США по розр.з Iндiїю ')]")
    private WebElement currencyDollarIndiaOrderDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), 'AED')]")
    private WebElement currencyAEDOrderDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), 'AFN')]")
    private WebElement currencyAFNOrderDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), 'RUB')]")
    private WebElement currencyRUBOrderDropMenu;

    @FindBy (xpath = "//div/div/*/div/input[@placeholder='Валюта договогу']")//
    private WebElement currencyInputFormOrderDropMenu;
    //******************************************************************************************************************

    @FindBy (xpath = "//input[@formcontrolname='secondCtrlIBAN']")
    private WebElement clientIBANField;

    @FindBy (xpath = "//input[@formcontrolname='secondCtrlClientRegion']")//not used
    private WebElement clientRegionField;

    @FindBy (xpath = "secondCtrlClientDepartmentName")//not used
    private WebElement clientBankDivisionField;

    @FindBy (xpath = "//input[@formcontrolname='secondCtrlClientDepartmentMFO']")//not used
    private WebElement clientBankMFOField;

    @FindBy (xpath = "//input[@formcontrolname='secondCtrlContractTotal']")
    private WebElement orderSumField;

    @FindBy (xpath = "//input[@formcontrolname='secondCtrlContractWithoutTotal']")
    private WebElement orderWithoutSumCheckbox;

    @FindBy (xpath = "//*[@formcontrolname='secondCtrlCommissionContract']/div")
    private WebElement commisionOrderDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), 'Так')]")
    private WebElement commisionOrderYESDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), 'Ні')]")
    private WebElement commisionOrderNODropMenu;

    @FindBy (xpath = "//*[@formcontrolname='secondCtrlTransferPurpose']/div")
    private WebElement targetOperationDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), '101')]")
    private WebElement targetOperation101DropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), '102')]")
    private WebElement targetOperation102DropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), '103')]")
    private WebElement targetOperation103DropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), '104')]")
    private WebElement targetOperation104DropMenu;

    @FindBy (xpath = "//div/div/*/div/input[@placeholder='Мета переказу']")
    private WebElement targetOperationInputDropMenu;

    @FindBy (xpath = "//*[@formcontrolname='secondCtrlPB1Code']/div")
    private WebElement operationTypeDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), '1721')]")
    private WebElement operationType1721DropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), '1251')]")
    private WebElement operationType1251DropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), '1751')]")
    private WebElement operationType1751DropMenu;

    @FindBy (xpath = "//div/div/*/div/input[@placeholder='Тип операції']")
    private WebElement operationTypeInputDropMenu;

    @FindBy (xpath = "//*[@formcontrolname='secondCtrlRiskCode']/div")
    private WebElement indexRiskDropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), 'Обсяг валютних операцій не збігається з обсягами звичайної ділової активності суб’єкта валютної операції')]")
    private WebElement indexRisk11DropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), 'Здійснення фізичною особою валютної операції,  не пов’язаної з підприємницькою діяльністю, на суму (в еквіваленті за офіційним')]")
    private WebElement indexRisk12DropMenu;

    @FindBy (xpath = "//div/div/mat-option/span[contains(text(), 'Невідповідність суті валютних операцій змісту діяльності суб’єкта валютної операції')]")
    private WebElement indexRisk22DropMenu;

    @FindBy (xpath = "//div/div/*/div/input[@placeholder='Індикатора ризиковості']")
    private WebElement indexRiskInputDropMenu;

    @FindBy (xpath = "//input[@formcontrolname='secondCtrlWithoutRiskIndicators']")
    private WebElement orderWithoutRiskIndicatorsCheckbox;

    @FindBy (xpath = "//input[@formcontrolname='secondCtrlPseudonym']")
    private WebElement clientContactPseudonymField;

    @FindBy (xpath = "//input[@formcontrolname='secondCtrlContactPersonFio']")
    private WebElement clientContactPersonNameField;

    @FindBy (xpath = "//input[@formcontrolname='secondCtrlContactPersonPhone']")
    private WebElement clientContactPersonPhoneField;

    public MainInformationStep(WebDriver driver){
        super(driver);
    }


    public void mainInformationsFillForm(String numberOrder, String orderIBANnumber, String sumOrder, String startDate, String finishDate, String indexCurrency) throws InterruptedException {
        newOrderDropMenu.click();
        Thread.sleep(50);
        selectNewOrderInMenu.click();

        categoryOrderDropMenu.click();
        Thread.sleep(50);
        categoryOrderZEDDropMenu.click();

        typeOrderDropMenu.click();
        Thread.sleep(50);
        typeOrderExportDropMenu.click();

        numberOrderInputForm.clear();
        numberOrderInputForm.click();
        numberOrderInputForm.sendKeys(numberOrder);

        orderStartedDateField.click();
        orderStartedDateField.sendKeys(startDate);

        orderFinishedDateField.click();
        orderFinishedDateField.sendKeys(finishDate);

        currencyOrderDropMenu.click();
        currencyAEDOrderDropMenu.click();
        currencyRUBOrderDropMenu.click();
        currencyInputFormOrderDropMenu.sendKeys(indexCurrency);
        currencyInputFormOrderDropMenu.sendKeys(Keys.ENTER);
        currencyInputFormOrderDropMenu.sendKeys(Keys.TAB);

        Thread.sleep(100);
        clientIBANField.clear();
        clientIBANField.click();
        clientIBANField.sendKeys(orderIBANnumber);

        orderSumField.click();
        orderSumField.sendKeys(sumOrder);

        commisionOrderDropMenu.click();
        Thread.sleep(50);
        commisionOrderYESDropMenu.click();

        targetOperationDropMenu.click();
        Thread.sleep(50);
        targetOperation101DropMenu.click();
        targetOperation102DropMenu.click();
        targetOperationInputDropMenu.click();
        targetOperationInputDropMenu.sendKeys(Keys.ENTER);
        targetOperationInputDropMenu.sendKeys(Keys.TAB);

        operationTypeDropMenu.click();
        Thread.sleep(50);
        operationType1251DropMenu.click();
        operationType1721DropMenu.click();
        operationTypeInputDropMenu.sendKeys(Keys.ENTER);
        operationTypeInputDropMenu.sendKeys(Keys.TAB);

        indexRiskDropMenu.click();
        Thread.sleep(50);
        indexRisk11DropMenu.click();
        indexRisk22DropMenu.click();
        indexRiskInputDropMenu.sendKeys(Keys.ENTER);
        indexRiskInputDropMenu.sendKeys(Keys.TAB);
    }

    public void mainInformationNewOrderSelect(){

    }
    public void mainInformationTransferOrderAnotherBankSelect(){

    }

    public void mainInformationsMinorSum (String numberOrder, String orderIBANnumber, String sumOrder, String startDate, String finishDate, String indexCurrency) throws InterruptedException {
        newOrderDropMenu.click();
        Thread.sleep(50);
        selectNewOrderInMenu.click();

        categoryOrderDropMenu.click();
        Thread.sleep(50);
        categoryOrderZEDDropMenu.click();

        typeOrderDropMenu.click();
        Thread.sleep(50);
        typeOrderExportDropMenu.click();

        minorSumCheckbox.click();

        numberOrderInputForm.clear();
        numberOrderInputForm.click();
        numberOrderInputForm.sendKeys(numberOrder);

        orderStartedDateField.click();
        orderStartedDateField.sendKeys(startDate);

        Thread.sleep(100);
        clientIBANField.clear();
        clientIBANField.click();
        clientIBANField.sendKeys(orderIBANnumber);

        targetOperationDropMenu.click();
        Thread.sleep(50);
        targetOperation101DropMenu.click();
        targetOperation102DropMenu.click();
        targetOperationInputDropMenu.click();
        targetOperationInputDropMenu.sendKeys(Keys.ENTER);
        targetOperationInputDropMenu.sendKeys(Keys.TAB);

        operationTypeDropMenu.click();
        Thread.sleep(50);
        operationType1251DropMenu.click();
        operationType1721DropMenu.click();
        operationTypeInputDropMenu.sendKeys(Keys.ENTER);
        operationTypeInputDropMenu.sendKeys(Keys.TAB);

        indexRiskDropMenu.click();
        Thread.sleep(50);
        indexRisk11DropMenu.click();
        indexRisk22DropMenu.click();
        indexRiskInputDropMenu.sendKeys(Keys.ENTER);
        indexRiskInputDropMenu.sendKeys(Keys.TAB);
    }

}
