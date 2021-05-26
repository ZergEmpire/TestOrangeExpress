package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

public class FirstTest extends TestBase {
    @Epic("TestCase")
    @Feature("FirstScenarioSendOrder")
    @Severity(SeverityLevel.BLOCKER)
    @Description("In this test we will check send order")
    @Story("Scenario For Test Send Order")
    @Test
    public void ScenarioForTestSendOrder() {
        main
                .goTo()
                .SelectCity();
        taskThreeTestSecondarySS.GoMainPage();
        taskSecondSendAnOrder
                .MathRandomHead()
                .AssertElementsInMenu()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ClickGoTopButton()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()
                .AssertElementsInMenu()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ClickGoTopButton()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()
                .AssertElementsInMenu()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ClickGoTopButton()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()
                .AssertElementsInMenu()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ScrollMenuToProductCards()
                .ClickGoTopButton()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()

                .FillInFields()
                .selectPayType()
                .SendOrder()
                .CheckStatusOrder();

    }
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
