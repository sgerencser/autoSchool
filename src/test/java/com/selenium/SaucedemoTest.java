package com.selenium;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class SaucedemoTest {
    WebDriver driver = new FirefoxDriver();

    @BeforeEach
    public void setup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    @DisplayName("Login flow test")
    @Disabled
    public void loginTest(){
        WebElement loginField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        loginField.sendKeys("locked_out_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        assertDoesNotThrow(()-> driver.findElement(By.className("login_logo")));
        assertTrue(driver.findElement(By.cssSelector(".error-message-container > h3")).getText().contains("Epic sadface: Sorry, this user has been locked out."));
        driver.findElement(By.className("error-button")).click();
    }

    @Test
    @DisplayName("Checkout Flow Test")
    @Disabled
    public void checkoutTest() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        assertDoesNotThrow(() -> driver.findElement(By.id("inventory_container")));
        Select sortSelector = new Select(driver.findElement(By.className("product_sort_container")));
        sortSelector.selectByValue("lohi");
        ArrayList<WebElement> price = (ArrayList<WebElement>) driver.findElements(By.className("inventory_item_price"));
        ArrayList<String> actual = new ArrayList<>();
        for(WebElement e : price){
            actual.add(e.getText());
        }
       ArrayList<String> expected = new ArrayList<>(Arrays.asList("$7.99","$9.99","$15.99","$15.99","$29.99","$49.99"));
        assertEquals(actual,expected);
        driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Bolt T-Shirt')]/../../../div[@class='pricebar']/button")).click();
        assertTrue(driver.findElement(By.className("shopping_cart_badge")).getText().contains("1"));
        actual.clear();
        actual.add(driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Bolt T-Shirt')]")).getText());
        actual.add(driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Bolt T-Shirt')]/../../div[@class='inventory_item_desc']")).getText());
        actual.add(driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Bolt T-Shirt')]/../../../div[@class='pricebar']/div[@class='inventory_item_price']")).getText());
        driver.findElement(By.className("shopping_cart_link")).click();
        expected.clear();
        expected.add(driver.findElement(By.className("inventory_item_name")).getText());
        expected.add(driver.findElement(By.className("inventory_item_desc")).getText());
        expected.add(driver.findElement(By.className("inventory_item_price")).getText());
        assertEquals(actual,expected);
        driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
        assertThrows(NoSuchElementException.class, ()-> driver.findElement(By.className("shopping_cart_badge")));
        driver.findElement(By.id("continue-shopping")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Backpack')]/../../../div[@class='pricebar']/button")).click();
        expected.clear();
        actual.clear();
        expected.add(driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Backpack')]/../../../div[@class='pricebar']/div[@class='inventory_item_price']")).getText());
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Tes");
        driver.findElement(By.id("last-name")).sendKeys("Ter");
        driver.findElement(By.id("postal-code")).sendKeys("0000");
        driver.findElement(By.id("continue")).click();
        actual.add(driver.findElement(By.className("inventory_item_price")).getText());
        assertEquals(actual,expected);
        driver.findElement(By.id("finish")).click();
        assertDoesNotThrow(() -> driver.findElement(By.cssSelector("[alt='Pony Express']")));
    }
    @ParameterizedTest
    @CsvSource({"Test.allTheThings() T-Shirt (Red)", "Sauce Labs Fleece Jacket", "Sauce Labs Bike Light"})
    @DisplayName("Parametrized Test")
    public void paramTest(String item){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String expected = driver.findElement(By.xpath("//*[contains(text(),'"+ item +"')]/../../../div[@class='pricebar']/div[@class='inventory_item_price']")).getText();
        driver.findElement(By.xpath("//*[contains(text(),'"+ item +"')]/../../../div[@class='pricebar']/button")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        String actual = driver.findElement(By.className("inventory_item_price")).getText();
        assertEquals(expected,actual);
    }
    @AfterEach
    public void close(){
        driver.quit();
    }
}
