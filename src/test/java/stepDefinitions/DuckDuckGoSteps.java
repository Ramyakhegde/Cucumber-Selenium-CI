package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class DuckDuckGoSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("I open the browser")
    public void i_open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @When("I navigate to {string}")
    public void i_navigate_to(String url) {
        driver.get(url);
    }

    @And("I search for {string}")
    public void i_search_for(String searchTerm) {
        WebElement searchBox = driver.findElement(By.id("searchbox_input"));
        searchBox.sendKeys(searchTerm);
        searchBox.submit();
    }

    @Then("the page title should contain {string}")
    public void the_page_title_should_contain(String expectedTitle) {
        wait.until(ExpectedConditions.titleContains(expectedTitle));
        String actualTitle = driver.getTitle();
        System.out.println("Actual title: " + actualTitle);
        assertTrue("Page title does not contain expected text!", actualTitle.contains(expectedTitle));
        driver.quit();
    }
}




