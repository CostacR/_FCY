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
                //"login", "Password"
                //{"Client", "NewOrder","CategoryOrder", "TypeOrder","NumberOrder","StartDateOrder","FinistDateOrder","CurrensyOrder","IBAN","SumOrder","CommisionOrder","TergetOrder","TypeOperation","CodeRisk","","","","","","","","","","","","","","",""},//данные для dataProvider Controller
                //{"clientSelectSlider", "mainInformationSlider", "contractorSlider", "orderPreviewSlider", "clientSearchInputForm", "searchButton", "clientDropMenu", "draftOrderSaveButton", "previousStepButton", "nextStepButton", "saveOrderButton", "exitButton", "clientInputForm", "clientSelectDropMenu", "clientEngNameField", "clientEngAdressField", "clientRusNameField", "clientRusAdressField", "clientContactPersonNameField", "clientContactPersonPhoneField", "newOrderDropMenu", "categoryOrderDropMenu", "typeOrderDropMenu", "numberOrderInputForm", "orderStartedDateField", "orderFinishedDateField", "currencyOrderDropMenu", "clientIBANField", "clientRegionField", "clientBankDivisionField", "clientBankMFOField", "orderSumField", "commisionOrderDropMenu", "targetPperationDropMenu", "operationTypeDropMenu", "indexRiskDropMenu", "addContractorButton", "contractorNameField", "contractorCountryDropMenu", "contractorCodeField", "contractorSearchButton", "contractorSearchDropMenu", "newContractorButton", "nextStepContractorButton", "previousStepContractorButton", "cancelContractorButton", "contractorNameInputForm", "contractorCodeForm", "contractorAdressInputForm", "newContractorCountryDropMenu", "contractorResidentDropMenu", "addContractorBankDetailsButton", "newContractorBankDetailsButton", "searchContractorField", "searchContractorButton", "contractorDetailsSelectDropMenu", "searchContractorBankButton", "saveDetailsButton", "cancelDetailsButton", "contractorSwiftCodeInputForm", "contractorBankNameInputForm", "contractorBankAdressInputForm", "contractorCliringCodeForm", "contractorBankCountryDropMenu", "contractorIbanInputForm", "contractorCorrespondingAccountRuInputForm", "exitOrderButton",}
//                {"clientSearchInputForm", "searchButton", "clientDropMenu", "draftOrderSaveButton", "previousStepButton", "nextStepButton", "saveOrderButton", "exitButton", "clientInputForm", "clientSelectDropMenu", "clientEngNameField", "clientEngAdressField", "clientRusNameField", "clientRusAdressField", "clientContactPersonNameField", "clientContactPersonPhoneField", "newOrderDropMenu", "categoryOrderDropMenu", "typeOrderDropMenu", "numberOrderInputForm", "orderStartedDateField", "orderFinishedDateField", "currencyOrderDropMenu", "clientIBANField", "clientRegionField", "clientBankDivisionField", "clientBankMFOField", "orderSumField", "commisionOrderDropMenu", "targetPperationDropMenu", "operationTypeDropMenu", "indexRiskDropMenu", "addContractorButton", "contractorNameField", "contractorCountryDropMenu", "contractorCodeField", "contractorSearchButton", "contractorSearchDropMenu", "newContractorButton", "nextStepContractorButton", "previousStepContractorButton", "cancelContractorButton", "contractorNameInputForm", "contractorCodeForm", "contractorAdressInputForm", "newContractorCountryDropMenu", "contractorResidentDropMenu", "addContractorBankDetailsButton", "newContractorBankDetailsButton", "searchContractorField", "searchContractorButton", "contractorDetailsSelectDropMenu", "searchContractorBankButton", "saveDetailsButton", "cancelDetailsButton", "contractorSwiftCodeInputForm", "contractorBankNameInputForm", "contractorBankAdressInputForm", "contractorCliringCodeForm", "contractorBankCountryDropMenu", "contractorIbanInputForm", "contractorCorrespondingAccountRuInputForm", "exitOrderButton",},//данные для dataProvider Controller
                {"","","3","Eng String adress", "Строка адреса на русском"},//если выдает ошибку "Wrong number argument" - значит не хватает данных в датапровайдере

//                {"", ""},//данные для dataProvider Supervisor
//                {"", ""},//данные для dataProvider adminFCY
        });
    }

    private String login;
    private String password;
    private String clientNumName;
    private String clientAdressEng;
    private String clientAdressRus;

    public FcyLoginTest(String login, String password, String clientNumName, String clientAdressEng, String clientAdressRus) {
        this.login = login;
        this.password = password;
        this.clientNumName = clientNumName;
        this.clientAdressEng = clientAdressEng;
        this.clientAdressRus = clientAdressRus;
    }


    @Test
    public void successfulControllerTest() throws InterruptedException {


        System.out.println("Open login page");
        user.openLoginPage();
        Thread.sleep(500);
        System.out.println("Logging");
        user.checkLoginTitle();
        user.controllerButtonClick();
        Thread.sleep(400);

        System.out.println("Hide menu button");
        user.menuButtonClick();//button open menu
        Thread.sleep(400);
        user.menuButtonClick();//button close menu

        System.out.println("add order");
        user.addPaymentOrderButtonClickTest();
        user.nextStep();
        user.addOrder(clientNumName, clientAdressEng, clientAdressRus);
        user.nextStep();









        //wait after test's end
        Thread.sleep(400000);

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
