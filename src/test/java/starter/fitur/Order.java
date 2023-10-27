package starter.fitur;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class Order {

//    Create a new order
    protected static String urlcreateorder = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Create a new order")
    public String setendpointcreateaneworder(){

        return urlcreateorder + "orders";
    }

    @Step("I send HTTP request Create a new order")
    public void sendGetHttpRequestcreateaneworder(){
        JSONArray orderItems = new JSONArray();
        JSONObject orderItem = new JSONObject();
        orderItem.put("product_id", 11649);
        orderItem.put("quantity", 1);
        orderItems.add(orderItem);

        JSONArray requestBody = new JSONArray();
        JSONObject orderCreate = new JSONObject();
        orderCreate.put("order_items", orderItems);
        requestBody.add(orderCreate);

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkRpa2Egc2EiLCJFbWFpbCI6ImFrdWluaXNpYXBhQGdtYWlsLmNvbSJ9.57VqbC4d57SpJ7VdUYO8wnVAHzd-XDebdAEg1p6DGfM")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setendpointcreateaneworder());

    }

    @Step("I receive valid HTTP response code 200 Create a new order")
    public void respon200createaneworder(){

        restAssuredThat(response -> response.statusCode(200));
    }


    protected static String urlcreateorderwithoutAuthorization = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Create a new order without Authorization")
    public String setendpointcreateaneworderwithoutAuthorization(){

        return urlcreateorderwithoutAuthorization + "orders";
    }

    @Step("I send HTTP request Create a new order without Authorization")
    public void sendGetHttpRequestcreateaneworderwithoutAuthorization(){
        JSONArray orderItems = new JSONArray();
        JSONObject orderItem = new JSONObject();
        orderItem.put("product_id", 11649);
        orderItem.put("quantity", 1);
        orderItems.add(orderItem);

        JSONArray requestBody = new JSONArray();
        JSONObject orderCreate = new JSONObject();
        orderCreate.put("order_items", orderItems);
        requestBody.add(orderCreate);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setendpointcreateaneworderwithoutAuthorization());

    }

    @Step("I receive valid HTTP response code 401 Create a new order without Authorization")
    public void respon401createaneworderwithoutAuthorization(){

        restAssuredThat(response -> response.statusCode(401));
    }


//    Get all orders
    protected static String urlgetallorder = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Get all orders")
    public String setendpointGetallorder(){

        return urlgetallorder + "orders";
    }

    @Step("I send HTTP request Get all orders")
    public void sendGetHttpRequestgetallorder(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkRpa2Egc2EiLCJFbWFpbCI6ImFrdWluaXNpYXBhQGdtYWlsLmNvbSJ9.57VqbC4d57SpJ7VdUYO8wnVAHzd-XDebdAEg1p6DGfM")
                .when()
                .get(setendpointGetallorder());
    }

    @Step("I receive valid HTTP response code 200 Get all orders")
    public void respon200getallorder(){

        restAssuredThat(response -> response.statusCode(200));
    }


    protected static String urlgetallorderwithoutAuthorization = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Get all orders without Authorization")
    public String setendpointGetallorderwithoutAuthorization(){

        return urlgetallorderwithoutAuthorization + "orders";
    }

    @Step("I send HTTP request Get all orders without Authorization")
    public void sendGetHttpRequestgetallorderwithoutAuthorization(){
        SerenityRest.given()
                .when()
                .get(setendpointGetallorderwithoutAuthorization());
    }

    @Step("I receive valid HTTP response code 401 Get all orders without Authorization")
    public void respon401getallorderwithoutAuthorization(){

        restAssuredThat(response -> response.statusCode(401));
    }

//    Get order by ID
protected static String urlgetorderbyID = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Get order by ID")
    public String setendpointGetorderbyID(){

        return urlgetorderbyID + "orders/12283";
    }

    @Step("I send HTTP request Get order by ID")
    public void sendGetHttpRequestGetorderbyID(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkRpa2Egc2EiLCJFbWFpbCI6ImFrdWluaXNpYXBhQGdtYWlsLmNvbSJ9.57VqbC4d57SpJ7VdUYO8wnVAHzd-XDebdAEg1p6DGfM")
                .when()
                .get(setendpointGetorderbyID());
    }

    @Step("I receive valid HTTP response code 200 Get order by ID")
    public void respon200GetorderbyID(){

        restAssuredThat(response -> response.statusCode(200));
    }

    protected static String urlgetorderbyIDwithoutAuthorization = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Get order by ID without Authorization")
    public String setendpointGetorderbyIDwithoutAuthorization(){

        return urlgetorderbyID + "orders/12283";
    }

    @Step("I send HTTP request Get order by ID without Authorization")
    public void sendGetHttpRequestGetorderbyIDwithoutAuthorization(){
        SerenityRest.given()
                .when()
                .get(setendpointGetorderbyIDwithoutAuthorization());
    }

    @Step("I receive valid HTTP response code 401 Get order by ID without Authorization")
    public void respon401GetorderbyIDwithoutAuthorization(){

        restAssuredThat(response -> response.statusCode(401));
    }

}
