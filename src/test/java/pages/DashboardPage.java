package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver = new ChromeDriver();

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "bookingModule")
    public WebElement booking;

    @FindBy(xpath = "select")
    public WebElement dropDown;

    @FindBy(xpath = "calendar")
    public WebElement calendar;

    @FindBy(xpath = "//table[@class='calender']//td[@class='data']/a[text()='10']")
    public WebElement validDate;

    @FindBy(xpath = "//table[@class='calender']//td[@class='data']/a[text()='5']")
    public WebElement passedDate;

    @FindBy (xpath ="message")
    public WebElement message;


}
