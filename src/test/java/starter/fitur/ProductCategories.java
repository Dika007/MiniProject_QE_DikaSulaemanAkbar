package starter.fitur;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class ProductCategories {

//    Create a category
    protected static String urlcreatecategory = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Create a category")
    public String setendpointcreateacategory(){

        return urlcreatecategory + "categories";
    }

    @Step("I send HTTP request Create a category")
    public void sendGetHttpRequestcreateacategory(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "gaming");
        requestBody.put("description", "for gaming purposes");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setendpointcreateacategory());
    }

    @Step("I receive valid HTTP response code 200 Create a category")
    public void responcode200createacategory(){

        restAssuredThat(response -> response.statusCode(200));
    }

    protected static String urlcreatecategorywithoutdescriptions = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Create a category without descriptions")
    public String setendpointcreateacategorywithoutdescriptions(){

        return urlcreatecategorywithoutdescriptions + "categories";
    }

    @Step("I send HTTP request Create a category without descriptions")
    public void sendGetHttpRequestcreateacategorywithoutdescriptions(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "gaming");
        requestBody.put("description", "");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setendpointcreateacategory());
    }

    @Step("I receive valid HTTP response code 200 Create a category without descriptions")
    public void responcode200createacategorywithoutdescriptions(){

        restAssuredThat(response -> response.statusCode(200));
    }

//    Get category by ID

    protected static String urlgetcategorybyID = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Get category by ID")
    public String setendpointgetcategorybyID(){

        return urlgetcategorybyID + "categories/29819";
    }

    @Step("I send HTTP request Get category by ID")
    public void sendGetHttpRequestgetcategorybyID(){
        SerenityRest.given()
                .when()
                .get(setendpointgetcategorybyID());
    }

    @Step("I receive valid HTTP response code 200 Get category by ID")
    public void responcode200getcategorybyID(){

        restAssuredThat(response -> response.statusCode(200));
    }

//    Get all categories

    protected static String urlgetallcategory = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Get all categories")
    public String setendpointgetallcategory(){

        return urlgetallcategory + "categories";
    }

    @Step("I send HTTP request Get all categories")
    public void sendGetHttpRequestgetallcategory(){
        SerenityRest.given()
                .when()
                .get(setendpointgetallcategory());
    }

    @Step("I receive valid HTTP response code 200 Get all categories")
    public void responcode200getallcategory(){

        restAssuredThat(response -> response.statusCode(200));
    }


//    Delete a category
    protected static String urldeleteacategory = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Delete a category")
    public String setendpointdeleteacategory(){

        return urldeleteacategory + "categories/29719";
    }

    @Step("I send HTTP request Delete a category")
    public void sendGetHttpRequestdeleteacategory(){
        SerenityRest.given().delete(setendpointdeleteacategory());
    }

    @Step("I receive valid HTTP response code 200 Delete a category")
    public void responcode200deleteacategory(){

        restAssuredThat(response -> response.statusCode(200));
    }
}
