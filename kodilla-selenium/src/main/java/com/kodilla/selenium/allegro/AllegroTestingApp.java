package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement button = driver.findElement(By.cssSelector("button[data-role='accept-consent']"));
        button.click();
        WebElement labelCombo = driver.findElement(By.xpath("//select[1]"));
        Select categorySelect = new Select(labelCombo);
        categorySelect.selectByIndex(3);
        WebElement inputField = driver.findElement(By.cssSelector("input[placeholder='czego szukasz?']"));
        inputField.sendKeys("Mavic mini");
        WebElement buttonSearch = driver.findElement(By.cssSelector("button[data-role='search-button']"));
        buttonSearch.click();
    }
}