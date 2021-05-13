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
        main.goTo();
        taskThreeTestSecondarySS.GoMainPage();
        taskSecondSendAnOrder.MathRandomHead()

                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()

                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()

                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()

                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()
                
                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()
                .MathRandomHead()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()



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
        main.goTo();
        taskThreeTestSecondarySS.ScrollToFooterMainPage()
                .CheckElementsInFooterSection()
                .GoToDeliverySiteSections()
                .GoMainPage()
                .CheckElementsInFooterSection()
                .GoToAboutSiteSections()
                .GoMainPage();

    }

}
