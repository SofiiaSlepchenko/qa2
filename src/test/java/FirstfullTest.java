import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstfullTest {
    private final By ARTICLE = By.tagName("article");
    private final By ARTICLE_TITLE = By.xpath (".//span[@itemprop = 'headline name']");
    private final By COMMENTS_COUNT = By.xpath(".//span[contains(@class, 'list-article__comments')]");

    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[@itemprop = 'headline name']");

    private final Logger LOGGER = LogManager.getLogger(FirstfullTest.class);

    @Test
    public void titleCommentsCheck() {
        LOGGER.info("This test is chking titles and comments on TNNEt page");
        System.setProperty("webdriver.chrome.driver", "../chromedriver");

        LOGGER.info("We are opening browser window");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        LOGGER.info("Going to TVNET Home page");
        driver.get("http://tvnet.lv");


        LOGGER.info("Taking 3rd article");

        WebElement currentArticle = driver.findElements(ARTICLE).get(3);

        LOGGER.info("Find and store article page");
        String titleToCheck = currentArticle.findElement(ARTICLE_TITLE).getText();

        //Store comments count
        int commentCount = 0;

        if(!currentArticle.findElements(COMMENTS_COUNT).isEmpty()) {
            String commentsToParce = currentArticle.findElement(COMMENTS_COUNT).getText(); // (36)
            commentsToParce = commentsToParce.substring(1, commentsToParce.length() -1); // (36) -> 36
            commentCount = Integer.parseInt(commentsToParce);

        }

        //Open 3rd article
        currentArticle.findElement(ARTICLE_TITLE).click();
        //Find and check title
        Assertions.assertEquals(titleToCheck, driver.findElement(ARTICLE_PAGE_TITLE).getText(), "Incorrect Title!");
        // Check comments
        //Click on comments
        // Check title
        //Check comments count
    }
}
