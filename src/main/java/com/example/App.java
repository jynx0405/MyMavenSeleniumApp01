package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        // Initialize the ChromeDriver (Ensure you have the correct WebDriver path set)
        WebDriver driver = new ChromeDriver();
        
        try {
            // Open the URL and maximize the browser window
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            
            // Wait for 2 seconds before interacting with the page
            Thread.sleep(2000);
            
            // Find the username field and enter the username
            driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
            
            // Wait for 2 seconds
            Thread.sleep(2000);
            
            // Find the password field and enter the password
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            
            // Wait for 2 seconds
            Thread.sleep(2000);
            
            // Click the login button
            driver.findElement(By.id("login-button")).click();
            
            // Wait for 2 seconds after clicking the login button (optional, for observation)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("The thread was interrupted");
        } finally {
            // Close the browser after the operations
            driver.quit();
        }
    }
}
