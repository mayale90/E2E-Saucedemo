package com.nttdata.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OrderFormInterface {
    public static final Target BTN_CHECKOUT = Target.the("Button Checkout").located(By.xpath("//*[@id='checkout']"));
    public static final Target INP_FIRST_NAME = Target.the("Input First name").located(By.xpath("//*[@id='first-name']"));
    public static final Target INP_LAST_NAME = Target.the("Input Last name").located(By.xpath("//*[@id='last-name']"));
    public static final Target INP_POSTAL_CODE = Target.the("Button Postal code").located(By.xpath("//*[@id='postal-code']"));
    public static final Target BTN_CONTINUE = Target.the("Button Continue").located(By.xpath("//*[@id='continue']"));

}
