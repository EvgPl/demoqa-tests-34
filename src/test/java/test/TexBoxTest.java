package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TexBoxTest {

        @BeforeAll
        static void beforeAll() {
            Configuration.browserSize = "1920x1080";
            Configuration.pageLoadStrategy = "eager";
            Configuration.baseUrl = "https://demoqa.com";
            Configuration.holdBrowserOpen = true;
        }

        @Test
        void fillFormTest() {
            open("/text-box");
            $("#userName").setValue("Eugene");
            $("#userEmail").setValue("Pleso@gmail.com");
            $("#currentAddress").setValue("Some street 1");
            $("#permanentAddress").setValue("Another sreet 1");
            $("#submit").click();

            $("#output").$("#name").shouldHave(text("Eugene"));
            $("#output").$("#email").shouldHave(text("Pleso@gmail.com"));
            $("#currentAddress", 1).shouldHave(text("Some street 1"));
            $("#output #permanentAddress").shouldHave(text("Another sreet 1"));
        }
}
