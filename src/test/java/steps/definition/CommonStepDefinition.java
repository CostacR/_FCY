package steps.definition;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import steps.UserSteps;

public class CommonStepDefinition {

    @Steps
    private UserSteps userSteps;

    @Given("I open Login page")
    @Step
    public void openLoginPage(){
        userSteps.openLoginPage();
    }

    @When("I click on '$buttonCreateOrder' button")
    public void givenIClickOnCreateOrderButton(String clientNumName, String clientEngName, String clientAdressEng, String clientRusName, String clientAdressRus) throws InterruptedException {
        userSteps.addOrder(clientNumName, clientEngName, clientAdressEng, clientRusName, clientAdressRus);
    }

    @When("I click on 'nextStepOnPreorderPageButton' button")
    public void givenIClickOnNextStepOnPreoderPageButton(){
        userSteps.orderDetails();
    }

    @When("I click on '$buttonShowSWIFTButton' button")
    public void givenIClickShowSwiftButton(){
        userSteps.showSwift();
    }



}
