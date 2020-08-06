package co.com.choucair.certification.screenplayReto01.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class AutomationDemoPage extends PageObject {

    public static final Target TARIFARIO =
            Target.the("boton tarifario")
                    .located(By.xpath("//*[@id='footer-content']/div[2]/div[1]/div/div[2]/div/ul/li[5]/a"));
}
