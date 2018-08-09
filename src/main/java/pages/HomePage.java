package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.WebElementUtils.enterText;

public class HomePage extends BasePage {

    @FindBy(css = ".sbib_b #lst-ib")
    private WebElement search;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickSearchButton(){
        search.sendKeys(Keys.RETURN);
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

    public void enterSearchKey(String searchKey) {
        enterText(search, searchKey);
    }

    public SearchResultsPage searchWithWord(String searchKey) throws InterruptedException {
        enterSearchKey(searchKey);
        clickSearchButton();
        return new SearchResultsPage();
    }

}


