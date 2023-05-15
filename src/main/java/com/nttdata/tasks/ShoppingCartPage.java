package com.nttdata.tasks;

import com.nttdata.userinterfaces.AddProductInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ShoppingCartPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(AddProductInterface.IMG_CART,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(AddProductInterface.IMG_CART)

        );
    }

    public static Task viewshoppingcart(){
        return instrumented(ShoppingCartPage.class);
    }
}
