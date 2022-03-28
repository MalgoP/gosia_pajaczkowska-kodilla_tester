package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.Random;

public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;
    private static GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void searchResults() {
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
    }

    public GoogleResults loadResults(WebDriver driver) {
        inputField.submit();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }

    public void goToResult(int i) {
        googleResults.goToResult(i);
    }

    public int getResultsSize() {
        return googleResults.getResultsSize();
    }

    public boolean isClickable(int resultNumber) {
        return googleResults.isClickable(resultNumber);
    }

    public String getResultUrl(int resultNumber) {
        return googleResults.getResultUrl(resultNumber);
    }
}