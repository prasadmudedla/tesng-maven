package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.WebElementUtils.waitForElement;

public class HNAfterLoginPage extends BasePage {
    @FindBy(id = "logout")
    private WebElement logoutBtn;

    public HNAfterLoginPage(){
        PageFactory.initElements(driver, this);
        verifyAfterLoginPage();
    }

    private void verifyAfterLoginPage() {
        waitForElement(driver, logoutBtn);
    }
}
