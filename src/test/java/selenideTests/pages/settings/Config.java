package selenideTests.pages.settings;

import com.codeborne.selenide.Selenide;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class Config {
    @BeforeAll
    public static void setUp(){
        // тут прописывается конфигурация для браузера, по умолчанию ставить последняя версия GoogleChrome
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/main/resources/log4j.properties");
        baseUrl = baseUrl();
    }

    @BeforeEach
    public void clearCache() {
        clearBrowserCache();
        clearBrowserCookies();
    }

    @AfterAll
    public static void tearDown(){
        Selenide.closeWebDriver();
    }

    private static String baseUrl() {
        // тут можешь задвать любой url сайта для теста в данном формате
        String url = "https://www.drom.ru/";
    return url;
    }

}
