package com.nttdata.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPageInterface {
    public static final Target INP_USER_NAME = Target.the("Input Username").located(By.xpath("//*[@id='user-name']"));
    public static final Target INP_PASSWORD = Target.the("Input Password").located(By.xpath("//*[@id='password']"));
    public static final Target BTN_LOGIN = Target.the("Boton Login").located(By.xpath("//*[@id='login-button']"));

}
