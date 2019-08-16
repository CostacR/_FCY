package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import pages.LoginPage;
import pages.MainPage;

public class UserSteps extends ScenarioSteps {
    private LoginPage loginPage;
    private MainPage mainPage;

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

}
