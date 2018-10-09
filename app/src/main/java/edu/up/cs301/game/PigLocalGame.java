package edu.up.cs301.game;

import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.actionMsg.PigHoldAction;
import edu.up.cs301.game.actionMsg.PigRollAction;
import edu.up.cs301.game.infoMsg.PigGameState;

public class PigLocalGame extends LocalGame {

    PigGameState gameState;

    public PigLocalGame()
    {
        gameState = new PigGameState();
    }



    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {

    }

    @Override
    protected boolean canMove(int playerIdx) {
        if(playerIdx == gameState.getPlayerID() )
        {
            return true;
        }
        else { return false;}
    }

    @Override
    protected String checkIfGameOver() {
        return null;
    }

    @Override
    protected boolean makeMove(GameAction action) {
        if( action instanceof PigHoldAction )
        {
            gameState.setPlayer0Score();
            //player.length to see 

        }



        if( action instanceof PigRollAction)
        {

        }

        return false;
    }
}
