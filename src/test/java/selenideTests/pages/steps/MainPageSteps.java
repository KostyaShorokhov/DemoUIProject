package selenideTests.pages.steps;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
@SuppressWarnings("UnusedReturnValue")
public class MainPageSteps extends BaseSteps<MainPageSteps> {
    // тут будут методы работы с элементами вэб страницы
    public MainPageSteps checkText(String selector, String checkText){
        $(selector).shouldHave(Condition.text(checkText));
        return this;
    }
}
