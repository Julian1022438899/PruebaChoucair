package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.ChoucairAcademyPage;
import co.com.choucair.certification.utest.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyPage),
                Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("Julian").into(ChoucairLoginPage.FIRST_NAME),
                Enter.theValue("Ortiz").into(ChoucairLoginPage.LAST_NAME),
                Enter.theValue("ortizguerreroj@gmail.com").into(ChoucairLoginPage.EMAIL),
                SelectFromOptions.byVisibleText("October").from(ChoucairLoginPage.MONTH_BIRTH),
                SelectFromOptions.byVisibleText("22").from(ChoucairLoginPage.DAY_BIRTH),
                SelectFromOptions.byVisibleText("1998").from(ChoucairLoginPage.YEAR_BIRTH),
                Click.on(ChoucairLoginPage.NEXT_BUTTON),
                Click.on(ChoucairLoginPage.NEXT_DEVICES),
                Click.on(ChoucairLoginPage.NEXT_LAST_DEVICES),
                Enter.theValue("Pruebass22*").into(ChoucairLoginPage.PASSWORD),
                Enter.theValue("Pruebass22*").into(ChoucairLoginPage.CONFIRM_PASSWORD),
                Click.on(ChoucairLoginPage.TERM_OF_USE),
                Click.on(ChoucairLoginPage.PRIVACY_SETTING),
                Click.on(ChoucairLoginPage.COMPLETE_SETUP)

                );
    }
}
