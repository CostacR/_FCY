package tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class FcyLoginTest extends BaseTest {
    @TestData
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                //{"Client", "NewOrder","CategoryOrder", "TypeOrder","NumberOrder","StartDateOrder","FinistDateOrder","CurrensyOrder","IBAN","SumOrder","CommisionOrder","TergetOrder","TypeOperation","CodeRisk","","","","","","","","","","","","","","",""},//данные для dataProvider Controller
                //{"clientSelectSlider", "mainInformationSlider", "contractorSlider", "orderPreviewSlider", "clientSearchInputForm", "searchButton", "clientDropMenu", "draftOrderSaveButton", "previousStepButton", "nextStepButton", "saveOrderButton", "exitButton", "clientInputForm", "clientSelectDropMenu", "clientEngNameField", "clientEngAdressField", "clientRusNameField", "clientRusAdressField", "clientContactPersonNameField", "clientContactPersonPhoneField", "newOrderDropMenu", "categoryOrderDropMenu", "typeOrderDropMenu", "numberOrderInputForm", "orderStartedDateField", "orderFinishedDateField", "currencyOrderDropMenu", "clientIBANField", "clientRegionField", "clientBankDivisionField", "clientBankMFOField", "orderSumField", "commisionOrderDropMenu", "targetPperationDropMenu", "operationTypeDropMenu", "indexRiskDropMenu", "addContractorButton", "contractorNameField", "contractorCountryDropMenu", "contractorCodeField", "contractorSearchButton", "contractorSearchDropMenu", "newContractorButton", "nextStepContractorButton", "previousStepContractorButton", "cancelContractorButton", "contractorNameInputForm", "contractorCodeForm", "contractorAdressInputForm", "newContractorCountryDropMenu", "contractorResidentDropMenu", "addContractorBankDetailsButton", "newContractorBankDetailsButton", "searchContractorField", "searchContractorButton", "contractorDetailsSelectDropMenu", "searchContractorBankButton", "saveDetailsButton", "cancelDetailsButton", "contractorSwiftCodeInputForm", "contractorBankNameInputForm", "contractorBankAdressInputForm", "contractorCliringCodeForm", "contractorBankCountryDropMenu", "contractorIbanInputForm", "contractorCorrespondingAccountRuInputForm", "exitOrderButton",}
//                {"clientSearchInputForm", "searchButton", "clientDropMenu", "draftOrderSaveButton", "previousStepButton", "nextStepButton", "saveOrderButton", "exitButton", "clientInputForm", "clientSelectDropMenu", "clientEngNameField", "clientEngAdressField", "clientRusNameField", "clientRusAdressField", "clientContactPersonNameField", "clientContactPersonPhoneField", "newOrderDropMenu", "categoryOrderDropMenu", "typeOrderDropMenu", "numberOrderInputForm", "orderStartedDateField", "orderFinishedDateField", "currencyOrderDropMenu", "clientIBANField", "clientRegionField", "clientBankDivisionField", "clientBankMFOField", "orderSumField", "commisionOrderDropMenu", "targetPperationDropMenu", "operationTypeDropMenu", "indexRiskDropMenu", "addContractorButton", "contractorNameField", "contractorCountryDropMenu", "contractorCodeField", "contractorSearchButton", "contractorSearchDropMenu", "newContractorButton", "nextStepContractorButton", "previousStepContractorButton", "cancelContractorButton", "contractorNameInputForm", "contractorCodeForm", "contractorAdressInputForm", "newContractorCountryDropMenu", "contractorResidentDropMenu", "addContractorBankDetailsButton", "newContractorBankDetailsButton", "searchContractorField", "searchContractorButton", "contractorDetailsSelectDropMenu", "searchContractorBankButton", "saveDetailsButton", "cancelDetailsButton", "contractorSwiftCodeInputForm", "contractorBankNameInputForm", "contractorBankAdressInputForm", "contractorCliringCodeForm", "contractorBankCountryDropMenu", "contractorIbanInputForm", "contractorCorrespondingAccountRuInputForm", "exitOrderButton",},//данные для dataProvider Controller
                {"login","password","11111111","Eng_name_ltd","Eng String adress", "рус_название_ООО", "Строка адреса на русском"
                        ,"Договор №1","IBAN1234456789","10000.99","01/02/2018","31/12/2020","USD","ZORRO. LTD","C9999-101"
                        ,"London, 101, TimeSqwr"
                        //,"","","","","",""//раскрывать аргуменнтов данных ровно по числу переменных!!!!
                        },//если выдает ошибку "Wrong number argument" - значит не хватает данных в датапровайдере
        });
    }

    private String login;
    private String password;
    private String clientNumName;//блок Вибір клієнта
    private String clientAdressEng;
    private String clientEngName;
    private String clientAdressRus;
    private String clientRusName;
    private String numberOrder;//блок Основна інформація
    private String orderIBANnumber;
    private String sumOrder;
    private String startDate;
    private String finishDate;
    private String indexCurrency;
    private String contractorName;//блок контрагент
    private String contractorTaxCode;
    private String contractorAdress;

    public FcyLoginTest(String login, String password, String clientNumName, String clientAdressEng, String clientEngName, String clientAdressRus, String clientRusName
            , String numberOrder, String orderIBANnumber, String sumOrder, String startDate, String finishDate, String indexCurrency
            , String contractorName, String contractorTaxCode, String contractorAdress) {
        this.login = login;
        this.password = password;
        this.clientNumName = clientNumName;
        this.clientAdressEng = clientAdressEng;
        this.clientEngName = clientEngName;
        this.clientAdressRus = clientAdressRus;
        this.clientRusName = clientRusName;
        this.numberOrder = numberOrder;
        this.orderIBANnumber = orderIBANnumber;
        this.sumOrder = sumOrder;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.indexCurrency = indexCurrency;
        this.contractorName = contractorName;
        this.contractorTaxCode = contractorTaxCode;
        this.contractorAdress = contractorAdress;
    }

