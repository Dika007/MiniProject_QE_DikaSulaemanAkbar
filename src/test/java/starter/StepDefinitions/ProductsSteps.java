package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Products;
public class ProductsSteps {
    @Steps
    Products products;

//    get all product
    @Given("I set endpoints get all product")
    public void setendpointgetallproduct(){
        products.setendpointgetallproduct();
    }
    @When("I send HTTP request get all product")
    public void sendGetHttpRequestgetallproduct(){products.sendGetHttpRequestgetallproduct();}
    @Then("I receive valid HTTP response code 200 get all product")
    public void responcode200getallproduct(){
        products.responcode200getallproduct();
    }

//    create a new product
    @Given("I set endpoints new product")
    public void setendpointnewproduct(){
    products.setendpointnewproduct();
}
    @When("I send HTTP request new product")
    public void sendGetHttpRequestnewproduct(){products.sendGetHttpRequestnewproduct();}
    @Then("I receive valid HTTP response code 200 new product")
    public void responcode200newproduct(){
        products.responcode200newproduct();
    }

    @Given("I set endpoints without a description")
    public void setendpointwithoutadescription(){
        products.setendpointwithoutadescription();
    }
    @When("I send HTTP request without a description")
    public void sendGetHttpRequestwithoutadescription(){products.sendGetHttpRequestwithoutadescription();}
    @Then("I receive valid HTTP response code 200 without a description")
    public void responcode200withoutadescription(){
        products.responcode200withoutadescription();
    }

    @Given("I set endpoints without price")
    public void setendpointwithoutprice(){
        products.setendpointwithoutprice();
    }
    @When("I send HTTP request without price")
    public void sendGetHttpRequestwithoutprice(){products.sendGetHttpRequestwithoutprice();}
    @Then("I receive valid HTTP response code 400 without price")
    public void responcode400withoutprice(){
        products.responcode400withoutprice();
    }

//    Get product By ID
    @Given("I set endpoints get product by ID")
    public void setendpointgetproductbyid(){
    products.setendpointgetproductbyid();
}
    @When("I send HTTP request get product by ID")
    public void sendGetHttpRequestgetproductbyid(){products.sendGetHttpRequestgetproductbyid();}
    @Then("I receive valid HTTP response code 200 get product by ID")
    public void responcode200getproductbyid(){
        products.responcode200getproductbyid();
    }

    @Given("I set endpoints get product by ID without Authorization")
    public void setendpointgetproductbyidwithoutAuthorization(){
        products.setendpointgetproductbyidwithoutAuthorization();
    }
    @When("I send HTTP request get product by ID without Authorization")
    public void sendGetHttpRequestgetproductbyidwithoutAuthorization(){products.sendGetHttpRequestgetproductbyidwithoutAuthorization();}
    @Then("I receive valid HTTP response code 200 get product by ID without Authorization")
    public void responcode200getproductbyidwithoutAuthorization(){
        products.responcode200getproductbyidwithoutAuthorization();
    }

//    Delete a product
    @Given("I set endpoints Delete a product")
    public void setendpointdeleteaproduct(){
    products.setendpointdeleteaproduct();
}
    @When("I send HTTP request Delete a product")
    public void sendGetHttpRequestdeleteaproduct(){products.sendGetHttpRequestdeleteaproduct();}
    @Then("I receive valid HTTP response code 200 Delete a product")
    public void responcode200deleteaproduct(){
        products.responcode200deleteaproduct();
    }

//    Assign a product rating
    @Given("I set endpoints Assign a product rating")
    public void setendpointratingproduct(){
    products.setendpointratingproduct();
}
    @When("I send HTTP request Assign a product rating")
    public void sendGetHttpRequestratingproduct(){products.sendGetHttpRequestratingproduct();}
    @Then("I receive valid HTTP response code 200 Assign a product rating")
    public void responcode200ratingproduct(){
        products.responcode200ratingproduct();
    }

    @Given("I set endpoints Assign a product rating without Authorization")
    public void setendpointratingproductwithoutAuthorization(){
        products.setendpointratingproductwithoutAuthorization();
    }
    @When("I send HTTP request Assign a product rating without Authorization")
    public void sendGetHttpRequestratingproductwithoutAuthorization(){products.sendGetHttpRequestratingproductwithoutAuthorization();}
    @Then("I receive valid HTTP response code 401 Assign a product rating without Authorization")
    public void responcode401ratingproductwithoutAuthorization(){
        products.responcode401ratingproductwithoutAuthorization();
    }

//    Get product ratings
    @Given("I set endpoints Get product ratings")
    public void setendpointgetproductrating(){
    products.setendpointgetproductrating();
}
    @When("I send HTTP request Get product ratings")
    public void sendGetHttpRequestgetproductrating(){products.sendGetHttpRequestgetproductrating();}
    @Then("I receive valid HTTP response code 200 Get product ratings")
    public void responcode200getproductrating(){
        products.responcode200getproductrating();
    }

//    Create a comment for product
    @Given("I set endpoints create comment product")
    public void setendpointcreatecommentproduct(){
    products.setendpointcreatecommentproduct();
}
    @When("I send HTTP request create comment product")
    public void sendGetHttpRequestcreatecommentproduct(){products.sendGetHttpRequestcreatecommentproduct();}
    @Then("I receive valid HTTP response code 200 create comment product")
    public void responcode200createcommentproduct(){
        products.responcode200createcommentproduct();
    }

    @Given("I set endpoints create comment product without Authorization")
    public void setendpointcreatecommentproductwithoutAuthorization(){
        products.setendpointcreatecommentproductwithoutAuthorization();
    }
    @When("I send HTTP request create comment product without Authorization")
    public void sendGetHttpRequestcreatecommentproductwithoutAuthorization(){products.sendGetHttpRequestcreatecommentproductwithoutAuthorization();}
    @Then("I receive valid HTTP response code 401 create comment product without Authorization")
    public void responcode401createcommentproductwithoutAuthorization(){
        products.responcode401createcommentproduct();
    }

//    Get product comments
    @Given("I set endpoints Get product comments")
    public void setendpointgetproductcomment(){
    products.setendpointgetproductcomment();
}
    @When("I send HTTP request Get product comments")
    public void sendGetHttpRequestgetproductcoment(){products.sendGetHttpRequestgetproductcoment();}
    @Then("I receive valid HTTP response code 200 Get product comments")
    public void responcode200getproductcomment(){
        products.responcode200getproductcomment();
    }
}
