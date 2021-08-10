package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Date;
import java.util.Map;
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

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "chrome");
            capabilities.setCapability("browserVersion", "91.0");
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            RemoteWebDriver driver = null;
            try {
                driver = new RemoteWebDriver(
                        new URL("http://192.168.1.17:8080/wd/hub"),
                        capabilities
                );
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            /*WebDriverManager.chromedriver().setup();*/

            /* driver = new ChromeDriver();*/

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            main = PageFactory.initElements(driver, Main.class);

            taskSecondSendAnOrder = PageFactory.initElements(driver, TaskSecondSendAnOrder.class);
            taskTestLoginForm = PageFactory.initElements(driver, TaskTestLoginForm.class);
            taskThreeTestSecondarySS = PageFactory.initElements(driver, TaskThreeTestSecondarySS.class);
        }


    //Сюда то, что выполняется после выполнения теста

}
