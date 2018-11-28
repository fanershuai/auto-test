import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {


    public static void searchBaiDu(String searchStr) {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.className("s_ipt")).sendKeys(searchStr);
        driver.findElement(By.id("su")).click();
        String link = driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a")).getAttribute("href");//*[@id="1"]/h3/a
        driver.get(link);
    }


    public static void main(String[] args) {
        searchBaiDu("自动化测试");

    }
}
