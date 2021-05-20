package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Main extends PageBase {
    String SITE_URL = "https://pizza-sushi.com/"; /*https://nogai.ru/*/ /*https://sole.pizza/*/ /* http://nogai.mnogo.menu/*/
    public Main(WebDriver driver) {
        super(driver);
    }

    public Main goTo() {
        driver.get(SITE_URL);
        return this;
    }
    public Main SelectCity(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[contains(@class, \"city-select-list\")]//li ")));
        List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class, \"city-select-list\")]//li "));
        int i = (int) (Math.random() * list.size() - 1);
        wait.until(ExpectedConditions.elementToBeClickable(list.get(i)));
        list.get(i).click();

        return this;
    }
}


