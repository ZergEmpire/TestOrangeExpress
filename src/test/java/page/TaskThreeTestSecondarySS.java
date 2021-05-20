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

    public TaskThreeTestSecondarySS GoMainPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("i.fal.fa-chevron-up")));
        WebElement GoTop = driver.findElement(By.cssSelector("i.fal.fa-chevron-up"));
        GoTop.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"logo\")]")));
        WebElement Main = driver.findElement(By.xpath("//div[contains(@class, \"logo\")]"));
        Main.click();
        return this;
    }



    public TaskThreeTestSecondarySS ScrollToFooterMainPage() {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.id("footer"));
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public TaskThreeTestSecondarySS CheckElementsInFooterSection() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Политика конфиденциальности")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class,\"vk\")]")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class,\"inst\")]")));

        isElementByDisplayed(By.linkText("Политика конфиденциальности"));
        isElementByDisplayed(By.xpath("//a[contains(@class,\"vk\")]"));
        isElementByDisplayed(By.xpath("//a[contains(@class,\"inst\")]"));

        return this;
    }


    public TaskThreeTestSecondarySS GoToDeliverySiteSections() {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[contains(@class, \"f-nav\")]//*[contains(@href, \"/delivery\")]")));
        WebElement DeliveryPage = driver.findElement(By.xpath("//ul[contains(@class, \"f-nav\")]//*[contains(@href, \"/delivery\")]"));
        DeliveryPage.click();

        //Скролл до NavLink В хедере
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]")));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement NavLinkList = driver.findElement(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]"));
        je.executeScript("arguments[0].scrollIntoView(true);", NavLinkList);

        //Проверка верхней части сайта( Хедера ) На наличие элементов, характерных для хедера.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"scroll-nav-slider\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"scroll-nav-slider\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@data-text-render-id, \"callUsNumber\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@data-text-render-id, \"callUsNumber\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"curr-day\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"curr-day\")]"));

        //Проверка элементов характерных для Раздела с информацией о доставке
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"work-time\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"work-time\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"col-xl-2 col-lg-3\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"col-xl-2 col-lg-3\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.map-container")));
        isElementByDisplayed(By.cssSelector("div.map-container"));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Способы доставки')]")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Способы доставки')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //Скролл до NavLink В хедере
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]")));
        JavascriptExecutor jx = (JavascriptExecutor) driver;
        WebElement NavLinkList2 = driver.findElement(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]"));
        jx.executeScript("arguments[0].scrollIntoView(true);", NavLinkList2);
        return this;
    }

    public TaskThreeTestSecondarySS GoToAboutSiteSections() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[contains(@class, \"f-nav\")]//*[contains(@href, \"/about\")]")));
        WebElement AboutPage = driver.findElement(By.xpath("//ul[contains(@class, \"f-nav\")]//*[contains(@href, \"/about\")]"));
        AboutPage.click();

        //Скролл до NavLink В хедере
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]")));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement NavLinkList = driver.findElement(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]"));
        je.executeScript("arguments[0].scrollIntoView(true);", NavLinkList);

        //Проверка верхней части сайта( Хедера ) На наличие элементов, характерных для хедера.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"scroll-nav-slider\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"scroll-nav-slider\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@data-text-render-id, \"callUsNumber\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@data-text-render-id, \"callUsNumber\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"curr-day\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"curr-day\")]"));



        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"col-12 my-4\")]")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement TopScrollBox = driver.findElement(By.xpath("//div[contains(@class, \"col-12 my-4\")]"));
        js.executeScript("arguments[0].scrollIntoView(true);", TopScrollBox);
        isElementByDisplayed(By.xpath("//div[contains(@class, \"col-12 my-4\")]"));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, \"top-button\")]")));
        WebElement TopButton = driver.findElement(By.xpath("//a[contains(@class, \"top-button\")]"));
        TopButton.click();
        return this;

    }


    public TaskThreeTestSecondarySS GoToContact() {
       /* wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(@class, \"swiper-slide\")]//a[contains(@href, \"/contacts\")]")));*/
   /*     WebElement ElementContacts2 = driver.findElement(By.xpath("//li[contains(@class, \"swiper-slide\")]//a[contains(@href, \"/contacts\")]"));
        ElementContacts2.click();*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement GoContacts = driver.findElement(By.xpath("//li[contains(@class, \"swiper-slide\")]//a[contains(@href, \"/contacts\")]"));
        js.executeScript("arguments[0].click();", GoContacts);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [contains(@class, \"contacts-list\")]")));
        isElementByDisplayed(By.xpath("//div [contains(@class, \"contacts-list\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[contains(@class, \"fa-map-marker-alt\")]")));
        isElementByDisplayed(By.xpath("//i[contains(@class, \"fa-map-marker-alt\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[contains(@class, \"fa-phone-volume\")]")));
        isElementByDisplayed(By.xpath("//i[contains(@class, \"fa-phone-volume\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[contains(@class, \"fa-clock\")]")));
        isElementByDisplayed(By.xpath("//i[contains(@class, \"fa-clock\")]"));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [contains(@class, \"col-12 mb-5\")]")));
        isElementByDisplayed(By.xpath("//div [contains(@class, \"col-12 mb-5\")]"));
        isElementByDisplayed(By.xpath("//div[@id='map_canvas']"));

        //Скролл до NavLink В хедере
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]")));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement NavLinkList = driver.findElement(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]"));
        je.executeScript("arguments[0].scrollIntoView(true);", NavLinkList);

        WebElement ElementContacts = driver.findElement(By.cssSelector("li.swiper-slide.swiper-slide-next:nth-child(2)"));
        ElementContacts.click();



        //Проверка верхней части сайта( Хедера ) На наличие элементов, характерных для хедера.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"scroll-nav-slider\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"scroll-nav-slider\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@data-text-render-id, \"callUsNumber\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@data-text-render-id, \"callUsNumber\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"curr-day\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"curr-day\")]"));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [contains(@class, \"contacts-list\")]")));
        isElementByDisplayed(By.xpath("//div [contains(@class, \"contacts-list\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[contains(@class, \"fa-map-marker-alt\")]")));
        isElementByDisplayed(By.xpath("//i[contains(@class, \"fa-map-marker-alt\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[contains(@class, \"fa-phone-volume\")]")));
        isElementByDisplayed(By.xpath("//i[contains(@class, \"fa-phone-volume\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[contains(@class, \"fa-clock\")]")));
        isElementByDisplayed(By.xpath("//i[contains(@class, \"fa-clock\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [contains(@class, \"col-12 mb-5\")]")));
        isElementByDisplayed(By.xpath("//div [contains(@class, \"col-12 mb-5\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [contains(@id, \"map_canvas\")]")));
        isElementByDisplayed(By.xpath("//div [contains(@id, \"map_canvas\")]"));
        return this;

    }

    public TaskThreeTestSecondarySS GoToPartner() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement GoPartners = driver.findElement(By.xpath("//li[contains(@class, \"swiper-slide\")]//a[contains(@href, \"/partners\")]"));
        js.executeScript("arguments[0].click();", GoPartners);


        //Скролл до NavLink В хедере
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]")));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement NavLinkList = driver.findElement(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]"));
        je.executeScript("arguments[0].scrollIntoView(true);", NavLinkList);

        //Проверка верхней части сайта( Хедера ) На наличие элементов, характерных для хедера.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"scroll-nav-slider\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"scroll-nav-slider\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@data-text-render-id, \"callUsNumber\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@data-text-render-id, \"callUsNumber\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"curr-day\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"curr-day\")]"));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [contains(@class, \"col-12 section-title mb-4\")]")));
        isElementByDisplayed(By.xpath("//div [contains(@class, \"col-12 section-title mb-4\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [contains(@data-text-render-id, \"partnersText\")]")));
        isElementByDisplayed(By.xpath("//div [contains(@data-text-render-id, \"partnersText\")]"));


        return this;

    }




    public TaskThreeTestSecondarySS GoToRulesPayInfo() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[contains(@class, \"f-nav\")]//*[contains(@href, \"/rules\")]")));
        WebElement AboutPage = driver.findElement(By.xpath("//ul[contains(@class, \"f-nav\")]//*[contains(@href, \"/rules\")]"));
        AboutPage.click();

        //Скролл до NavLink В хедере
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]")));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement NavLinkList = driver.findElement(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]"));
        je.executeScript("arguments[0].scrollIntoView(true);", NavLinkList);

        //Проверка верхней части сайта( Хедера ) На наличие элементов, характерных для хедера.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"row align-items-center no-gutters\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"scroll-nav-slider\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"scroll-nav-slider\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@data-text-render-id, \"callUsNumber\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@data-text-render-id, \"callUsNumber\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"curr-day\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"curr-day\")]"));

        //Проверка характерных для раздела оплата элементов
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, \"payment-politic narrow\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@class, \"payment-politic narrow\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@data-text-render-id, \"paymentTable\")]")));
        isElementByDisplayed(By.xpath("//div[contains(@data-text-render-id, \"paymentTable\")]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[contains(@class, \"tab-link swiper-wrapper for-active\")]")));
        isElementByDisplayed(By.xpath("//ul[contains(@class, \"tab-link swiper-wrapper for-active\")]"));



        return this;
    }




}
