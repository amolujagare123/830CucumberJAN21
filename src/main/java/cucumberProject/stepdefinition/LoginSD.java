package cucumberProject.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {

    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");
    }


    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {

        System.out.println("I enter correct username and password");
    }
    @When("I click on login button")
    public void i_click_on_login_button() {

        System.out.println("I click on login button");
    }
    @Then("I should be on home page")
    public void i_should_be_on_home_page() {

        System.out.println("I should be on home page");
    }



    @When("^I enter incorrect username and password$")
    public void i_enter_incorrect_username_and_password() throws Throwable {
        System.out.println("I enter incorrect username and password");
    }

    @When("^I enter blank username and password$")
    public void i_enter_blank_username_and_password() throws Throwable {

        System.out.println("I enter blank username and password");
    }



    //code generated using tidy gherkin
   @When("^I enter  username  as \"([^\"]*)\"   and password  as \"([^\"]*)\"$")
    public void i_enter_username_as_something_and_password_as_something(String username, String password)
             {
                 System.out.println("username="+username);
          System.out.println("Password="+password);

    }


    /*
    //code generated after we run the test runner
    @When("I enter  username  as {string}   and password  as {string}")
    public void i_enter_username_as_and_password_as(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/

}
