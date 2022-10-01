package tests;

import org.junit.jupiter.api.Test;
import pages.MainPageSteps;
import settings.Config;

import static pages.Selectors.header;

public class Tests extends Config {
    @Test
    void example() {
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.openPage();
        mainPageSteps.checkText(header, "Продажа авто в России");
    }
}
