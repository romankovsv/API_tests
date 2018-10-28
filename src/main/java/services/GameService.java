package services;

import entity.Game;
import utils.Genarator;

public class GameService {

    public  Game getGame(){
        return new Game()
                .setId(Genarator.generateRandomInt(1,999))
                .setCategory("Shooter")
                .setName("Ducks strike back")
                .setRating("Universal")
                .setReleaseDate("2005-09-09")
                .setReviewScore(98);
    }
}
