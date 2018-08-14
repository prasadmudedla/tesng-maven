package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.WebElementUtils.waitForElement;

public class YCHomePage extends BasePage {

    @FindBy(xpath = "//a[@class='about']")
    private WebElement about;

    @FindBy(xpath = "//h2[text()=' Hacker News ']")
    private WebElement hackerNewsBtn;

    public YCHomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickHackerNewsBtn(){
        hackerNewsBtn.click();
    }

    public void refreshPage(){ driver.navigate().refresh(); }

    public void verifyYCHome(){
        waitForElement(driver, about);
    }

    public void scrollToHNLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(hackerNewsBtn);
        actions.perform();
    }

    public HackerNewsLandingPage navigateToHackerNews() throws InterruptedException {

        scrollToHNLink();
        waitForElement();
        clickHackerNewsBtn();
        return new HackerNewsLandingPage();
    }

}