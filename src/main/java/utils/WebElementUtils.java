package utils;

import org.openqa.selenium.WebElement;


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
}
