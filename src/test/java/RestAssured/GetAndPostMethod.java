package RestAssured;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetAndPostMethod {
    @Test
    public void GETDemo(){
        baseURI= "https://reqres.in/api";
        given().
                get("/users?page=2").
                then().
                statusCode(200).
                body("data[4].first_name",equalTo("George")).
                body("data.first_name",hasItems("George","Rachel"));
    }

    @Test
    public void POSTDemo(){
        Map<String, Object> map = new HashMap<String, Object>();

        //We can use map to use the post method
 /*       map.put("name", "Shiwani");
        map.put("job", "Tester");
        System.out.println(map);


        //to convert into json format use json object
        JSONObject jsonObject = new JSONObject(map);

        System.out.println(jsonObject);   */

        //And we can use directly json object to use post method
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Shiwani");
        jsonObject.put("job", "Tester");
        System.out.println(jsonObject);

        baseURI = "https://reqres.in/api";
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(jsonObject.toJSONString()).
                when().
                post("/users").
                then().
                statusCode(201).
                log().all();
    }
}
