package starter.fitur;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Hello {

    //    index
    protected static String urlindex = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints Index")
    public String setendpointindex(){

        return urlindex + "hello";
    }

    @Step("I send HTTP request Index")
    public void sendGetHttpRequestindex(){
        SerenityRest.given()
                .when()
                .get(setendpointindex());
    }

    @Step("I receive valid HTTP response code 200 Index")
    public void respon200index(){

        restAssuredThat(response -> response.statusCode(200));
    }


    protected static String urlwrongindex = "https://altashop-api.fly.dev/api/";

    @Step("I set endpoints wrong index")
    public String setendpointwrongindex(){

        return urlwrongindex + "helloo";
    }

    @Step("I send HTTP request wrong index")
    public void sendGetHttpRequestwrongindex(){
        SerenityRest.given()
                .when()
                .get(setendpointwrongindex());
    }

    @Step("I receive valid HTTP response code 404 wrong index")
    public void respon404wrongindex(){

        restAssuredThat(response -> response.statusCode(404));
    }
}
