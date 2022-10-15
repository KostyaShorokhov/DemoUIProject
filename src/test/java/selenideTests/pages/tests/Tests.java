package selenideTests.pages.tests;

import org.junit.jupiter.api.Test;
import selenideTests.pages.steps.MainPageSteps;
import selenideTests.pages.settings.Config;

import static selenideTests.pages.steps.Selectors.header;

public class Tests extends Config {
    @Test
    void example() {
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.openPage()
                    .checkText(header, "Продажа авто в России");
    }
}
