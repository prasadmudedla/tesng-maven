package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Config;

import static utils.WebElementUtils.waitForElement;
import static utils.WebElementUtils.enterText;

public class HNLoginPage extends BasePage{
    @FindBy(xpath = "//input[@type='text' and @autofocus='true']")
    private WebElement userName;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement pwd;

    @FindBy(xpath = "//b[text()='Login']")
    private WebElement loginLbl;

    @FindBy(xpath = "//input[@value='login']")
    private WebElement loginBtn;

    public HNLoginPage() {
        PageFactory.initElements(driver, this);
        verifyLoginPage();
    }

    public void verifyLoginPage(){
        waitForElement(driver, loginLbl);
    }

    public void clickOnLoginBtn(){
        loginBtn.click();
    }
    public HNAfterLoginPage logInToHN(){
        enterText(userName, Config.USERNAME);
        enterText(pwd, Config.PASSWORD);
        clickOnLoginBtn();

        return new HNAfterLoginPage();
    }

}
