package stepDefs;

import io.cucumber.java.en.Given;

public class StepDefinitions {
    @Given("inscription Hello World")
    public void print_hello_world(){
        System.out.println("Hello world!");
    }
}
