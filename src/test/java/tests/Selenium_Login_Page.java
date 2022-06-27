package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Login_Page {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/dADsd.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();


        String homeCheckbox = "label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheck = driver.findElement(new By.ByCssSelector(homeCheckbox));
        homeCheck.click();


        homeCheck = driver.findElement(new By.ByCssSelector(homeCheckbox));

        String homeCheckboxClassName = homeCheck.getAttribute("class");

        if (homeCheckboxClassName.equals("rct-icon rct-icon-check")) {
            System.out.println("checkbox içi seçili!!!!!");
        } else {
            System.out.println("checkbox içi seçili değil!!!");
        }


    }
}

