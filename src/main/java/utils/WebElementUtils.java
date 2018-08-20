package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebElementUtils {

        public static void enterText(WebElement element, String text){
            element.click();
            element.clear();
            element.sendKeys(text);
        }

        public static void waitForElement() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }

        public static void waitForElement(WebDriver dr, WebElement element){
            new WebDriverWait(dr, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.tagName(element.getTagName()))).isDisplayed();
        }
}
