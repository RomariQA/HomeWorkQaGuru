import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork4Tests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void selenideWikiTabTest() {
        open("/selenide/selenide"); // открыли страницу
        $("#wiki-tab").click(); // перешли на вики
        $$(".internal.present").findBy(text("Soft assertions")).click(); // перешли на Soft assertions (проверка действием получается - иначе дальше упадет)
        $(".highlight.highlight-source-java.notranslate.position-relative.overflow-auto")
                .shouldHave(text("public class Tests {\n" +
                "  @Test\n" +
                "  public void test() {\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}")); //проверка
    }
}
