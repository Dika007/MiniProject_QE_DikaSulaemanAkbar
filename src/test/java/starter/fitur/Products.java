package starter.fitur;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class Products {

//    get all product
    protected static String urlgetallproduct = "https://altashop-api.fly.dev/api";

    @Step("I set endpoints get all product")
    public String setendpointgetallproduct(){

        return urlgetallproduct + "/products";
    }

    @Step("I send HTTP request get all product")
    public void sendGetHttpRequestgetallproduct(){
        SerenityRest.given()
                .when()
                .get(setendpointgetallproduct());
    }

    @Step("I receive valid HTTP response code 200 get all product")
    public void responcode200getallproduct(){

        restAssuredThat(response -> response.statusCode(200));
    }

//    create a new product
protected static String urlcreateanewproduct = "https://altashop-api.fly.dev/api";

    @Step("I set endpoints new product")
    public String setendpointnewproduct(){

        return urlcreateanewproduct + "/products";
    }

    @Step("I send HTTP request new product")
    public void sendGetHttpRequestnewproduct(){
        JSONArray orderItems = new JSONArray();
        JSONObject orderItem = new JSONObject();
        ArrayList<Integer> categories = new ArrayList<Integer>();
        categories.add(1);
        orderItem.put("name", "hello worl");
        orderItem.put("description", "play has no limits");
        orderItem.put("price", 100);
        orderItem.put("categories", categories);

//        JSONArray requestBody = new JSONArray();
//        JSONObject orderCreate = new JSONObject();
//        orderCreate.put("order_items", orderItems);
//        requestBody.add(orderCreate);

        SerenityRest.given().header("Content-Type", "application/json").body(orderItem.toJSONString()).post(setendpointnewproduct());
    }

    @Step("I receive valid HTTP response code 200 new product")
    public void responcode200newproduct(){

        restAssuredThat(response -> response.statusCode(200));
    }



    protected static String urlcreateanewproductwithoutadec = "https://altashop-api.fly.dev/api";

    @Step("I set endpoints without a description")
    public String setendpointwithoutadescription(){

        return urlcreateanewproductwithoutadec + "/products";
    }

    @Step("I send HTTP request without a description")
    public void sendGetHttpRequestwithoutadescription(){
        JSONArray orderItems = new JSONArray();
        JSONObject orderItem = new JSONObject();
        ArrayList<Integer> categories = new ArrayList<Integer>();
        categories.add(1);
        orderItem.put("name", "hello worl");
        orderItem.put("description", "");
        orderItem.put("price", 100);
        orderItem.put("categories", categories);

//        JSONArray requestBody = new JSONArray();
//        JSONObject orderCreate = new JSONObject();
//        orderCreate.put("order_items", orderItems);
//        requestBody.add(orderCreate);

        SerenityRest.given().header("Content-Type", "application/json").body(orderItem.toJSONString()).post(setendpointwithoutadescription());
    }

    @Step("I receive valid HTTP response code 200 new product without a description")
    public void responcode200withoutadescription(){

        restAssuredThat(response -> response.statusCode(200));
    }


    protected static String urlcreateanewproductwithoutprice = "https://altashop-api.fly.dev/api";

    @Step("I set endpoints without price")
    public String setendpointwithoutprice(){

        return urlcreateanewproductwithoutprice + "/products";
    }

    @Step("I send HTTP request without price")
    public void sendGetHttpRequestwithoutprice(){
        JSONArray orderItems = new JSONArray();
        JSONObject orderItem = new JSONObject();
        ArrayList<Integer> categories = new ArrayList<Integer>();
        categories.add(1);
        orderItem.put("name", "hello worl");
        orderItem.put("description", "");
        orderItem.put("price", "");
        orderItem.put("categories", categories);

//        JSONArray requestBody = new JSONArray();
//        JSONObject orderCreate = new JSONObject();
//        orderCreate.put("order_items", orderItems);
//        requestBody.add(orderCreate);

        SerenityRest.given().header("Content-Type", "application/json").body(orderItem.toJSONString()).post(setendpointwithoutprice());
    }

    @Step("I receive valid HTTP response code 400 without price")
    public void responcode400withoutprice(){

        restAssuredThat(response -> response.statusCode(400));
    }

//Get product By ID
    protected static String urlgetproductbyID = "https://altashop-api.fly.dev/api";

    @Step("I set endpoints get product by ID")
    public String setendpointgetproductbyid(){

        return urlgetproductbyID + "/products/86133";
    }

    @Step("I send HTTP request get product by ID")
    public void sendGetHttpRequestgetproductbyid(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkRpa2Egc2EiLCJFbWFpbCI6ImFrdWluaXNpYXBhQGdtYWlsLmNvbSJ9.57VqbC4d57SpJ7VdUYO8wnVAHzd-XDebdAEg1p6DGfM")
                .when()
                .get(setendpointgetallproduct());
    }

    @Step("I receive valid HTTP response code 200 get product by ID")
    public void responcode200getproductbyid(){

        restAssuredThat(response -> response.statusCode(200));
    }

    protected static String urlgetproductbyIDwithoutAuthorization = "https://altashop-api.fly.dev/api";

    @Step("I set endpoints get product by ID without Authorization")
    public String setendpointgetproductbyidwithoutAuthorization(){

        return urlgetproductbyIDwithoutAuthorization + "/products/86133";
    }

    @Step("I send HTTP request get product by ID without Authorization")
    public void sendGetHttpRequestgetproductbyidwithoutAuthorization(){
        SerenityRest.given()
                .when()
                .get(setendpointgetallproduct());
    }

    @Step("I receive valid HTTP response code 200 get product by ID without Authorization")
    public void responcode200getproductbyidwithoutAuthorization(){

        restAssuredThat(response -> response.statusCode(200));
    }

//    Delete a product
    protected static String urldeleteaproduct = "https://altashop-api.fly.dev/api";

    @Step("I set endpoints Delete a product")
    public String setendpointdeleteaproduct(){

        return urldeleteaproduct + "/products/1";
    }

    @Step("I send HTTP request Delete a product")
    public void sendGetHttpRequestdeleteaproduct(){
        SerenityRest.given().delete(setendpointdeleteaproduct());
    }

    @Step("I receive valid HTTP response code 200 Delete a product")
    public void responcode200deleteaproduct(){

        restAssuredThat(response -> response.statusCode(200));
    }


//    Assign a product rating

    protected static String urlratingproduct = "https://altashop-api.fly.dev/api";

    @Step("I set endpoints Assign a product rating")
    public String setendpointratingproduct(){

        return urlratingproduct + "/products/86133/ratings";
    }

    @Step("I send HTTP request Assign a product rating")
    public void sendGetHttpRequestratingproduct(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", "4");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkRpa2Egc2EiLCJFbWFpbCI6ImFrdWluaXNpYXBhQGdtYWlsLmNvbSJ9.57VqbC4d57SpJ7VdUYO8wnVAHzd-XDebdAEg1p6DGfM")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setendpointratingproduct());

    }

    @Step("I receive valid HTTP response code 200 Assign a product rating")
    public void responcode200ratingproduct(){

        restAssuredThat(response -> response.statusCode(200));
    }


    protected static String urlratingproductwithoutAuthorization = "https://altashop-api.fly.dev/api";

    @Step("I set endpoints Assign a product rating without Authorization")
    public String setendpointratingproductwithoutAuthorization(){

        return urlratingproductwithoutAuthorization + "/products/86133/ratings";
    }

    @Step("I send HTTP request Assign a product rating without Authorization")
    public void sendGetHttpRequestratingproductwithoutAuthorization(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", "4");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setendpointratingproductwithoutAuthorization());

    }

    @Step("I receive valid HTTP response code 401 Assign a product rating without Authorization")
    public void responcode401ratingproductwithoutAuthorization(){

        restAssuredThat(response -> response.statusCode(401));
    }

