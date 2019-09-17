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
                {"login","password","11111111","Eng_name_ltd","Eng String adress", "рус_название_ООО", "Строка адреса на русском","Договор №1","IBAN1234456789","10000.99"
                        //,"","","","","",""//раскрывать аргуменнтов данных ровно по числу переменных!!!!
                        },//если выдает ошибку "Wrong number argument" - значит не хватает данных в датапровайдере

//                {"", ""},//данные для dataProvider Supervisor
//                {"", ""},//данные для dataProvider adminFCY
        });
    }

    private String login;
    private String password;

    //блок Вибір клієнта
    private String clientNumName;
    private String clientAdressEng;
    private String clientEngName;
    private String clientAdressRus;
    private String clientRusName;

    //блок Основна інформація
    private String numberOrder;
    private String orderIBANnumber;
    private String sumOrder;

    public FcyLoginTest(String login, String password, String clientNumName, String clientAdressEng, String clientEngName, String clientAdressRus, String clientRusName, String numberOrder, String orderIBANnumber, String sumOrder) {
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
    public void successfulControllerTest() throws InterruptedException {

        user.openLoginPage();
        Thread.sleep(500);
        user.checkLoginTitle();
        user.controllerButtonClick();
        Thread.sleep(400);

        user.menuButtonClick();


        Thread.sleep(500);
        user.addPaymentOrderButtonClickTest();
        user.addOrder(clientNumName, clientEngName, clientAdressEng, clientRusName,  clientAdressRus);

        Thread.sleep(500);
        user.nextStep();
        user.addMainInformations(numberOrder, orderIBANnumber, sumOrder);
        user.nextStep();
//        user.addContractor(); //создание нового контрагента
        user.addContractorBySearch();
        user.nextStep();

        //wait after test's end
        Thread.sleep(4000000);

    }

//    @Test
//    public void successfulSupervisorTest(){
//
//    }
//
//    @Test
//    public void successfulAdminFCYTest(){
//
//    }

}
