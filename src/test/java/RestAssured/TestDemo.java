package RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
//import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {
    @Test
    public void testing() {

        //Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        //We can also use rest assured using static keyword

        Response response =get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("Content-Type"));

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }

    @Test
    public void testing2(){
        baseURI = "https://reqres.in/api";
        given().
                get("/users?page=2").
                then().statusCode(200).
                body("data[1].id",equalTo(8)).
                log().all();
    }
}

