package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void FirstTest() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.delivery-club.ru/moscow");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Доставка еды из ресторанов Москвы за 15-30 минут! Delivery Club"));
        driver.quit();
    }
}
