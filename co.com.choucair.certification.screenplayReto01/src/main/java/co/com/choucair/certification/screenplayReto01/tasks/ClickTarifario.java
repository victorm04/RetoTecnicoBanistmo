package co.com.choucair.certification.screenplayReto01.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.screenplayReto01.userinterface.AutomationDemoPage.TARIFARIO;

public class ClickTarifario implements Task {

    public static ClickTarifario boton() {
        return Tasks.instrumented(ClickTarifario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TARIFARIO));
    }
}
