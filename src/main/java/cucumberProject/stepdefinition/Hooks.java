package cucumberProject.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@userReg")
    public void myBeforeMethod()
    {
        System.out.println("#########--This is before @userReg--####################");
    }

    @After("@userReg")
    public void myAfterClass()
    {
        System.out.println("#########--This is after @userReg--####################");
    }


    @Before("@dummyLogin")
    public void myBeforeMethod1()
    {
        System.out.println("#########--This is before @dummyLogin--####################");
    }

    @After("@dummyLogin")
    public void myAfterClass1()
    {
        System.out.println("#########--This is after @dummyLogin--####################");
    }
}
