package test.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollBar {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\target\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9642564439");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("keerthi39@");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tops for women");
        driver.findElement(By.cssSelector(".vh79eN")).click();
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        Select obj=new Select(driver.findElement(By.xpath("//div[text()='SuperCoins Price']")));
        jse.executeScript("arguments[0].scrollIntoView(true);",obj);
        //Update the slide bar by updating the price
        Select obj2=new Select(driver.findElement(By.cssSelector("._1qKb_B")));
        obj2.selectByValue("Min");
        Select obj1=new Select(driver.findElement(By.cssSelector("._1YoBfV")));
        obj1.selectByValue("1000");

    }
}
