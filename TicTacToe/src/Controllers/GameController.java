package Controllers;

import main.Player;
import main.game;
import main.gameState;

import java.util.List;

public class GameController {
    //validate if 2 players have same symbol
    //if they have same symbol throw exception
    public game startGame(int dimension, List<Player> players){
        return new game(dimension,players);
    }

    public void makeMove(game game){
        return;
    }

    public gameState checkState(game game){
        return game.getgameState();

        public Player getWinner(game game) {
            return game.getWinner();
        }

        public void printBoard(game game) {
            game.printBoard();
        }
    }
}
