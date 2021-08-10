package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

public class SecondTest extends TestBase {

    @Feature("CheckDeliveryPage")
    @Severity(SeverityLevel.MINOR)
    @Description("In this test we will check Secondary Site Sections")
    @Story("Scenario For Test Of Secondary Site Sections")
    @Test
    public void ScenarioForTesOfSecondarySiteSections() {
        main
                .goTo()
                .SelectCity();
        taskThreeTestSecondarySS.GoMainPage();
        taskThreeTestSecondarySS.ScrollToFooterMainPage()
                .CheckElementsInFooterSection()
                .GoToDeliverySiteSections()
                .GoMainPage()
                .ScrollToFooterMainPage()
                .GoToAboutSiteSections()
                .GoToContact()
                .GoToPartner()
                .GoMainPage()
                .GoToRulesPayInfo()
                .GoMainPage();
    }

}
