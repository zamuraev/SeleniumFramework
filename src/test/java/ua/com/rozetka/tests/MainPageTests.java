package ua.com.rozetka.tests;

import com.codeborne.selenide.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ua.com.rozetka.pages.main.MainPage;
import ua.com.rozetka.pages.main.left.block.LeftBlockPage;
import ua.com.rozetka.util.StringUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;

public class MainPageTests {

    private static WebDriver webDriver;
    private MainPage page = new MainPage();
    private static Properties config = new Properties();
    private static InputStream file;
    private static String siteAddress;

    @BeforeClass
    public static void setUp() throws IOException {

        file = new FileInputStream("src/test/java/ua/com/rozetka/config/config.properties");
        config.load(file);
        siteAddress = config.getProperty("site.address");


        //TODO Make a contractor here until 28.09.2018
        //Alt+6
        //Selenide
        Configuration.browser = "chrome";
        System.setProperty("selenide.browser", "chrome");
        open(siteAddress);


        //Selenium
        //webDriver = new ChromeDriver();
        //webDriver.manage().window().maximize();
    }

    /*
    @Test
    public void shouldAppearCityPopUpOnCityRefClick() throws InterruptedException  {

        //given
       webDriver.get(siteAddress);
       String cityRef =  page.getHeader().getCityRef();
       WebElement cityRefElem  = webDriver.findElement(By.cssSelector(cityRef));

       //when
       Thread.sleep(5000);
       cityRefElem.click();

       //then
        String cityChoosePopUp = page.getHeader().getCityChoosePopUp();
        WebElement popUpElem = webDriver.findElement(By.cssSelector(cityChoosePopUp));
        Assert.assertTrue("Блок с названиями городов не появился",
                popUpElem.isDisplayed());

    }

*/
    /*
    @Test
    public  void headerTest() {

        $("input.rz-header-search-input-text").shouldBe(Condition.visible);       //like isVisiable
        $("input.rz-header-search-input-text").setValue("Lenovo");
        $("div.rz-header-search-suggest-g").shouldBe(Condition.visible);

       // sleep(5000);
        ElementsCollection elements = $$("div.rz-header-search-suggest-i");
        for(SelenideElement element : elements){
            element.getText().contains("Мобильные телефоны");
            element.click();
            break;
        }
        sleep(5000);

    }
*/

    @Test
    public  void leftBlockHeaderTest() {

        LeftBlockPage leftBlock =  page.getleftBlockPage();
        sleep(5000);
        String headerText = leftBlock.getHeader().shouldBe(Condition.exist).getText();

        if (headerText!=null) {
            Assert.assertEquals("Каталог товаров", StringUtil.removeSpaces("headerText"));
        }

        else {


        }









    }

//Scroll to Selenide element
    //Alt+F9 для Git


         // Selenide element seachField = page.getHeader()/getSearch().getTextElement();
        //Selenide element seachOKButton = page.getHeader()/getSearch().getOkButton();
        //seachField.getValue("Lenovo");
        // seachOKButton.click();
        // seachResultPage.shouldBe(Condition.exist);
}
