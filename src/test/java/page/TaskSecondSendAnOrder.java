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


public class TaskSecondSendAnOrder extends PageBase {
    public TaskSecondSendAnOrder(WebDriver driver) {
        super(driver);
    }

/*    public TaskSecondSendAnOrder GoToMenuRoll() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Роллы')]"));
        element.click();
        return this;
    }*/



    public TaskSecondSendAnOrder ClickRandomCard (){

        List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class, \"productBox\") and not(contains(@class, \"in-stop-list\")) and not (contains(@class, \"action-wrapper\"))]"));
        int i = (int) (Math.random() * list.size() - 1);
        wait.until(ExpectedConditions.elementToBeClickable(list.get(i)));
        list.get(i).click();


        WebElement elementButton = driver.findElement(By.xpath("//a[contains(text(), ' корзину')]"));
        elementButton.click();
        return this;
    }
    /*wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, \"productBox\") and not(contains(@class, \"in-stop-list\")) and not (contains(@class, \"action-wrapper\"))]")));*/


    public TaskSecondSendAnOrder ScrollMenuToProductCards(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, \"productBox\")]")));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//div[contains(@class, \"productBox\")]"));
        je.executeScript("arguments[0].scrollIntoView(true);",element);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div [contains(@class, \"productBox\" )]//div[contains(@class, \"image\" )]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div [contains(@class, \"productBox\" )]//div[contains(@class, \"bottom\" )]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div [contains(@class, \"productBox\" )]//div[contains(@class, \"bottom\" )]//div[contains(@class, \"price\" )]")));
        return this;
    }

    public TaskSecondSendAnOrder AssertElementsInMenu (){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, \"productBox\")]")));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement TitleElement = driver.findElement(By.xpath("//div[contains(@class, \"mt-lg-4 mt-2\")]"));
        je.executeScript("arguments[0].scrollIntoView(true);",TitleElement);
        isElementByDisplayed(By.xpath("//div[contains(@class, \"mt-lg-4 mt-2\")]"));
        /*isElementByDisplayed(By.xpath("//div[contains(@class, \"btn-basket\")]"));*/
        return this;
    }



    //Идём в корзину
    public TaskSecondSendAnOrder GoToFiledBasket() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class, \"btn-basket\")]")));
        WebElement webElement = driver.findElement(By.xpath("//a[contains(@class, \"btn-basket\")]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", webElement);
        return this;
    }

    public TaskSecondSendAnOrder FillInFields() {
        //Заполнить имя
        wait.until(ExpectedConditions.elementToBeClickable(By.id("order_name")));
        WebElement Name = driver.findElement(By.id("order_name"));
        Name.clear();
        Name.sendKeys(TestName);
        //Заполнить Тестовый телефон
        wait.until(ExpectedConditions.elementToBeClickable(By.id("order_phone")));
        WebElement TestPhone = driver.findElement(By.id("order_phone"));
        TestPhone.clear();
        TestPhone.sendKeys(TestPhoneNumberLogin);
        //Заполнить Тестовый email
        wait.until(ExpectedConditions.elementToBeClickable(By.id("order_email")));
        WebElement TestEmail = driver.findElement(By.id("order_email"));
        TestEmail.clear();
        TestEmail.sendKeys(TestEmailAddress);
        //Заполнить Адрес (который располагается на карте)
        wait.until(ExpectedConditions.elementToBeClickable(By.id("order_street")));
        WebElement Address1 = driver.findElement(By.id("order_street"));
        Address1.clear();
        Address1.sendKeys(AddressStreet);
        //Заполнить Номер дома( Который располагается на карте)
        wait.until(ExpectedConditions.elementToBeClickable(By.id("order_house")));
        WebElement Address2 = driver.findElement(By.id("order_house"));
        Address2.clear();
        Address2.sendKeys(AddressHome);
        //Заполнить поле комментарий.
        wait.until(ExpectedConditions.elementToBeClickable(By.id("order_comment")));
        WebElement Address3 = driver.findElement(By.id("order_comment"));
        Address3.clear();
        Address3.sendKeys(OrderComment);
        return this;
    }

    public  TaskSecondSendAnOrder selectPayType(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = \"pay-method\"]")));
        WebElement paymentTitle = driver.findElement(By.xpath("//div[@class = \"pay-method\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",paymentTitle);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = \"pay-method\"]//input[@id = \"change\"]")));
        WebElement HowGetMoneyCourier = driver.findElement(By.xpath("//div[@class = \"pay-method\"]//input[@id = \"change\"]"));
         HowGetMoneyCourier.click();
         HowGetMoneyCourier.clear();
        HowGetMoneyCourier.sendKeys(howMoneyToCourier);
        return this;
    }

    public TaskSecondSendAnOrder SendOrder() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='sendOrder']")));
        WebElement GoSendOrder = driver.findElement(By.xpath("//button[@id='sendOrder']"));
        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click[1];",GoSendOrder);  *//* .scrollIntoView(true)*/
        GoSendOrder.click();
        wait.until(ExpectedConditions.urlContains("/complete/"));
        isElementByDisplayed(By.xpath("//b[contains(text(),'Информация о заказе')]"));
        return this;
    }

/*    public TaskSecondSendAnOrder FuckingClick(){
        WebElement FuckClick = driver.findElement(By.className("mfp-wrap mfp-close-btn-in mfp-auto-cursor my-mfp-zoom-in mfp-ready"));
        FuckClick.click();
        return this;
    }*/


    public TaskSecondSendAnOrder MathRandomHead (){
        List<WebElement> list = driver.findElements(By.xpath("//a[contains(@class, \"scroll-nav_link\") and not (contains(@href, \"/menu/pizza\")) and not (contains(@href, \"/menu/deserty\"))]"));
        int i = (int) (Math.random() * list.size());
        list.get(i).click();
        return this;
    }
/*    public TaskSecondSendAnOrder ClickDesert (){
        WebElement desert = driver.findElement(By.xpath("//span[contains(text(), 'Десерты')]"));
        desert.click();
        return this;
    }*/


    public TaskSecondSendAnOrder CheckStatusOrder(){
        isElementByDisplayed(By.xpath("//span[contains(text(),'Принят')]"));
        return this;
    }

    public TaskSecondSendAnOrder ClickGoTopButton (){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \"top-button\")]")));
        WebElement TopButton = driver.findElement(By.xpath("//a[contains(@class, \"top-button\")]"));
        TopButton.click();
        return this;
    }

}
