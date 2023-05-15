package com.nttdata.tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import com.nttdata.userinterfaces.LoginPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class LoginPage implements Task {
    public final String username;
    public final String password;

    public LoginPage(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(LoginPageInterface.INP_USER_NAME,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(username).into(LoginPageInterface.INP_USER_NAME),
                WaitUntil.the(LoginPageInterface.INP_PASSWORD,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(password).into(LoginPageInterface.INP_PASSWORD),
                WaitUntil.the(LoginPageInterface.BTN_LOGIN,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LoginPageInterface.BTN_LOGIN)
        );
    }


    public static Performable withCredentials(String username, String password){
        return instrumented(LoginPage.class, username, password);
    }
}
