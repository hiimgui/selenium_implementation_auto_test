import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mercadolivre.com.br");



        WebElement campoDeBusca = driver.findElement(By.xpath("/html/body/header/div/form/input"));
        campoDeBusca.click();
        campoDeBusca.sendKeys("Iphone 13");

        WebElement lupa = driver.findElement(By.cssSelector("body > header > div > form > button > div"));

        lupa.click();

        WebElement primeiroItem = driver.findElement(By.cssSelector("#root-app > div > div.ui-search-main.ui-search-main--only-products.ui-search-main--with-topkeywords > section > ol > li:nth-child(1) > div > div > div.ui-search-result__content-wrapper > div.ui-search-item__group.ui-search-item__group--title > a > h2"));

        primeiroItem.click();

        WebElement gigas = driver.findElement(By.xpath("//*[@id=\"ui-pdp-main-container\"]/div[1]/div/div[1]/div[2]/div[3]/div[1]/div/a[2]/div/p"));
        gigas.click();



        WebElement cor = driver.findElement(By.xpath("/html/body/main/div[2]/div[3]/div[1]/div[1]/div/div[1]/div[2]/div[3]/div[2]/div/a[1]/div/img"));

        cor.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement comprar = driver.findElement(By.xpath("/html/body/main/div[2]/div[3]/div[1]/div[2]/div/div[1]/form/div[6]/div/button[1]/span"));

        comprar.click();
    }

}
