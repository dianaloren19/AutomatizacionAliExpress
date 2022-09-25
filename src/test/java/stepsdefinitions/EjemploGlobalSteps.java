package stepsdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AgregarProducto;
import tasks.BuscarProducto;
import userinterfaces.HomePage;

import java.util.List;

public class EjemploGlobalSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Global");
    private HomePage homePage = new HomePage();


    @When("^User enters the correct values of to make the raffle$")
    public void userEntersTheCorrectValuesOfToMakeTheRaffle() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
        navegador.manage().window().maximize();

    }

    @Then("^User add (.*) unit of (.*) to car$")
    public void userAdd3UnitOfRespiratorMaskN95OfBeautyAndHealthToCar(String cantidad, String descripcion) {
        actor.wasAbleTo(
                /*Buscar el producto, aqui el actor fue capaz son acciones preliminares*/
                BuscarProducto.conDescripcion(descripcion),
                AgregarProducto.cantidad(cantidad)
        );

    }

    @When("^User introduce the corr values of to make the raffle$")
    public void userIntroduceTheCorrValuesOfToMakeTheRaffle(List<String> datos) {

    }

    @Then("^User con the successful transaction message$")
    public void userConTheSuccessfulTransactionMessage() {

    }

}
