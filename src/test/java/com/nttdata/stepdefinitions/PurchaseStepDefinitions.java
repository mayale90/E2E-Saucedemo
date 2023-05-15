package com.nttdata.stepdefinitions;

import com.nttdata.questions.ConfirmPurchase;
import com.nttdata.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.Before;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class PurchaseStepDefinitions {

    public String username;
    public String password;

    @Before
    public void setTheStag(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^(.*) user enter your credentials correctly in page saucedemo.com:$")
    public void loginPage(String actor,DataTable credentialsTable){
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        username = credentials.get(0).get("username");
        password = credentials.get(0).get("password"); // Code to enter the username and password on the login page }

        theActorCalled(actor).attemptsTo(OpenPage.loadpage());
        theActorInTheSpotlight().attemptsTo(LoginPage.withCredentials(username, password));
    }

    @When("^Add two product to cart$")
    public void addProduct(){
        theActorInTheSpotlight().attemptsTo(AddProductDirectPage.addProducts());
    }

    @When("^Add two product to cart by opening product detail$")
    public void addProductDetail(){
        theActorInTheSpotlight().attemptsTo(AddProductPage.addProducts());
    }

    @And("^Check cart with added products$")
    public void checkShoppingCart(){
        theActorInTheSpotlight().attemptsTo(ShoppingCartPage.viewshoppingcart());
    }

    @And("^Complete the order form  (.*) (.*) (.*) to finalize purchase$")
    public void completeOrder(String firstname,String lastname, String zipcode){
        theActorInTheSpotlight().attemptsTo(OrderFormPage.withData(firstname,lastname,zipcode));
    }

    @Then("^Display text (.*)$")
    public void finalizePurchase(String message){
        theActorInTheSpotlight().attemptsTo(FinalizePage.finalizePurchase());
        theActorInTheSpotlight().should(
                seeThat("The displayed message",ConfirmPurchase.message(),equalTo(message))
        );
    }


}
