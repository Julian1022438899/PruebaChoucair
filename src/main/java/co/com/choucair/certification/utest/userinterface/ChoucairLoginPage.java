package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target FIRST_NAME = Target.the("text box to key the username")
            .located(By.id("firstName"));
    public static final Target LAST_NAME =  Target.the("text box to key the lastname")
            .located(By.id("lastName"));
    public static final Target EMAIL =  Target.the("text box to key the email")
            .located(By.id("email"));
    public static final Target MONTH_BIRTH = Target.the("text box to key the month")
            .located(By.name("birthMonth"));
    public static final Target DAY_BIRTH = Target.the("text box to key the day")
            .located(By.name("birthDay"));
    public static final Target YEAR_BIRTH = Target.the("text box to key the year")
            .located(By.name("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("button that gives to next location")
            .located(By.xpath("//div[@class = 'form-group col-xs-12 text-right']/a"));
    public static final Target NEXT_DEVICES = Target.the("button that gives to next devices")
            .located(By.xpath("//div[@class='pull-right next-step']/a"));
    /*
    public static final Target MOBILE_DEVICE = Target.the("button that gives to list of mobile devices")
            .located(By.xpath("//div[@class='ui-select-match']/span/span[@class='ui-select-placeholder text-muted ng-hide']"));
     */
    public static final Target NEXT_LAST_DEVICES = Target.the("button that gives to next devices")
            .located(By.xpath("//div[@class = 'pull-right next-step']/a"));
    public static final Target PASSWORD = Target.the("text box to key the password")
            .located(By.name("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("text box to key the confirm password")
            .located(By.name("confirmPassword"));
    public static final Target TERM_OF_USE = Target.the("terms and conditions check box")
            .located(By.name("termOfUse"));
    public static final Target PRIVACY_SETTING = Target.the("privacy & security policy check box")
            .located(By.name("privacySetting"));
    public static final Target COMPLETE_SETUP = Target.the("button that gives to complete setup")
            .located(By.xpath("//div[@class = 'pull-right next-step']/a"));

}
