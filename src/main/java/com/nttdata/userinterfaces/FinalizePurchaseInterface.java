package com.nttdata.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FinalizePurchaseInterface {
    public static final Target BTN_FINISH = Target.the("Button Finish").located(By.xpath("//*[@id='finish']"));
    public static final Target LBL_CONFIRM = Target.the("Label Confirm").located(By.xpath("//*[@id='checkout_complete_container']/h2"));

}
