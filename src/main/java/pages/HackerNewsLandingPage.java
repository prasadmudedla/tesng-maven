package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.WebElementUtils.waitForElement;

public class HackerNewsLandingPage extends BasePage {
    @FindBy(xpath = "//a[text()='login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//a[text()='Hacker News']")
    private WebElement hnImageBtn;

    public HackerNewsLandingPage() {
        PageFactory.initElements(driver, this);
        verifyHNLandingPage();
    }

    public void verifyHNLandingPage() {
        waitForElement(driver, hnImageBtn);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }

    public HNLoginPage navigateToLoginPage(){
        clickLoginBtn();
        return new HNLoginPage();
    }
}
