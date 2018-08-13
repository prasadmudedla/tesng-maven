package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.WebElementUtils.waitForElement;

public class HNLoggedOutPage extends BasePage{
    @FindBy(id = "logout")
    private WebElement logoutBtn;
    @FindBy(xpath = "//a[text()='login']")
    private WebElement loginBtn;


    public HNLoggedOutPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnLogout(){
        logoutBtn.click();
    }

    public void verifyLogout(){
        clickOnLogout();
        waitForElement(driver, loginBtn);
    }
}
