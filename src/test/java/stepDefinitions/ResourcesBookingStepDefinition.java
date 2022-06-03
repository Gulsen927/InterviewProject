package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.DashboardPage;
import java.util.List;

public class ResourcesBookingStepDefinition {
    DashboardPage dashboardPage = new DashboardPage();
    WebDriver driver = new ChromeDriver();
    Select select;

    @Given("user on the dashboard page, title should be {string}")
    public void user_on_the_dashboard_page_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @When("user click the Booking module")
    public void user_click_the_booking_module() {

        dashboardPage.booking.click();

    }

    @Then("user should see below info in Booking dropdown")
    public void user_should_see_below_info_in_booking_dropdown(List<String> expectedOptions) {

        select = new Select(dashboardPage.dropDown);
        List<WebElement> actualOptions = select.getOptions();

        for (int i = 0; i < expectedOptions.size(); i++) {
            Assert.assertEquals(expectedOptions.get(i), actualOptions.get(i).getText());
        }

    }

    @When("user select the {string}")
    public void user_select_the(String option) {
        select = new Select(dashboardPage.dropDown);
        select.selectByValue(option);
    }

    @Then("user able to see the calendar")
    public void user_able_to_see_the_calendar() {
        dashboardPage.calendar.isDisplayed();
        dashboardPage.calendar.click();
    }

    @When("user select the available date")
    public void user_select_the_available_date() {
        dashboardPage.validDate.click();

    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String expectedText) {

        String actualText = dashboardPage.message.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @When("user select the Passed date")
    public void user_select_the_passed_date() {
        dashboardPage.passedDate.click();

    }

    @Then("{string} error message should be displayed")
    public void error_message_should_be_displayed(String expectedText) {
        String actualText = dashboardPage.message.getText();
        Assert.assertEquals(expectedText, actualText);

    }


}
