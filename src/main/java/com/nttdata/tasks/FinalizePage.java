package com.nttdata.tasks;

import com.nttdata.userinterfaces.AddProductInterface;
import com.nttdata.userinterfaces.FinalizePurchaseInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FinalizePage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(FinalizePurchaseInterface.BTN_FINISH,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(FinalizePurchaseInterface.BTN_FINISH)

        );
    }

    public static Task finalizePurchase(){
        return instrumented(FinalizePage.class);
    }


}
