import entity.Game;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import services.GameService;
import services.Request;

import java.util.Arrays;
import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.is;
import static org.testng.Assert.assertTrue;

public class GamesTests {


    @BeforeTest
    public void setUp(){
        baseURI = "http://localhost:8080/app";
    }

    @Test
    public void getFirstGame(){

    new Request()
                .request()
                .when()
                .get("/videogames/1")
                .then()
                .statusCode(200)
                .body("id", is(1));

    }

    @Test
    public void firstGameNameIs(){

        new Request()
                .request()
                .when()
                .get("/videogames/1")
                 .then()
                .body("name", is("Resident Evil 4"));

    }

    @Test
    public void newGameCouldBeAdded(){

        Game game = new GameService().getGame();

        new Request()
                .createGame(game)
                .then()
                .statusCode(HttpStatus.SC_OK);

        Game[] games = new Request()
                .request()
                .when()
                .get("videogames")
                .as(Game[].class);

        assertTrue(Arrays.asList(games).stream()
            .anyMatch(e->e.getName().equals(game.getName())));

    }
}
