package co.com.choucair.certification.screenplayReto01.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.screenplayReto01.userinterface.TarifarioPage.TARIFARIODEPOSITO;

public class ClickTarifarioDeposito implements Task {

    public static ClickTarifarioDeposito pdf() {
        return Tasks.instrumented(ClickTarifarioDeposito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TARIFARIODEPOSITO));

    }
}
