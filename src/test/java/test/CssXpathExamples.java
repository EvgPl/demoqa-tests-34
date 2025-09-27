package test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpath() {
        //<input autocomplete="off" placeholder="name@example.com" type="email" id="userEmail" class="mr-sm-2 form-control">
        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");
        $x("//*[@data-testid='email']").setValue("1");


        $("[id=email]").setValue("1");
        $(by("id", "email")).setValue("1");
        $(byId("email")).setValue("1");
        $("#email").setValue("1");
        $x("//*[@id='email']").setValue("1");

        $("[name=email]").setValue("1");
        $(by("name", "email")).setValue("1");
        $(byName("name")).setValue("1");
        $x("//*[@name='email']").setValue("1");

        $("[class=mr-sm-2][class=form-control]").setValue("1");
        $(".mr-sm-2.form-control").setValue("1");
        $(".form-control").setValue("1");
        $("input.mr-sm-2.form-control").setValue("1");
        $x("//input[@class='mr-sm-2'][@class='form-control']").setValue("1");

        //<div class=mr-sm-2>
                //<input type="email"  class="mr-sm-2 form-control">
        $(".mr-sm-2 .form-control").setValue("1");
        $(".mr-sm-2").$(".form-control").setValue("1");
        $("div.mr-sm-2").$("input.form-control").setValue("1");
        $("div.mr-sm-2 input.form-control").setValue("1");

        //Поиск по тексту
        // <div>Hello, qa.guru!</div>

        $(byText((byText("Hello, qa.guru!"));
        $(withText("llo, qa.g")); //поиск по части текста
        $x("//*[text()='Hello, qa.guru!']"); // плохой пример
        $x("//*[contains(text()='Hello, qa.guru!')]"); // правильный

    }
 }
