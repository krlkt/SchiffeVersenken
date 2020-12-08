package schiffeversenken;

public class Schiff{
    //Attributes of a ship
    public static int length;
    public int leben; //life of a ship = length, will be deducted by 1 each time a part of the ship got hit

    Schiff(int length){
        this.length = length;
        this.leben = length;
    }



}