//    Get product ratings
protected static String urlgetproductratings = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Get product ratings")
    public String setendpointgetproductrating(){

        return urlgetproductratings + "products/1/ratings";
    }

    @Step("I send HTTP request Get product ratings")
    public void sendGetHttpRequestgetproductrating(){
        SerenityRest.given()
                .when()
                .get(setendpointgetallproduct());
    }

    @Step("I receive valid HTTP response code 200 Get product ratings")
    public void responcode200getproductrating(){

        restAssuredThat(response -> response.statusCode(200));
    }

//    Create a comment for product
    protected static String urlcreatecommentproduct = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints create comment product")
    public String setendpointcreatecommentproduct(){

        return urlcreatecommentproduct + "products/86133/comments";
    }

    @Step("I send HTTP request create comment product")
    public void sendGetHttpRequestcreatecommentproduct(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkRpa2Egc2EiLCJFbWFpbCI6ImFrdWluaXNpYXBhQGdtYWlsLmNvbSJ9.57VqbC4d57SpJ7VdUYO8wnVAHzd-XDebdAEg1p6DGfM")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setendpointcreatecommentproduct());

    }

    @Step("I receive valid HTTP response code 200 create comment product")
    public void responcode200createcommentproduct(){

        restAssuredThat(response -> response.statusCode(200));
    }

    protected static String urlcreatecommentproductwithoutAuthorization = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints create comment product without Authorization")
    public String setendpointcreatecommentproductwithoutAuthorization(){

        return urlcreatecommentproductwithoutAuthorization + "products/86133/comments";
    }

    @Step("I send HTTP request create comment product without Authorization")
    public void sendGetHttpRequestcreatecommentproductwithoutAuthorization(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setendpointratingproductwithoutAuthorization());

    }

    @Step("I receive valid HTTP response code 401 create comment product without Authorization")
    public void responcode401createcommentproduct(){

        restAssuredThat(response -> response.statusCode(401));
    }

//    Get product comments

    protected static String urlgetproductcomment = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Get product comments")
    public String setendpointgetproductcomment(){

        return urlgetproductcomment + "products/2/comments";
    }

    @Step("I send HTTP request Get product comments")
    public void sendGetHttpRequestgetproductcoment(){
        SerenityRest.given()
                .when()
                .get(setendpointgetproductcomment());
    }

    @Step("I receive valid HTTP response code 200 Get product comments")
    public void responcode200getproductcomment(){

        restAssuredThat(response -> response.statusCode(200));
    }
}
