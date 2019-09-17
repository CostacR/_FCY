package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreviewPageStep extends PageObject {

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

}
