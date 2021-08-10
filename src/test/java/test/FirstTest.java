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
                .ClickGoTopButton()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()

                .MathRandomHead()
                .AssertElementsInMenu()
                .ScrollMenuToProductCards()
                .ClickGoTopButton()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()

                .MathRandomHead()
                .AssertElementsInMenu()
                .ScrollMenuToProductCards()
                .ClickGoTopButton()
                .ScrollMenuToProductCards()
                .ClickRandomCard()
                .GoToFiledBasket()

                .MathRandomHead()
                .AssertElementsInMenu()
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

}
