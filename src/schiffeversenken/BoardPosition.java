package schiffeversenken;

public class BoardPosition {
    private final int xCoordinate;
    private final String yCoordinate;

    BoardPosition(int xCoordinate, String yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public String getyCoordinate() {
        return yCoordinate;
    }
}

