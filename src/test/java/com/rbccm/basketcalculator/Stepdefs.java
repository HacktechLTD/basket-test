package com.rbccm.basketcalculator;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.Map;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Stepdefs  {
    private Map<Fruit, Integer> basketItems;

    @Given("^the following basket$")
    public void the_following_basket(final Map<Fruit, Integer> basketItems) {
        this.basketItems = basketItems;
    }

    @Then("^the total cost should be (\\d+) pence$")
    public void the_total_cost_should_be(final int totalCost) {
        int calculatedTotalCost = TotalCalculator.calculate(basketItems);

        assertThat(calculatedTotalCost, equalTo(totalCost));
    }

}
