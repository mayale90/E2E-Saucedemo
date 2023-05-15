package com.nttdata.tasks;

import com.nttdata.userinterfaces.AddProductInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
             WaitUntil.the(AddProductInterface.IMG_FLEECE,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(AddProductInterface.IMG_FLEECE),
             WaitUntil.the(AddProductInterface.BTN_ADD_FLEECE,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(AddProductInterface.BTN_ADD_FLEECE),
             WaitUntil.the(AddProductInterface.BTN_BACK,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(AddProductInterface.BTN_BACK),
             WaitUntil.the(AddProductInterface.IMG_ONESIE,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(AddProductInterface.IMG_ONESIE),
             WaitUntil.the(AddProductInterface.BTN_ADD_ONESIE,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(AddProductInterface.BTN_ADD_ONESIE),
             WaitUntil.the(AddProductInterface.BTN_BACK,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(AddProductInterface.BTN_BACK)
        );
    }

    public static Task addProducts(){
        return instrumented(AddProductPage.class);
    }

}
