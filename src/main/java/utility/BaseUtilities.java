package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pompages.CareerPage;

import java.time.Duration;

public class BaseUtilities {
    public static WebDriver driver;
    public CareerPage cg;
    public void startup()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://coditas.com/");
        cg = new CareerPage(driver);
    }

}


