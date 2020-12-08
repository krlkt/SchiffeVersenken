package schiffeversenken;

public interface SchiffeVersenken {
    /**
     *
     * @param userName player name
     * @param s The ship which is going to be set
     * @param Richtung the direction the ship is going to be placed starting from the start position
     * @param startPosition the start position when placing a ship on board
     */
    public void set(String userName, Schiff s, String Richtung, BoardPosition startPosition) throws GameException, StatusException;


    /**
     *
     * @param userName player name
     * @return true when a player has put all of their ships on the board, else false
     */
    public boolean allSet(String userName);

    /**
     *
     * @param userName player name
     * @param position targeted position to shoot at
     * @return true when userName wins (after hitting enemy's last part of last ship)
     */
    public boolean shoot(String userName, BoardPosition position);
}
