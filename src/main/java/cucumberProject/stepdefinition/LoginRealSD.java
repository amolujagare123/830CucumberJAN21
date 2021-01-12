package cucumberProject.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginRealSD {

    WebDriver driver;

    @Given("^I am on login page of billing$")
    public void i_am_on_login_page_of_billing() throws Throwable {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net");

    }

    @When("^I enter correct username and password on billing page$")
    public void i_enter_correct_username_and_password_on_billing_page() throws Throwable {
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("amolujagare@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
    }

    @Then("^I should be on dashboard of billing page$")
    public void i_should_be_on_dashboard_of_billing_page() throws Throwable {

        Assert.assertEquals(driver.getCurrentUrl(),
                "http://billing.scriptinglogic.net/index.php/dashboard1",
                "wrong page");

    }


    @And("^I click on login button on billing page$")
    public void i_click_on_login_button_on_billing_page() throws Throwable {
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }


}
