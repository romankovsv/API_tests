package services;

import entity.Game;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Request {

    public  RequestSpecification request(){
        return given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    public Response createGame(Game game){
        return request()
                .body(game)
                .post("/videogames");
    }
}
