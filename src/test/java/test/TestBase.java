package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.*;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestBase {
       public WebDriver driver;
       public Main main;

       public TaskSecondSendAnOrder taskSecondSendAnOrder;
       public TaskTestLoginForm taskTestLoginForm;
       public TaskThreeTestSecondarySS taskThreeTestSecondarySS;

        //Сюда операции выполняющиеся перед стартом теста
        @BeforeEach
        public void start(){



            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            main = PageFactory.initElements(driver, Main.class);

            taskSecondSendAnOrder = PageFactory.initElements(driver, TaskSecondSendAnOrder.class);
            taskTestLoginForm = PageFactory.initElements(driver, TaskTestLoginForm.class);
            taskThreeTestSecondarySS = PageFactory.initElements(driver, TaskThreeTestSecondarySS.class);
        }


        //Сюда то, что выполняется после выполнения теста
        @AfterEach
        public void finish(){
            driver.quit();
       }

    }

