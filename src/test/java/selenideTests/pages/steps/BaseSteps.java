package selenideTests.pages.steps;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
@SuppressWarnings({"unchecked", "UnusedReturnValue"})
public abstract class BaseSteps<T extends BaseSteps<T>>  {
    public T openPage(){
        open(baseUrl);
        return (T) this;
    }
}
