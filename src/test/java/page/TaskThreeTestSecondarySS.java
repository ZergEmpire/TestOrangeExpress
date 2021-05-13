package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class TaskThreeTestSecondarySS extends PageBase {
    public TaskThreeTestSecondarySS(WebDriver driver) {
        super(driver);
    }

/*    public TaskSecondSendAnOrder GoToMenuRoll() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Роллы')]"));
        element.click();
        return this;
    }*/

    public TaskThreeTestSecondarySS ClickRandomCard (){

        List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class, \"productBox\") and not(contains(@class, \"in-stop-list\")) and not (contains(@class, \"action-wrapper\"))]"));
        int i = (int) (Math.random() * list.size());
        list.get(i).click();

        isElementByDisplayed(By.xpath("//span[contains(text(),'Энерг. ценность')]"));
        isElementByDisplayed(By.xpath("//span[contains(text(),'Белки')]"));
        isElementByDisplayed(By.xpath("//span[contains(text(),'Жиры')]"));
        isElementByDisplayed(By.xpath("//span[contains(text(),'Углеводы')]"));
        isElementByDisplayed(By.xpath("//span[contains(text(),'Вес')]"));
        WebElement elementButton = driver.findElement(By.linkText("В корзину"));
        elementButton.click();
        return this;
    }

    public TaskThreeTestSecondarySS ScrollMenuToProductCards(){
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//div[contains(@class, \"productBox\") and not(contains(@class, \"in-stop-list\"))]"));
        je.executeScript("arguments[0].scrollIntoView(true);",element);
        return this;
    }

   /* public TaskSecondSendAnOrder ScrollToElement1(String element) {
        List<WebElement> list = driver.findElements(By.className("price"));
        int i = (int) (Math.random() * list.size());
        list.get(i).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].click();",webElement);
        return this;
    }*/

    //Идём в корзину
    public TaskThreeTestSecondarySS GoToFiledBasket() {
        WebElement webElement = driver.findElement(By.cssSelector("a.btn.btn-basket"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", webElement);
        return this;
    }

    public TaskThreeTestSecondarySS FillInFields() {
        //Заполнить имя
        WebElement Name = driver.findElement(By.id("order_name"));
        Name.sendKeys(TestName);
        //Заполнить Тестовый телефон
        WebElement TestPhone = driver.findElement(By.id("order_phone"));
        TestPhone.sendKeys(TestPhoneNumberLogin);
        //Заполнить Тестовый email
        WebElement TestEmail = driver.findElement(By.id("order_email"));
        TestEmail.sendKeys(TestEmailAddress);
        //Заполнить Адрес (который располагается на карте)
        WebElement Address1 = driver.findElement(By.id("order_street"));
        Address1.sendKeys(AddressStreet);
        //Заполнить Номер дома( Который располагается на карте)
        WebElement Address2 = driver.findElement(By.id("order_house"));
        Address2.sendKeys(AddressHome);
        //Заполнить поле комментарий.
        WebElement Address3 = driver.findElement(By.id("order_comment"));
        Address3.sendKeys(OrderComment);
        return this;
    }

    public TaskThreeTestSecondarySS selectPayType(){

        WebElement paymentTitle = driver.findElement(By.cssSelector(".payment-title"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",paymentTitle);
        WebElement HowGetMoneyCourier = driver.findElement(By.cssSelector("#change"));
         HowGetMoneyCourier.click();
         HowGetMoneyCourier.clear();
        HowGetMoneyCourier.sendKeys(howMoneyToCourier);
        return this;
    }

    public TaskThreeTestSecondarySS SendOrder() {
        WebElement GoSendOrder = driver.findElement(By.xpath("//button[@id='sendOrder']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",GoSendOrder);  /* .scrollIntoView(true)*/
        GoSendOrder.click();
        /*GoSendOrder.click();*/
        wait.until(ExpectedConditions.urlContains("http://nogai.mnogo.menu/order/complete/"));
        isElementByDisplayed(By.xpath("//b[contains(text(),'Информация о заказе')]"));
        return this;
    }

    public TaskThreeTestSecondarySS FuckingClick(){
        WebElement FuckClick = driver.findElement(By.className("mfp-wrap mfp-close-btn-in mfp-auto-cursor my-mfp-zoom-in mfp-ready"));
        FuckClick.click();
        return this;
    }


    public void MathRandomHead (){
        List<WebElement> list = driver.findElements(By.className("scroll-nav_link"));
        int i = (int) (Math.random() * list.size());
        list.get(i).click();
    }
    public void CheckStatusOrder(){
        isElementByDisplayed(By.xpath("//span[contains(text(),'Принят')]"));
    }

    public  TaskThreeTestSecondarySS ScrollToFooterMainPage(){
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//body/main[@id='panel']/div[@id='app']/footer[@id='footer']/div[1]/div[1]/div[1]"));
        je.executeScript("arguments[0].scrollIntoView(true);",element);
        return this;
    }
    public TaskThreeTestSecondarySS CheckElementsInFooterSection(){
        isElementByDisplayed(By.xpath("//body/main[@id='panel']/div[@id='app']/footer[@id='footer']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/img[1]"));
        isElementByDisplayed(By.xpath("//a[contains(text(),'Политика конфиденциальности')]"));
        isElementByDisplayed(By.xpath("//body/main[@id='panel']/div[@id='app']/footer[@id='footer']/div[2]/div[2]/div[1]/div[2]/ul[1]"));
        isElementByDisplayed(By.xpath("//body/main[@id='panel']/div[@id='app']/footer[@id='footer']/div[2]/div[2]/div[1]/div[1]/ul[1]"));
        return this;
    }
    public  TaskThreeTestSecondarySS GoToDeliverySiteSections() {
        WebElement DeliveryPage = driver.findElement(By.xpath("//body/main[@id='panel']/div[@id='app']/footer[@id='footer']/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
        DeliveryPage.click();
        isElementByDisplayed(By.cssSelector("div.work-time"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Способы доставки')]"));
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }
        public  TaskThreeTestSecondarySS GoToAboutSiteSections() {
            WebElement AboutPage = driver.findElement(By.xpath("//body/main[@id='panel']/div[@id='app']/footer[@id='footer']/div[2]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
            AboutPage.click();
            isElementByDisplayed(By.xpath("//body/main[@id='panel']/div[@id='app']/section[@id='full-content']/section[@id='static']/div[2]/div[1]/div[1]/div[1]"));
            JavascriptExecutor js = (JavascriptExecutor) driver;

            return this;

    }
        public  TaskThreeTestSecondarySS GoMainPage() {
            WebElement GoTop = driver.findElement(By.cssSelector("i.fal.fa-chevron-up"));

            GoTop.click();
            WebElement Main = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
            Main.click();
            return this;
        }



}
