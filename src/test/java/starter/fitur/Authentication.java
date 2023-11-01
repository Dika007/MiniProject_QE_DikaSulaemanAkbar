package starter.fitur;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Authentication {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints register")
    public String setApiEndpoint(){

        return url + "auth/register";
    }

    @Step("I send HTTP request")
    public void sendGetHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "djacboaboucbiocmidnisas@mail.com");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "Firstname Lastname");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200(){

        restAssuredThat(response -> response.statusCode(200));
    }


    protected static String url1 = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints register1")
    public String setApiEndpoint1(){

        return url1 + "auth/register";
    }

    @Step("I send HTTP request1")
    public void sendGetHttpRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "Firstname Lastname");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpoint1());
    }

    @Step("I receive valid HTTP response code 400")
    public void validateHttpResponseCode400(){

        restAssuredThat(response -> response.statusCode(400));
    }

    protected static String url3 = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints register2")
    public String setApiEndpoint2(){

        return url3 + "auth/register";
    }

    @Step("I send HTTP request2")
    public void sendGetHttpRequest2(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "heelo@mail.com");
        requestBody.put("password", "");
        requestBody.put("fullname", "Firstname Lastname");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpoint2());
    }

    @Step("I receive valid HTTP response code1 400")
    public void validateHttpResponseCode1400(){

        restAssuredThat(response -> response.statusCode(400));
    }


    protected static String url4 = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints register3")
    public String setApiEndpoint3(){

        return url4 + "auth/register";
    }

    @Step("I send HTTP request3")
    public void sendGetHttpRequest3(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "heelo@mail.com");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpoint3());
    }

    @Step("I receive valid HTTP response code2 400")
    public void validateHttpResponseCode2400(){

        restAssuredThat(response -> response.statusCode(400));
    }


    protected static String url5 = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints register4")
    public String setApiEndpoint4(){

        return url5 + "auth/register";
    }

    @Step("I send HTTP request4")
    public void sendGetHttpRequest4(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone@mail.com");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "Firstname Lastname");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpoint4());
    }

    @Step("I receive valid HTTP response code3 400")
    public void validateHttpResponseCode3400(){

        restAssuredThat(response -> response.statusCode(400));
    }

//    login
protected static String urlLogin = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints login")
    public String setGetApiEndpointLogin(){

        return urlLogin + "auth/login";
    }

    @Step("I send HTTP request login")
    public void sendGetHttpRequestLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akuinisiapa@gmail.com");
        requestBody.put("password", "admin123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setGetApiEndpointLogin());
    }

    @Step("I receive valid HTTP response code 200 login")
    public void receiveValidHttpResponseCodeLogin(){

        restAssuredThat(response -> response.statusCode(200));
    }


    protected static String urlLogin1 = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints login1")
    public String setGetApiEndpointLogin1(){

        return urlLogin1 + "auth/login";
    }

    @Step("I send HTTP request login1")
    public void sendGetHttpRequestLogin1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "123123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setGetApiEndpointLogin1());
    }

    @Step("I receive valid HTTP response code 400 login1")
    public void receiveValidHttpResponseCodeLogin1(){

        restAssuredThat(response -> response.statusCode(400));
    }


    protected static String urlLogin2 = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints login2")
    public String setGetApiEndpointLogin2(){

        return urlLogin2 + "auth/login";
    }

    @Step("I send HTTP request login2")
    public void sendGetHttpRequestLogin2(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone@mail.com");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setGetApiEndpointLogin2());
    }

    @Step("I receive valid HTTP response code 400 login2")
    public void receiveValidHttpResponseCodeLogin2(){

        restAssuredThat(response -> response.statusCode(400));
    }


    protected static String urlLogin3 = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints login3")
    public String setGetApiEndpointLogin3(){

        return urlLogin3 + "auth/login";
    }

    @Step("I send HTTP request login3")
    public void sendGetHttpRequestLogin3(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "apsnaindiadad@mail.com");
        requestBody.put("password", "123123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setGetApiEndpointLogin3());
    }

    @Step("I receive valid HTTP response code 400 login3")
    public void receiveValidHttpResponseCodeLogin3(){

        restAssuredThat(response -> response.statusCode(400));
    }

    protected static String urlLogin4 = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints login4")
    public String setGetApiEndpointLogin4(){

        return urlLogin4 + "auth/login";
    }

    @Step("I send HTTP request login4")
    public void sendGetHttpRequestLogin4(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone@mail.com");
        requestBody.put("password", "siapatuh123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setGetApiEndpointLogin4());
    }

    @Step("I receive valid HTTP response code 400 login4")
    public void receiveValidHttpResponseCodeLogin4(){

        restAssuredThat(response -> response.statusCode(400));
    }

//information

    protected static String urlinformation = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints information")
    public String setendpointinformation(){

        return urlinformation + "auth/info";
    }

    @Step("I send HTTP request information")
    public void sendgethttprequest(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkRpa2Egc2EiLCJFbWFpbCI6ImFrdWluaXNpYXBhQGdtYWlsLmNvbSJ9.57VqbC4d57SpJ7VdUYO8wnVAHzd-XDebdAEg1p6DGfM")
                .when()
                .get(setendpointinformation());
    }

    @Step("I receive valid HTTP response code 200 information")
    public void informationresponse(){

        restAssuredThat(response -> response.statusCode(200));
    }










    protected static String urlinformation1 = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints information1")
    public String setendpointinformation1(){

        return urlinformation1 + "auth/info";
    }

    @Step("I send HTTP request information1")
    public void sendGetHttpRequesinformation1(){
        SerenityRest.given()
                .when()
                .get(setendpointinformation1());
    }

    @Step("I receive valid HTTP response code 401 information1")
    public void response401Information(){

        restAssuredThat(response -> response.statusCode(401));
    }



}
