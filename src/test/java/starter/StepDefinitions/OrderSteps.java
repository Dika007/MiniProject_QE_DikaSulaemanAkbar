package starter.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Order;
public class OrderSteps {
    @Steps
    Order order;

//    Create a new order
    @Given("I set endpoints Create a new order")
    public void setendpointcreateaneworder(){
    order.setendpointcreateaneworder();
}
    @When("I send HTTP request Create a new order")
    public void sendGetHttpRequestcreateaneworder(){
        order.sendGetHttpRequestcreateaneworder();
    }
    @Then("I receive valid HTTP response code 200 Create a new order")
    public void respon200createaneworder(){order.respon200createaneworder();}

    @Given("I set endpoints Create a new order without Authorization")
    public void setendpointcreateaneworderwithoutAuthorization(){
        order.setendpointcreateaneworderwithoutAuthorization();
    }
    @When("I send HTTP request Create a new order without Authorization")
    public void sendGetHttpRequestcreateaneworderwithoutAuthorization(){
        order.sendGetHttpRequestcreateaneworderwithoutAuthorization();
    }
    @Then("I receive valid HTTP response code 401 Create a new order without Authorization")
    public void respon401createaneworderwithoutAuthorization(){order.respon401createaneworderwithoutAuthorization();}



//    Get all orders
    @Given("I set endpoints Get all orders")
    public void setendpointGetallorder(){
        order.setendpointGetallorder();
    }
    @When("I send HTTP request Get all orders")
    public void sendGetHttpRequestgetallorder(){
        order.sendGetHttpRequestgetallorder();
    }
    @Then("I receive valid HTTP response code 200 Get all orders")
    public void respon200getallorder(){order.respon200getallorder();}

    @Given("I set endpoints Get all orders without Authorization")
    public void setendpointGetallorderwithoutAuthorization(){
        order.setendpointGetallorderwithoutAuthorization();
    }
    @When("I send HTTP request Get all orders without Authorization")
    public void sendGetHttpRequestgetallorderwithoutAuthorization(){
        order.sendGetHttpRequestgetallorderwithoutAuthorization();
    }
    @Then("I receive valid HTTP response code 401 Get all orders without Authorization")
    public void respon401getallorderwithoutAuthorization(){order.respon401getallorderwithoutAuthorization();}

//    Get order by ID
    @Given("I set endpoints Get order by ID")
    public void setendpointGetorderbyID(){
    order.setendpointGetorderbyID();
}
    @When("I send HTTP request Get order by ID")
    public void sendGetHttpRequestGetorderbyID(){
        order.sendGetHttpRequestGetorderbyID();
    }
    @Then("I receive valid HTTP response code 200 Get order by ID")
    public void respon200GetorderbyID(){order.respon200GetorderbyID();}

    @Given("I set endpoints Get order by ID without Authorization")
    public void setendpointGetorderbyIDwithoutAuthorization(){
        order.setendpointGetorderbyIDwithoutAuthorization();
    }
    @When("I send HTTP request Get order by ID without Authorization")
    public void sendGetHttpRequestGetorderbyIDwithoutAuthorization(){
        order.sendGetHttpRequestGetorderbyIDwithoutAuthorization();
    }
    @Then("I receive valid HTTP response code 401 Get order by ID without Authorization")
    public void respon401GetorderbyIDwithoutAuthorization(){order.respon401GetorderbyIDwithoutAuthorization();}
}
