package settings;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
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
        String url = "https://www.drom.ru/"; // тут можешь задвать любой url сайта для теста в данном формате
    return url;
    }

}
