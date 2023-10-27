package starter.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Authentication;

public class AuthenticationSteps {
@Steps
Authentication authentication;

    @Given("I set endpoints register")
    public void setGetApiEndpoint(){
        authentication.setApiEndpoint();
    }
    @When("I send HTTP request")
    public void sendGetHttpRequest(){
        authentication.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){
        authentication.validateHttpResponseCode200();
    }

    @Given("I set endpoints register1")
    public void setGetApiEndpoint1(){
        authentication.setApiEndpoint1();
    }
    @When("I send HTTP request1")
    public void sendGetHttpRequest1(){
        authentication.sendGetHttpRequest1();
    }
    @Then("I receive valid HTTP response code 400")
    public void receiveValidHttpResponseCode1(){
        authentication.validateHttpResponseCode400();
    }


    @Given("I set endpoints register2")
    public void setGetApiEndpoint2(){
        authentication.setApiEndpoint2();
    }
    @When("I send HTTP request2")
    public void sendGetHttpRequest2(){
        authentication.sendGetHttpRequest2();
    }
    @Then("I receive valid HTTP response code1 400")
    public void receiveValidHttpResponseCode2(){
        authentication.validateHttpResponseCode1400();
    }

    @Given("I set endpoints register3")
    public void setGetApiEndpoint3(){
        authentication.setApiEndpoint3();
    }
    @When("I send HTTP request3")
    public void sendGetHttpRequest3(){
        authentication.sendGetHttpRequest3();
    }
    @Then("I receive valid HTTP response code2 400")
    public void receiveValidHttpResponseCode3(){
        authentication.validateHttpResponseCode2400();
    }

    @Given("I set endpoints register4")
    public void setGetApiEndpoint4(){
        authentication.setApiEndpoint4();
    }
    @When("I send HTTP request4")
    public void sendGetHttpRequest4(){
        authentication.sendGetHttpRequest4();
    }
    @Then("I receive valid HTTP response code3 400")
    public void receiveValidHttpResponseCode4(){
        authentication.validateHttpResponseCode3400();
    }


//loginn
    @Given("I set endpoints login")
    public void setGetApiEndpointLogin(){
        authentication.setGetApiEndpointLogin();
    }
    @When("I send HTTP request login")
    public void sendGetHttpRequestLogin(){
        authentication.sendGetHttpRequestLogin();
    }
    @Then("I receive valid HTTP response code 200 login")
    public void receiveValidHttpResponseCodeLogin(){
        authentication.receiveValidHttpResponseCodeLogin();
    }

    @Given("I set endpoints login1")
    public void setGetApiEndpointLogin1(){
        authentication.setGetApiEndpointLogin1();
    }
    @When("I send HTTP request login1")
    public void sendGetHttpRequestLogin1(){
        authentication.sendGetHttpRequestLogin1();
    }
    @Then("I receive valid HTTP response code 400 login1")
    public void receiveValidHttpResponseCodeLogin1(){
        authentication.receiveValidHttpResponseCodeLogin1();
    }

    @Given("I set endpoints login2")
    public void setGetApiEndpointLogin2(){
        authentication.setGetApiEndpointLogin2();
    }
    @When("I send HTTP request login2")
    public void sendGetHttpRequestLogin2(){
        authentication.sendGetHttpRequestLogin2();
    }
    @Then("I receive valid HTTP response code 400 login2")
    public void receiveValidHttpResponseCodeLogin2(){
        authentication.receiveValidHttpResponseCodeLogin2();
    }

    @Given("I set endpoints login3")
    public void setGetApiEndpointLogin3(){
        authentication.setGetApiEndpointLogin3();
    }
    @When("I send HTTP request login3")
    public void sendGetHttpRequestLogin3(){
        authentication.sendGetHttpRequestLogin3();
    }
    @Then("I receive valid HTTP response code 400 login3")
    public void receiveValidHttpResponseCodeLogin3(){
        authentication.receiveValidHttpResponseCodeLogin3();
    }

    @Given("I set endpoints login4")
    public void setGetApiEndpointLogin4(){
        authentication.setGetApiEndpointLogin4();
    }
    @When("I send HTTP request login4")
    public void sendGetHttpRequestLogin4(){
        authentication.sendGetHttpRequestLogin4();
    }
    @Then("I receive valid HTTP response code 400 login4")
    public void receiveValidHttpResponseCodeLogin4(){
        authentication.receiveValidHttpResponseCodeLogin4();
    }

//    Get user information
    @Given("I set endpoints information")
    public void setendpointinformation(){
    authentication.setendpointinformation();
}
    @When("I send HTTP request information")
    public void sendgethttprequest(){
        authentication.sendgethttprequest();
    }
    @Then("I receive valid HTTP response code 200 information")
    public void informationresponse(){
        authentication.informationresponse();
    }

    @Given("I set endpoints information1")
    public void setendpointinformation1(){
        authentication.setendpointinformation1();
    }
    @When("I send HTTP request information1")
    public void sendGetHttpRequesinformation1(){
        authentication.sendGetHttpRequesinformation1();
    }
    @Then("I receive valid HTTP response code 401 information1")
    public void response401Information(){
        authentication.response401Information();
    }
}
