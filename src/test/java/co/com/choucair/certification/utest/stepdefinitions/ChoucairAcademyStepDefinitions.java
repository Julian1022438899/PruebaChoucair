package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.tasks.Login;
import co.com.choucair.certification.utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^julian wants to register on the utest page to have a user$")
    public void julianWantsToRegisterOnTheUtestPageToHaveAUser() {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }
}
