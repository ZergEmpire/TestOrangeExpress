package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskTestLoginForm extends PageBase{
    public TaskTestLoginForm(WebDriver driver) {
        super(driver);
    }

    public void GoToLogin() {
        WebElement element = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]"));
        element.click();
    }

    public void VvodPhoneNumber() {
        WebElement element = driver.findElement(By.xpath("//input[@id='login-phone']"));
        element.sendKeys(PhoneNumberLogin);
    }
    public void ZabilPassword() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Забыли пароль? Получить новый.')]"));
        element.click();
    }
    public void ClickReCaptcha(){
        WebElement element = driver.findElement(By.xpath("//div[@id='recaptcha_div']"));
        element.click();
        }
    }


