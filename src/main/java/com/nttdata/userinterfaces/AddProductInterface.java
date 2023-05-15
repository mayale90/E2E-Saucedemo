package com.nttdata.userinterfaces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class AddProductInterface {

    public static final Target IMG_FLEECE = Target.the("Product fleece").located(By.xpath("//*[@id='item_5_img_link']/img"));
    public static final Target BTN_ADD_FLEECE = Target.the("Button add product fleece").located(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']"));
    public static final Target BTN_BACK = Target.the("Button Back").located(By.xpath("//*[@id='back-to-products']"));
    public static final Target IMG_ONESIE = Target.the("Product Onesie").located(By.xpath("//*[@id='item_2_img_link']/img"));
    public static final Target BTN_ADD_ONESIE = Target.the("Button add product Onesie").located(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']"));
    public static final Target IMG_CART = Target.the("Icon cart").located(By.xpath("//*[@id='shopping_cart_container']"));
}
