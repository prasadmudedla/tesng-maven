package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import utils.Config;
import utils.DriverFactory;

import static utils.Config.SEARCHKEY;

public class SearchTest {

        public HomePage homePage;
        public SearchResultsPage SearchResultsPage;

        @BeforeTest(alwaysRun = true)
        public void setUp() {
            WebDriver driver = DriverFactory.getDriver();
            String baseUrl = Config.URL;
            driver.get(baseUrl);
        }

        @Test
        public void verifyHomePage() throws InterruptedException {
            homePage = new HomePage();
            homePage.searchWithWord(SEARCHKEY);
        }

    @AfterTest(alwaysRun = true)
    public void tearDown(){
        DriverFactory.closeDriver();

    }

}
