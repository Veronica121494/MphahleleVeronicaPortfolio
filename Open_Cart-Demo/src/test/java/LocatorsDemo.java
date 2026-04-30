import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
      List<WebElement> numberOfHeaderLists= driver.findElements(By.className("navbar-nav ml-auto"));
        System.out.println("Number of header lists: " + numberOfHeaderLists.size());
        //find all the links (Even the hidden ones) in the header and print their text
        List<WebElement> allHeaderLinks = driver.findElements(By.cssSelector("navbar-nav ml-auto"));
        int TotalLinks = allHeaderLinks.size();
        System.out.println("Total number of header links: " + TotalLinks);
        System.out.println("All Header links:");
        for (WebElement link : allHeaderLinks) {
            System.out.println("- " + link.getText());
        }
        List <WebElement> totalImagesAvailable  =driver.findElements(By.tagName("img"));
        int totalNumberOfImages= totalImagesAvailable.size();
        System.out.println("Total number of images: " + totalNumberOfImages);
        for ( WebElement image: totalImagesAvailable){
            System.out.println("- " + image.getAttribute("src"));
        }




      /*  ChromeOptions options = new ChromeOptions();

        // Reduce automation detection
        options.addArguments("--start-maximized");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");

        options.setExperimentalOption(
                "excludeSwitches",
                Arrays.asList("enable-automation"));

        options.setExperimentalOption(
                "useAutomationExtension",
                false);

        WebDriver driver = new ChromeDriver(options);

        try {

            // Hide webdriver flag
            ((JavascriptExecutor) driver).executeScript(
                    "Object.defineProperty(navigator, 'webdriver', {get: () => undefined})"
            );

            driver.get("https://demo.opencart.com");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Wait for logo after security page clears
            WebElement logo = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("img[alt='Your Store']")
                    )
            );

            System.out.println("Website opened successfully");
            System.out.println("Logo displayed: " + logo.isDisplayed());

        } catch (Exception e) {
            System.out.println("Bypass failed: " + e.getMessage());
        }

        driver.close();
    }*/
    }
}


