package co.com.choucair.certification.screenplayReto01.stepdefinitions;

import co.com.choucair.certification.screenplayReto01.tasks.ClickTarifario;
import co.com.choucair.certification.screenplayReto01.tasks.ClickTarifarioDeposito;
import co.com.choucair.certification.screenplayReto01.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Reto01Stepdefinition {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Victor visit the banistmo website$")
    public void thanVictorVisitTheBanistmoWebsite() {
        OnStage.theActorCalled("Victor").wasAbleTo(OpenUp.thePage());
    }

    @When("^he go to the tarifarios section$")
    public void heGoToTheTarifariosSection() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickTarifario.boton());
    }

    @When("^he select the deposit pdf$")
    public void heSelectTheDepositPdf() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickTarifarioDeposito.pdf());
    }

    @Then("^he verify that the pdf is the correct one$")
    public void heVerifyThatThePdfIsTheCorrectOne() {
    }

}
