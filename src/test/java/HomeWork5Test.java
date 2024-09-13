import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork5Test {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void openEnterprise (){
        String baseUrl = Configuration.baseUrl;
        open(baseUrl);
        $(".HeaderMenu-nav").$(byText("Solutions")).hover();
        $(byLinkText("Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered\ndeveloper platform."));
    }
}
