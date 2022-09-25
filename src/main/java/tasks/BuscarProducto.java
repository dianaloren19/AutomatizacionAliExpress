package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterfaces.HomePage.*;

public class BuscarProducto implements Task {
    private String descripcion;

    public BuscarProducto(String descripcion){
        this.descripcion = descripcion;

    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        /*El actor va a ejecutar la acciones */
        actor.attemptsTo(
                Click.on(BUTTON_PERMIT),
                Click.on(BUTTON_CLOSE_IMAGES),
                Enter.theValue(descripcion).into(INPUT_SEARCH_OBJECT),//Diligenciar el campo de busqueda
                Hit.the(Keys.ENTER).into(BUTTON_SEARCH_ARTICLE),//Presionar enter para lanzar la busqueda
                Click.on(LINK_OBJECT_SEARCHED));
            for(String windHandle : getDriver().getWindowHandles()){
                getDriver().switchTo().window(windHandle);
            }


    }
    /*perfomable se puede sustituir el metodo por la clase*/
    public static BuscarProducto conDescripcion(String descripcion) {
        /*El metodo isntrumen me crea la instancia de la clase*/
        return instrumented(BuscarProducto.class, descripcion);

    }
}
