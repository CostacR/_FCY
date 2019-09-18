package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import pages.*;

public class UserSteps extends ScenarioSteps {
    private LoginPage loginPage;
    private MainPage mainPage;
    private ClientSelectStep createOrderPage;
    private MainInformationStep mainInformationStep;
    private ContractorStep contractorStep;
    private PreviewPageStep previewPageStep;

    @Step
    public void openLoginPage(){
        System.out.println("Open login page");
        loginPage.open();
    }
    @Step
    public void checkLoginPage(){

    }
    @Step
    public void checkLoginTitle(){
        System.out.println("Logging");
        loginPage.getTitle();


    }

    @Step
    public void controllerButtonClick(){
        loginPage.controllerlogInButtonButtonClick();
    }

    @Step
    public void nideMenuButtonClick() throws InterruptedException {
        mainPage.hideMenuButtonClick();
    }

    @Step
    public void lookSwiftOrderButtonClickTest() throws InterruptedException {
        mainPage.lookSwiftOrderButtonClick();
        Thread.sleep(500);

    }

    @Step
    public void listAllPaymentOrderButtonClickTest() throws InterruptedException {
        mainPage.listAllPaymentOrderButtonClick();
        Thread.sleep(500);
        }

    @Step
    public void addPaymentOrderButtonClickTest() throws InterruptedException {
        System.out.println("add order");
        mainPage.addPaymentOrderButtonClick();
        Thread.sleep(300);
    }

    @Step
    public void nextStep(){

        createOrderPage.nextStepButtonClick();
    }

    @Step
    public void selectClientStep(){

    }

    public void showSwift() {
    }

    public void orderDetails() {
    }

    public void menuButtonClick() {
        mainPage.menuButtonClick();
    }




    @Step
    public void addOrder(String clientNumName, String clientEngName, String clientAdressEng, String clientRusName, String clientAdressRus) throws InterruptedException {
        createOrderPage.searchClient(clientNumName);
        Thread.sleep(300);
        System.out.println("Create order");
//        createOrderPage.checkboxRusVClickTest();//нет id
        Thread.sleep(200);
        System.out.println("Select client");
        createOrderPage.clientNameEngConfirm(clientEngName);
        createOrderPage.clientAdressEngConfirm(clientAdressEng);
//        createOrderPage.clientNameRusConfirm(clientRusName);
//        createOrderPage.clientAdressRusConfirm(clientAdressRus);

    }

    @Step
    public void addMainInformations(String numberOrder, String orderIBANnumber, String sumOrder, String startDate, String finishDate, String indexCurrency) throws InterruptedException {
        System.out.println("Main informations");
        mainInformationStep.mainInformationsFillForm(numberOrder, orderIBANnumber, sumOrder,  startDate,  finishDate,  indexCurrency);
    }

    public void addContractor(String contractorName, String contractorTaxCode, String contractorAdress) throws InterruptedException {
        System.out.println("add Contractor ");
        contractorStep.contractorNewFillForm( contractorName,  contractorTaxCode,  contractorAdress);
        contractorStep.addContractorBankDetailsButtonClick();
        contractorStep.searchContractroBankDetail();
    }

    public void addContractorBySearch() throws InterruptedException {
        System.out.println("add by search");
        contractorStep.contractorSearchFillForm();
    }

    public void saveOrderPreviewPage() throws InterruptedException {
        System.out.println(88);
        previewPageStep.saveOrder();
    }
}
