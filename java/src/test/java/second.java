import org.openqa.selenium.Webdriver;
import org.openqa.selenium.support.ui.Webdriverwait;
public class second {
    private Webdriver driver;
    private Webdriverwait wait;
    @Before
    public void start () {
        driver = new Chromedriver();
        wait = new Webdriverwait (driver,timeOutInSeconds: 10);
    }
    @test
    public void second () {
        driver.get("https://bash.im/search");
        driver.findelement(by.name("text")).sendKeys("1");
        driver.findelement(by.tagname("Button")).click();
        wait.until(titleis("Цитата #1 – Цитатник Рунета"));
    }
    @After
    public void stop (){
    driver.quit();
    driver = null;
    }