package com.cydeo.step_definitions;

/*
In this class we will pass pre & post - conditions to each scenario and each step
*/

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before (order = 1)     //==> import from io.cucumber.java (not from junit)
    public void setupScenario(){
        System.out.println("=== Setting up browser using cucumber @Before ===");
    }

    @Before (value = "@login", order = 2)     //==> import from io.cucumber.java (not from junit)
    public void setupScenarioForLogins(){
        System.out.println("=== Only for scenarios with @login tag ===");
    }

    @Before (value = "@db", order = 0)     //==> import from io.cucumber.java (not from junit)
    public void setupForDatabaseScenario(){
        System.out.println("=== This will only apply to scenarios with @db tag ===");
    }


    @After
    public void teardownScenario(){

        Driver.closeDriver();

//        System.out.println("=== Closing browser using cucumber @After ===");
//        System.out.println("=== Scenario ended / Take screenshot if failed! ===");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("xx------------ Applying setup using @BeforeStep ------------xx");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("xx------------ Applying tearDown using @AfterStep ------------xx");
    }



}
