package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import pages.CreateOrderPage;
import pages.LoginPage;
import pages.MainPage;

public class UserSteps extends ScenarioSteps {
    private LoginPage loginPage;
    private MainPage mainPage;
    private CreateOrderPage createOrderPage;

    @Step
    public void openLoginPage(){
        loginPage.open();
    }
    @Step
    public void checkLoginPage(){

    }
    @Step
    public void checkLoginTitle(){
        loginPage.getTitle();


    }

    @Step
    public void controllerButtonClick(){
        loginPage.controllerlogInButtonButtonClick();
    }

    @Step
    public void menuButtonClick() throws InterruptedException {
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
        mainPage.addPaymentOrderButtonClick();
        Thread.sleep(500);
    }

    @Step
    public void nextStep(){
        createOrderPage.nextStepButtonClick();
    }

    @Step
    public void addOrder(String clientNumName, String clientAdressEng, String clientAdressRus) throws InterruptedException {
        createOrderPage.searchClient(clientNumName);
        Thread.sleep(100);
        createOrderPage.clientAdressEngConfirm(clientAdressEng);
        createOrderPage.clientAdressRusConfirm(clientAdressRus);

    }

    @Step
    public void selectClientStep(){

    }
}
