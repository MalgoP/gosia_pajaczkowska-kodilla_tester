import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearch;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestGoogle {

    WebDriver driver;

    @BeforeEach
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebElement button = driver.findElement(By.id("L2AGLb"));
        button.click();
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        Random random = new Random();
        while (true){
            int randomLinkNumber = random.nextInt(googleSearch.getResultsSize());
            if(googleSearch.isClickable(randomLinkNumber)) {
                String url = googleSearch.getResultUrl(randomLinkNumber);
                googleSearch.goToResult(randomLinkNumber);
                String currentUrl = driver.getCurrentUrl();
                String searchResultUrlDomainAddress = findDomainAddress(url);
                String currentUrlDomainAddress = findDomainAddress(currentUrl);
                Assertions.assertEquals(searchResultUrlDomainAddress,currentUrlDomainAddress);
                break;
            }
        }
    }

    private String findDomainAddress(String url){
        Pattern pattern = Pattern.compile("https?://([a-zA-Z0-9_\\-\\.]*)/");
        Matcher matcher = pattern.matcher(url);
        boolean matchFound = matcher.find();
        if(matchFound){
            return matcher.group(1);
        }else{
            return null;
        }
    }
}