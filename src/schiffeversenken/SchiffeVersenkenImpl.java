package schiffeversenken;

import java.util.HashMap;

public class SchiffeVersenkenImpl implements SchiffeVersenken {
    private Status status = Status.START;
    private Board board = new Board(); //Bin immer noch nicht sicher wie ich weiter machen soll

    @Override
    public void set(String userName, Schiff s, String Richtung, BoardPosition startPosition) throws GameException, StatusException{
        if(this.status != Status.START){
            throw new StatusException("set called but wrong status");
        }





    }

    @Override
    public boolean allSet(String userName) {
        return false;
    }

    @Override
    public boolean shoot(String userName, BoardPosition position) {
        return false;
    }
}
