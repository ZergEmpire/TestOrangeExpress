package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PageBase {
    public WebDriver driver;
    public WebDriverWait wait;
    String PhoneNumberLogin = "+79969797537";
    String TestName = "Test";
    String TestEmailAddress = "test@test.ru";
    String TestPhoneNumberLogin = "+7";
    String AddressStreet = "улица Говорова, Одинцово";
    String AddressHome = "85";
    String OrderComment = "Тест. Не готовить";
    String howMoneyToCourier = "5000";



    //Constructor
    public PageBase(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public void SearchElementNavLink() {

        driver.findElements(By.className("scroll-nav_link"));
    }

    //wait Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //click Method
    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void isElementByDisplayed(By elementBy) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

}
