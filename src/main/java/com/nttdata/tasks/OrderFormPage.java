package com.nttdata.tasks;

import com.nttdata.userinterfaces.AddProductInterface;
import com.nttdata.userinterfaces.LoginPageInterface;
import com.nttdata.userinterfaces.OrderFormInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OrderFormPage implements Task {
    public final String firstname;
    public final String lastname;
    public final String zipcode;

    public OrderFormPage(String firstname, String lastname, String zipcode){
        this.firstname = firstname;
        this.lastname = lastname;
        this.zipcode = zipcode;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(OrderFormInterface.BTN_CHECKOUT,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(OrderFormInterface.BTN_CHECKOUT),
                WaitUntil.the(OrderFormInterface.INP_FIRST_NAME,isVisible()).forNoMoreThan(20).seconds(),
                    Enter.theValue(firstname).into(OrderFormInterface.INP_FIRST_NAME),
                WaitUntil.the(OrderFormInterface.INP_LAST_NAME,isVisible()).forNoMoreThan(20).seconds(),
                    Enter.theValue(lastname).into(OrderFormInterface.INP_LAST_NAME),
                WaitUntil.the(OrderFormInterface.INP_POSTAL_CODE,isVisible()).forNoMoreThan(20).seconds(),
                    Enter.theValue(zipcode).into(OrderFormInterface.INP_POSTAL_CODE),
                WaitUntil.the(OrderFormInterface.BTN_CONTINUE,isVisible()).forNoMoreThan(20).seconds(),
                    Click.on(OrderFormInterface.BTN_CONTINUE)
        );
    }

    public static Performable withData(String firstname, String lastname, String zipcode){
        return instrumented(OrderFormPage.class, firstname, lastname, zipcode);
    }
}
