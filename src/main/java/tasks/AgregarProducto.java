package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DetallesArticulosPage.*;

public class AgregarProducto implements Task {

    private String cantidad;
    public AgregarProducto(String cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ITEM_COLOR), //Seleccionar el color
                Enter.theValue(cantidad).into(ITEM_QUANTITY),// ingresar la cantidad
                Click.on(ADD_BASKET),//oprimir boton añadir a la cesta
                Click.on(SEE_BASKET)// ver lo que se ha agregado
        );

    }
    public static AgregarProducto cantidad(String cantidad){

        return instrumented(AgregarProducto.class, cantidad);
    }

}
