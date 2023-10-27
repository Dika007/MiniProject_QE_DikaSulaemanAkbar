package starter.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.ProductCategories;
public class ProductCategoriesSteps {
    @Steps
    ProductCategories productCategories;

//    Create a category
    @Given("I set endpoints Create a category")
    public void setendpointcreateacategory(){
        productCategories.setendpointcreateacategory();
    }
    @When("I send HTTP request Create a category")
    public void sendGetHttpRequestcreateacategory(){productCategories.sendGetHttpRequestcreateacategory();}
    @Then("I receive valid HTTP response code 200 Create a category")
    public void responcode200createacategory(){
        productCategories.responcode200createacategory();
    }

    @Given("I set endpoints Create a category without descriptions")
    public void setendpointcreateacategorywithoutdescriptions(){
        productCategories.setendpointcreateacategorywithoutdescriptions();
    }
    @When("I send HTTP request Create a category without descriptions")
    public void sendGetHttpRequestcreateacategorywithoutdescriptions(){productCategories.sendGetHttpRequestcreateacategorywithoutdescriptions();}
    @Then("I receive valid HTTP response code 200 Create a category without descriptions")
    public void responcode200createacategorywithoutdescriptions(){
        productCategories.responcode200createacategorywithoutdescriptions();
    }

//    Get category by ID
    @Given("I set endpoints Get category by ID")
    public void setendpointgetcategorybyID(){
    productCategories.setendpointgetcategorybyID();
}
    @When("I send HTTP request Get category by ID")
    public void sendGetHttpRequestgetcategorybyID(){productCategories.sendGetHttpRequestgetcategorybyID();}
    @Then("I receive valid HTTP response code 200 Get category by ID")
    public void responcode200getcategorybyID(){
        productCategories.responcode200getcategorybyID();
    }

//    Get all categories
    @Given("I set endpoints Get all categories")
    public void setendpointgetallcategory(){
    productCategories.setendpointgetallcategory();
}
    @When("I send HTTP request Get all categories")
    public void sendGetHttpRequestgetallcategory(){productCategories.sendGetHttpRequestgetallcategory();}
    @Then("I receive valid HTTP response code 200 Get all categories")
    public void responcode200getallcategory(){
        productCategories.responcode200getallcategory();
    }

//    Delete a category
    @Given("I set endpoints Delete a category")
    public void setendpointdeleteacategory(){
    productCategories.setendpointdeleteacategory();
}
    @When("I send HTTP request Delete a category")
    public void sendGetHttpRequestdeleteacategory(){productCategories.sendGetHttpRequestdeleteacategory();}
    @Then("I receive valid HTTP response code 200 Delete a category")
    public void responcode200deleteacategory(){
        productCategories.responcode200deleteacategory();
    }
}