//    @Test
//    public void showHideOrderButtonTest() throws InterruptedException {
//        user.openLoginPage();
//        Thread.sleep(500);
//        user.checkLoginTitle();
//        user.controllerButtonClick();
//        Thread.sleep(400);
//
//        System.out.println("Hide menu button");
//        user.nideMenuButtonClick();//button open menu
//        Thread.sleep(400);
//        user.nideMenuButtonClick();//button close menu
//    }

    @Test
    public void newOrderSearchContractorTest() throws InterruptedException {
        user.openLoginPage();
        user.checkLoginTitle();
        user.controllerButtonClick();
        user.menuButtonClick();
        user.addPaymentOrderButtonClickTest();
        user.addOrder(clientNumName, clientEngName, clientAdressEng, clientRusName,  clientAdressRus);
        user.nextStep();
        user.addMainInformations( numberOrder,  orderIBANnumber,  sumOrder,  startDate,  finishDate,  indexCurrency);
        user.nextStep();
        user.addContractorBySearch();
        user.nextStep();
        user.saveOrderPreviewPage();
        Thread.sleep(400);
    }

    @Test
    public void newOrderCreateContractorTest() throws InterruptedException {
        user.openLoginPage();
        user.checkLoginTitle();
        user.controllerButtonClick();
        user.menuButtonClick();
        user.addPaymentOrderButtonClickTest();
        user.addOrder(clientNumName, clientEngName, clientAdressEng, clientRusName,  clientAdressRus);
        user.nextStep();
        user.addMainInformations( numberOrder,  orderIBANnumber,  sumOrder,  startDate,  finishDate,  indexCurrency);
        user.nextStep();
        user.addContractor( contractorName,  contractorTaxCode,  contractorAdress); //создание нового контрагента
        user.nextStep();
        user.saveOrderPreviewPage();
        Thread.sleep(400);
    }


}
