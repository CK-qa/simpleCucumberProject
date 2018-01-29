package com.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestClass {

    private int given;
    private int minus;
    private int start;
    private int eat;


    @Given("^user has (\\d+) items$")
    public void userHasItems(int number) {
        given = number;
        System.out.println("Scenario step1: Given user has " + number + " items");
    }

    @When("^user loses (\\d+) items$")
    public void userLosesItems(int number) {
        minus = number;
        System.out.println("Scenario step2: When user loses " + minus + " items");
    }

    @Then("^he has (\\d+) items$")
    public void heHasItems(int number) {
        int result = given - minus;
        Assert.assertEquals(number, result);
        System.out.println("Scenario step3: Then he has " + number + "items");
    }

    @And("^everybody happy$")
    public void everybodyHappy() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Scenario step4: And everybody happy\n");
    }

    //region 2
    @Given("^there are (\\d+) cucumbers$")
    public void thereAreStartCucumbers(int start) {
        this.start = start;
        System.out.println("Scenario outline step1:  Given there are " +start +" cucumbers");
    }

    @When("^I eat (\\d+) cucumbers$")
    public void iEatEatCucumbers(int eat) {
        this.eat = eat;
        System.out.println("Scenario outline step2: When I eat "+eat+" cucumbers");
    }

    @Then("^I should have (\\d+) cucumbers$")
    public void iShouldHaveLeftCucumbers(int left) {
        int res = start - eat;
        System.out.println("Scenario outline step3: Then I should have " + left+ " cucumbers\n");
        Assert.assertEquals(res, left);
    }
}
