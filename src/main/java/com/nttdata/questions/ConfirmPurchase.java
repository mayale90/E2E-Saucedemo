package com.nttdata.questions;

import com.nttdata.userinterfaces.FinalizePurchaseInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ConfirmPurchase implements Question<String> {
    public static Question<String>message(){
        return new ConfirmPurchase();
    }

    @Override
    public String answeredBy(Actor actor){
        return BrowseTheWeb.as(actor).find(FinalizePurchaseInterface.LBL_CONFIRM).getText().trim();
    }
}
