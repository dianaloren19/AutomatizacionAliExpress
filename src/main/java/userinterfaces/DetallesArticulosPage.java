package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DetallesArticulosPage {

    public static final Target ITEM_COLOR = Target.the( "CHARACTER ARTICLE COLOR").locatedBy( "(//span[contains(.,'Kn95 White 100pcs')])[2]");
    public static final Target ITEM_QUANTITY = Target.the( "QUALITY ARTICLES").locatedBy( "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[8]/span/span/span[2]/input");
    public static final Target ADD_BASKET = Target.the( "QUALITY ARTICLES").locatedBy( "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[12]/span[2]/button");
    public static final Target SEE_BASKET = Target.the( "SEE BASKET").locatedBy( "/html/body/div[12]/div[2]/div/div/div/div[2]/a/button");

}
