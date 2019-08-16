package tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import pages.LoginPage;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class FcyLoginTest extends BaseTest {
    @TestData
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                //"login", "Password"
                {"", ""},//данные для dataProvider Controller
//                {"", ""},//данные для dataProvider Supervisor
//                {"", ""},//данные для dataProvider adminFCY
        });
    }

    private String login;
    private String password;

    public FcyLoginTest(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Test
    public void successfulControllerTest() throws InterruptedException {

        user.openLoginPage();
        Thread.sleep(500);
        user.checkLoginTitle();
        user.controllerButtonClick();
        Thread.sleep(400);
        user.menuButtonClick();//button open menu
        Thread.sleep(400);
        user.menuButtonClick();//button close menu
        user.addPaymentOrderButtonClickTest();







        //wait after test's end
        Thread.sleep(40000);

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
