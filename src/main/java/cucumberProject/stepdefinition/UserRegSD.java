package cucumberProject.stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegSD {

    @Given("i am on user registration page")
    public void i_am_on_user_registration_page() {

        System.out.println("i am on user registration page");
    }


    @When("i enter following details")
    public void i_enter_following_details(DataTable dataTable) {

        List<String> data  = dataTable.asList();

        System.out.println("First name :"+ data.get(0));
        System.out.println("Last name :"+ data.get(1));
        System.out.println("Phone :"+ data.get(2));
        System.out.println("email :"+ data.get(3));

    }

    @When("click on submit button")
    public void click_on_submit_button() {
        System.out.println("click on submit button");
    }
    @Then("user should be added")
    public void user_should_be_added() {

        System.out.println("user should be added");
    }



    @When("^I enter (.+) , (.+) , (.+)$")
    public void i_enter_(String name, String email, String phone)
             {

                 System.out.println("Name :"+name);
                 System.out.println("Email :"+email);
                 System.out.println("Phone : "+phone);
    }
}
