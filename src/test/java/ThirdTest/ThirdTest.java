package ThirdTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.By.name;

public class ThirdTest {
        public static void main(String[] Args){
       // System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
      //  ChromeDriver Driver = new ChromeDriver();
      //InternetExplorerDriver Driver = new InternetExplorerDriver();
        FirefoxDriver Driver = new FirefoxDriver();
        Driver.manage().window().maximize();
        Driver.get("http://localhost/litecart/admin/");

        WebElement UserNameField = Driver.findElement(By.name("username"));
        UserNameField.clear();
        UserNameField.sendKeys("admin");

        WebElement PasswordField = Driver.findElement(By.name("password"));
        PasswordField.clear();
        PasswordField.sendKeys("admin");

         WebElement LoginButton = Driver.findElement(By.name("login"));
         LoginButton.click();

         Driver.close();
}
}

