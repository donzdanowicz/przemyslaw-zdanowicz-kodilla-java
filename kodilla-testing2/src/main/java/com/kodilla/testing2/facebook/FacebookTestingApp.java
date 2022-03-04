package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_CREATE_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a[1]";
    public static final String XPATH_COOKIES_BUTTON = "//div[contains(@class, \"9xo5\")]//button[1]";
    public static final String XPATH_WAIT_FOR = "//div[contains(@class, \"9xo5\")]";
    public static final String XPATH_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";




    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed()) ;

        WebElement cookies = driver.findElement(By.xpath(XPATH_COOKIES_BUTTON));
        cookies.click();

        Thread.sleep(1000);

        WebElement register = driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT));
        register.click();

        Thread.sleep(1000);

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectDayCombo);
        selectDay.selectByIndex(19);

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectMonthCombo);
        selectMonth.selectByIndex(6);

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectYearCombo);
        selectYear.selectByIndex(19);

    }
}