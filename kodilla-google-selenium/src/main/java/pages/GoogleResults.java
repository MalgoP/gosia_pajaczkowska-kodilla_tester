package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> results;


    @FindBy(css = "div.g div.yuRUbf a:not(.fl)[href*=\"http\"]")
    private List<WebElement> resultLinks;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public void goToResult(int i) {
        resultLinks.get(i).click();
    }

    public int getResultsSize() {
        return resultLinks.size();
    }

    public boolean isClickable(int i) {
        return resultLinks.get(i).isDisplayed();
    }

    public String getResultUrl(int resultNumber) {
        return resultLinks.get(resultNumber).getAttribute("href");
    }
}