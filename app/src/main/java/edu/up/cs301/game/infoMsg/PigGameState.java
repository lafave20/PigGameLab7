package edu.up.cs301.game.infoMsg;

public class PigGameState extends GameState   {

    private int playerID;
    private int player0Score;
    private int player1Score;
    private int runningTotal;
    private int dieVal;


    public PigGameState( ) {

        playerID = 0;
        player0Score = 0;
        player1Score = 0;
        runningTotal = 0;
        dieVal =0;

    }

    public PigGameState( PigGameState loadGame ) {

        playerID = loadGame.playerID;
        player0Score = loadGame.player0Score;
        player1Score = loadGame.player1Score;
        runningTotal = loadGame.runningTotal;
        dieVal = loadGame.dieVal;

    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID( int id) {
        playerID = id;
    }


    public int getPlayer0Score() {
        return player0Score;
    }

    public void setPlayer0Score( int score) {
        player0Score = score;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score( int score) {
        player1Score = score;
    }


    public int getRunningTotal() {
        return runningTotal;
    }

    public void setRunningTotal(int points) {
        runningTotal = points;
    }
    public int getDieVal() {
        return dieVal;
    }

    public void setDieVal(int value) {
        dieVal = value;
    }




}


