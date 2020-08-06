package co.com.choucair.certification.screenplayReto01.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TarifarioPage extends PageObject {
    public static final Target TARIFARIODEPOSITO =
            Target.the("tarifario de posito")
                    .located(By.xpath("//*[@id='main-content']/div[1]/div/div/table/tbody/tr[2]/td[2]/span/a/img"));
}
