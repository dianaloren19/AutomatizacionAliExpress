package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://es.aliexpress.com")
public class HomePage extends PageObject {


    public static final Target BUTTON_PERMIT = Target.the("Button permit allow").locatedBy("/html/body/div[5]/div/div[2]/div[3]/div[2]");
    public static final Target BUTTON_CLOSE_IMAGES = Target.the("Button permit allow").locatedBy("/html/body/div[6]/div/div[1]/img[2]");

    public static final Target INPUT_SEARCH_OBJECT = Target.the("Input donde se hace la busqueda").located(By.id("search-key"));

    public static final Target BUTTON_SEARCH_ARTICLE = Target.the("Button search article").located(By.className("search-button"));

    public static final Target LINK_OBJECT_SEARCHED = Target.the("link objeto encontrado").locatedBy("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/a[1]");
}
