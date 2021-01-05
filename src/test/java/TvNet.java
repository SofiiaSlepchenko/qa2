import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TvNet {
    private WebDriver driver;
    private final By ARTICLE_BUTTON = new By.ByClassName("list-article__media");
    private final By COMMENTS_BUTTON = new By.ByClassName("article-share__item--comments");
    private final By ARTICLE_BUTTON1 = By.xpath("//*[contains(text(), 'Dievu dzēriens')]");

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "../chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tvnet.lv");
    }

    @Test
    public void test1() {
        WebElement articleButton = driver.findElement(ARTICLE_BUTTON);
        articleButton.click();

        WebElement commentsButton = driver.findElement(COMMENTS_BUTTON);
        commentsButton.click();
    }

    @Test
    public void test2() {
        List<WebElement> articles = driver.findElements(ARTICLE_BUTTON);
        articles.get(3).click();
    }

    @Test
    public void test3() {
        WebElement element = driver.findElement(ARTICLE_BUTTON1);
        element.click();
    }
}

