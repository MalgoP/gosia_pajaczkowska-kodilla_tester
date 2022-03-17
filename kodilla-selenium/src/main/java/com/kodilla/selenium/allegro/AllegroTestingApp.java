package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.get("https://allegro.pl/");

        WebElement button = driver.findElement(By.cssSelector("button[data-role='accept-consent']"));
        button.click();
        WebElement inputField = driver.findElement(By.tagName("input"));
        inputField.sendKeys("szczoteczka soniczna");
        inputField.submit();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("section>article")));
        List<WebElement> articleList = driver.findElements(By.cssSelector("section>article"));
        for (WebElement webElement : articleList) {
            System.out.println(webElement.getText());
        }
    }
}