package RestAssured;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

public class PutPatchDeleteMethod {

    @Test
    public void PUTDemo(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Shiwani");
        jsonObject.put("job", "Tester");

        System.out.println(jsonObject.toJSONString());

        baseURI = "https://reqres.in/api";
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(jsonObject.toJSONString()).
                when().
                put("/users/2").
                then().
                statusCode(200).
                log().all();
    }

    @Test
    public void PATCHDemo(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Shiwani");
        jsonObject.put("job", "Tester");

        System.out.println(jsonObject.toJSONString());

        baseURI = "https://reqres.in";
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(jsonObject.toJSONString()).
                when().
                patch("/api/users/2").
                then().
                statusCode(200).
                log().all();

    }

    @Test
    public void DELETEDemo(){

        baseURI = "https://reqres.in";
                when().
                delete("/api/users/2").
                then().
                statusCode(204).
                log().all();

    }
}
