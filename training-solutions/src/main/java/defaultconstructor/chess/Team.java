package defaultconstructor.chess;

public class Team {
    private Player playerOne;
    private Player playerTwo;

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void keepPlaceOne() {
        this.playerOne = new Player();
    }

    public void keepPlaceTwo() {
        this.playerTwo = new Player();
    }
}
