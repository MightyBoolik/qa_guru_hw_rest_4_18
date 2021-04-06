package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class DemoWebShopUi extends TestBase {
    @Test
    @DisplayName("Succesful login test")
    void uILoginTest() {
        open("/login");
        $("#Email").val("bkuchaev@gmail.com");
        $("#Password").val("43315231").pressEnter();
        $(".account").shouldHave(text("bkuchaev@gmail.com"));
    }
}