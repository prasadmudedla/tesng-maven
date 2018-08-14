package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HNLoggedOutPage;
import pages.HNLoginPage;
import pages.HackerNewsLandingPage;
import pages.YCHomePage;
import utils.Config;
import utils.DriverFactory;


public class YCDemo {
    public YCHomePage ycHomePage;


    @BeforeTest(alwaysRun = true)
    public void setUp() {
        WebDriver driver = DriverFactory.getDriver();
        String baseUrl = Config.YC_URL;
        driver.get(baseUrl);
    }

    @Test
    public void test01_VerifyHomePage() {
        ycHomePage = new YCHomePage();
        ycHomePage.verifyYCHome();
    }

    @Test
    public void test02_HackerNewsLandingPage() throws InterruptedException {
        ycHomePage = new YCHomePage();
        ycHomePage.navigateToHackerNews();
    }

    @Test
    public void test03_HackerNewsLoginPage(){
        HackerNewsLandingPage hnLandingPage = new HackerNewsLandingPage();
        hnLandingPage.navigateToLoginPage();
    }

    @Test
    public void test04_AfterLoginPage(){
        HNLoginPage hnLoginPage = new HNLoginPage();
        hnLoginPage.logInToHN();
    }

    @Test
    public void test05_LoggedOut(){
        HNLoggedOutPage hnLoggedOutPage = new HNLoggedOutPage();

        hnLoggedOutPage.verifyLogout();

    }


    @AfterTest(alwaysRun = true)
    public void tearDown(){
        DriverFactory.closeDriver();

    }
}
