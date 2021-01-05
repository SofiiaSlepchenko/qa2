import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class lectionTVNET {
    private final By ARTICLE_TITLE = By.xpath (".//span[@itemprop = 'headline name']");
    @Test
    public void tvNetTest() {
        String articleToOpen = "Aparjods notikumiem bagātā posmā Altenbergā izcīna bronzu";
        System.setProperty("webdriver.chrome.driver", "../chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tvnet.lv");

        List<WebElement> articles = driver.findElements (ARTICLE_TITLE);
        System.out.println(articles.size());
        System.out.println(articles.isEmpty());
        System.out.println(articles.get(5).getText());

        //-------------for-----------
//        -----counter start--till----step--i++ > i = i + 1
//        for (int i = 0; i < articles.size(); i++) {
//           if (articles.get(i).getText().startsWith(articleToOpen))  {
//              articles.get(i).click();
//              break;
//
//           }
//
//        }


        //--------foreach------------
        for (WebElement we : articles) {
            if(we.getText().startsWith(articleToOpen)){
                we.click();
                break; }

        }

    }
}
