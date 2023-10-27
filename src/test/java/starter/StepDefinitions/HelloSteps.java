package starter.StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Hello;

public class HelloSteps {
    @Steps
    Hello hello;

//    Index
    @Given("I set endpoints Index")
    public void setendpointindex(){
        hello.setendpointindex();
    }
    @When("I send HTTP request Index")
    public void sendGetHttpRequestindex(){
        hello.sendGetHttpRequestindex();
    }
    @Then("I receive valid HTTP response code 200 Index")
    public void respon200index(){hello.respon200index();}

    @Given("I set endpoints wrong index")
    public void setendpointwrongindex(){
        hello.setendpointwrongindex();
    }
    @When("I send HTTP request wrong index")
    public void sendGetHttpRequestwrongindex(){
        hello.sendGetHttpRequestwrongindex();
    }
    @Then("I receive valid HTTP response code 404 wrong index")
    public void respon404wrongindex(){hello.respon404wrongindex();}
}
