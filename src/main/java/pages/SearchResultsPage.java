package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".sbico-c")
    private WebElement searchOnResultsPageButton;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

}
