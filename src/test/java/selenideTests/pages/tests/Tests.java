package selenideTests.pages.tests;

import org.junit.jupiter.api.Test;
import selenideTests.pages.steps.MainPageSteps;
import selenideTests.pages.settings.Config;

import static selenideTests.pages.steps.Selectors.header;

public class Tests extends Config {
    // тут можно писать тесты на любые страницы, но лучше граничить их, один тестовый класс на функицонал
    @Test
    void example() {
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.openPage()
                    .checkText(header, "Продажа авто в России");
    }
}
