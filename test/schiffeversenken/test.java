package schiffeversenken;

import org.junit.Assert;
import org.junit.Test;

public class test {
    public static final String alice = "ALICE";
    public static final String bob = "BOB";
    public static final String clara = "CLARA";
    public SchiffSet schiffSet = new SchiffSet();
    public SchiffSet schiffSet2 = new SchiffSet();

    private SchiffeVersenken getSchiffeVersenken() {
        return new SchiffeVersenkenImpl();
    }


    @Test
    public void goodSet1() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        BoardPosition position = new BoardPosition(1, "A");
        sv.set(alice, schiffSet.getFuenfer1(), "rechts", position);
        position = new BoardPosition(3, "B");
        sv.set(alice, schiffSet.getVierer1(), "rechts", position);
        position = new BoardPosition(3, "C");
        sv.set(alice, schiffSet.getVierer2(), "rechts", position);
        position = new BoardPosition(3, "D");
        sv.set(alice, schiffSet.getDreier1(), "links", position);
        position = new BoardPosition(3, "E");
        sv.set(alice, schiffSet.getDreier2(), "rechts", position);
        position = new BoardPosition(3, "F");
        sv.set(alice, schiffSet.getDreier3(), "rechts", position);
        position = new BoardPosition(7, "G");
        sv.set(alice, schiffSet.getZweier1(), "unten", position);
        position = new BoardPosition(8, "G");
        sv.set(alice, schiffSet.getZweier2(), "unten", position);
        position = new BoardPosition(9, "H");
        sv.set(alice, schiffSet.getZweier3(), "unten", position);
        position = new BoardPosition(10, "H");
        sv.set(alice, schiffSet.getZweier4(), "unten", position);

        Assert.assertTrue(sv.allSet(alice));
    }


    @Test
    public void goodSet2() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        BoardPosition position = new BoardPosition(1, "A");
        sv.set(alice, schiffSet.getFuenfer1(), "rechts", position);
        position = new BoardPosition(1, "B");
        sv.set(alice, schiffSet.getVierer1(), "rechts", position);
        position = new BoardPosition(1, "C");
        sv.set(alice, schiffSet.getVierer2(), "rechts", position);
        position = new BoardPosition(1, "D");
        sv.set(alice, schiffSet.getDreier1(), "rechts", position);
        position = new BoardPosition(1, "E");
        sv.set(alice, schiffSet.getDreier2(), "rechts", position);
        position = new BoardPosition(1, "F");
        sv.set(alice, schiffSet.getDreier3(), "rechts", position);
        position = new BoardPosition(1, "G");
        sv.set(alice, schiffSet.getZweier1(), "rechts", position);
        position = new BoardPosition(1, "H");
        sv.set(alice, schiffSet.getZweier2(), "rechts", position);
        position = new BoardPosition(1, "I");
        sv.set(alice, schiffSet.getZweier3(), "rechts", position);
        position = new BoardPosition(1, "J");
        sv.set(alice, schiffSet.getZweier4(), "rechts", position);

        position = new BoardPosition(1, "A");
        sv.set(bob, schiffSet2.getFuenfer1(), "rechts", position);
        position = new BoardPosition(1, "B");
        sv.set(bob, schiffSet2.getVierer1(), "rechts", position);
        position = new BoardPosition(1, "C");
        sv.set(bob, schiffSet2.getVierer2(), "rechts", position);
        position = new BoardPosition(1, "D");
        sv.set(bob, schiffSet2.getDreier1(), "rechts", position);
        position = new BoardPosition(1, "E");
        sv.set(bob, schiffSet2.getDreier2(), "rechts", position);
        position = new BoardPosition(1, "F");
        sv.set(bob, schiffSet2.getDreier3(), "rechts", position);
        position = new BoardPosition(1, "G");
        sv.set(bob, schiffSet2.getZweier1(), "rechts", position);
        position = new BoardPosition(1, "H");
        sv.set(bob, schiffSet2.getZweier2(), "rechts", position);
        position = new BoardPosition(1, "I");
        sv.set(bob, schiffSet2.getZweier3(), "rechts", position);
        position = new BoardPosition(1, "J");
        sv.set(bob, schiffSet2.getZweier4(), "rechts", position);

        Assert.assertTrue(sv.allSet(alice));
        Assert.assertTrue(sv.allSet(bob));
    }


    @Test
    public void goodMarginSet2() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        BoardPosition position = new BoardPosition(1, "A");
        sv.set(alice, schiffSet.getFuenfer1(), "rechts", position);
        position = new BoardPosition(6, "A");
        sv.set(alice, schiffSet.getVierer1(), "rechts", position);
        position = new BoardPosition(1, "B");
        sv.set(alice, schiffSet.getVierer2(), "unten", position);
        position = new BoardPosition(1, "F");
        sv.set(alice, schiffSet.getDreier1(), "unten", position);
        position = new BoardPosition(1, "J");
        sv.set(alice, schiffSet.getDreier2(), "rechts", position);
        position = new BoardPosition(4, "J");
        sv.set(alice, schiffSet.getDreier3(), "rechts", position);
        position = new BoardPosition(7, "J");
        sv.set(alice, schiffSet.getZweier1(), "rechts", position);
        position = new BoardPosition(9, "J");
        sv.set(alice, schiffSet.getZweier2(), "rechts", position);
        position = new BoardPosition(10, "I");
        sv.set(alice, schiffSet.getZweier3(), "oben", position);
        position = new BoardPosition(10, "C");
        sv.set(alice, schiffSet.getZweier4(), "unten", position);

        position = new BoardPosition(1, "A");
        sv.set(bob, schiffSet2.getFuenfer1(), "rechts", position);
        position = new BoardPosition(6, "A");
        sv.set(bob, schiffSet2.getVierer1(), "rechts", position);
        position = new BoardPosition(1, "B");
        sv.set(bob, schiffSet2.getVierer2(), "unten", position);
        position = new BoardPosition(1, "F");
        sv.set(bob, schiffSet2.getDreier1(), "unten", position);
        position = new BoardPosition(1, "J");
        sv.set(bob, schiffSet2.getDreier2(), "rechts", position);
        position = new BoardPosition(4, "J");
        sv.set(bob, schiffSet2.getDreier3(), "rechts", position);
        position = new BoardPosition(7, "J");
        sv.set(bob, schiffSet2.getZweier1(), "rechts", position);
        position = new BoardPosition(9, "J");
        sv.set(bob, schiffSet2.getZweier2(), "rechts", position);
        position = new BoardPosition(10, "I");
        sv.set(bob, schiffSet2.getZweier3(), "oben", position);
        position = new BoardPosition(10, "C");
        sv.set(bob, schiffSet2.getZweier4(), "unten", position);

        Assert.assertTrue(sv.allSet(alice));
        Assert.assertTrue(sv.allSet(bob));
    }

    @Test(expected = GameException.class)
    public void failure3Players() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();
        BoardPosition position = new BoardPosition(1, "A");
        sv.set(alice, schiffSet.getFuenfer1(), "rechts", position);
        position = new BoardPosition(1, "A");
        sv.set(bob, schiffSet2.getFuenfer1(), "rechts", position);
        position = new BoardPosition(1, "A");
        sv.set(clara, schiffSet.getFuenfer1(), "rechts", position);
    }

    @Test
    public void notDoneSet1() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        BoardPosition position = new BoardPosition(1, "A");
        sv.set(alice, schiffSet.getFuenfer1(), "rechts", position);
        position = new BoardPosition(6, "A");
        sv.set(alice, schiffSet.getVierer1(), "rechts", position);
        position = new BoardPosition(1, "B");
        sv.set(alice, schiffSet.getVierer2(), "unten", position);
        position = new BoardPosition(1, "F");
        sv.set(alice, schiffSet.getDreier1(), "unten", position);
        position = new BoardPosition(1, "J");
        sv.set(alice, schiffSet.getDreier2(), "rechts", position);
        position = new BoardPosition(4, "J");
        sv.set(alice, schiffSet.getDreier3(), "rechts", position);
        //Zweier alice fehlt
        position = new BoardPosition(9, "J");
        sv.set(alice, schiffSet.getZweier1(), "rechts", position);
        position = new BoardPosition(10, "I");
        sv.set(alice, schiffSet.getZweier2(), "oben", position);
        position = new BoardPosition(10, "C");
        sv.set(alice, schiffSet.getZweier3(), "unten", position);

        position = new BoardPosition(1, "A");
        sv.set(bob, schiffSet2.getFuenfer1(), "rechts", position);
        position = new BoardPosition(6, "A");
        sv.set(bob, schiffSet2.getVierer1(), "rechts", position);
        position = new BoardPosition(1, "B");
        sv.set(bob, schiffSet2.getVierer2(), "unten", position);
        position = new BoardPosition(1, "F");
        sv.set(bob, schiffSet2.getDreier1(), "unten", position);
        position = new BoardPosition(1, "J");
        sv.set(bob, schiffSet2.getDreier2(), "rechts", position);
        position = new BoardPosition(4, "J");
        sv.set(bob, schiffSet2.getDreier3(), "rechts", position);
        position = new BoardPosition(7, "J");
        sv.set(bob, schiffSet2.getZweier1(), "rechts", position);
        position = new BoardPosition(9, "J");
        sv.set(bob, schiffSet2.getZweier2(), "rechts", position);
        position = new BoardPosition(10, "I");
        sv.set(bob, schiffSet2.getZweier3(), "oben", position);
        //Zweier bob fehlt

        Assert.assertFalse(sv.allSet(alice));
        Assert.assertFalse(sv.allSet(bob));
    }

    @Test
    public void notDoneSet2() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        BoardPosition position = new BoardPosition(1, "A");
        sv.set(alice, schiffSet.getFuenfer1(), "rechts", position);
        //Viere alice fehlt
        position = new BoardPosition(1, "B");
        sv.set(alice, schiffSet.getVierer1(), "unten", position);
        //Dreier alice fehlt
        position = new BoardPosition(1, "J");
        sv.set(alice, schiffSet.getDreier1(), "rechts", position);
        position = new BoardPosition(4, "J");
        sv.set(alice, schiffSet.getDreier2(), "rechts", position);
        position = new BoardPosition(7, "J");
        sv.set(alice, schiffSet.getZweier1(), "rechts", position);
        position = new BoardPosition(9, "J");
        sv.set(alice, schiffSet.getZweier2(), "rechts", position);
        position = new BoardPosition(10, "I");
        sv.set(alice, schiffSet.getZweier3(), "oben", position);
        position = new BoardPosition(10, "C");
        sv.set(alice, schiffSet.getZweier4(), "unten", position);

        //Fuenfer bob fehlt
        position = new BoardPosition(6, "A");
        sv.set(bob, schiffSet2.getVierer1(), "rechts", position);
        position = new BoardPosition(1, "B");
        sv.set(bob, schiffSet2.getVierer2(), "unten", position);
        position = new BoardPosition(1, "F");
        sv.set(bob, schiffSet2.getDreier1(), "unten", position);
        position = new BoardPosition(1, "J");
        sv.set(bob, schiffSet2.getDreier2(), "rechts", position);
        position = new BoardPosition(4, "J");
        sv.set(bob, schiffSet2.getDreier3(), "rechts", position);
        position = new BoardPosition(7, "J");
        sv.set(bob, schiffSet2.getZweier1(), "rechts", position);
        position = new BoardPosition(9, "J");
        sv.set(bob, schiffSet2.getZweier2(), "rechts", position);
        //Zweier bob fehlt
        position = new BoardPosition(10, "C");
        sv.set(bob, schiffSet2.getZweier4(), "unten", position);

        Assert.assertFalse(sv.allSet(alice));
        Assert.assertFalse(sv.allSet(bob));
    }

    @Test(expected = GameException.class)
    public void OutsideMarginSet1() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        BoardPosition position = new BoardPosition(6, "A");
        sv.set(alice, schiffSet.getFuenfer1(), "rechts", position);
    }

    @Test(expected = GameException.class)
    public void OutsideMarginSet2() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        BoardPosition position = new BoardPosition(6, "I");
        sv.set(alice, schiffSet.getFuenfer1(), "unten", position);
    }

    @Test(expected = GameException.class)
    public void OutsideMarginSet3() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        BoardPosition position = new BoardPosition(1, "D");
        sv.set(alice, schiffSet.getZweier1(), "links", position);
    }

    @Test(expected = GameException.class)
    public void OutsideMarginSet4() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        BoardPosition position = new BoardPosition(9, "C");
        sv.set(alice, schiffSet.getVierer1(), "oben", position);
    }

    @Test(expected = GameException.class)
    public void onTopSet1() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        BoardPosition position = new BoardPosition(1, "A");
        sv.set(alice, schiffSet.getVierer1(), "rechts", position);
        position = new BoardPosition(3, "A");
        sv.set(alice, schiffSet.getVierer2(), "rechts", position);
    }

    @Test(expected = GameException.class)
    public void onTopSet2() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        BoardPosition position = new BoardPosition(1, "A");
        sv.set(alice, schiffSet.getVierer1(), "rechts", position);
        position = new BoardPosition(3, "J");
        sv.set(alice, schiffSet.getVierer2(), "oben", position);
        position = new BoardPosition(1, "I");
        sv.set(alice, schiffSet.getFuenfer1(), "rechts", position);
    }


    //Used for tests only -- Set ships on the margin of board
    public void normalSet(SchiffeVersenken sv, String userName, SchiffSet schiffSet) throws GameException, StatusException {
        BoardPosition position = new BoardPosition(1, "A");
        sv.set(userName, schiffSet.getFuenfer1(), "rechts", position);
        position = new BoardPosition(1, "B");
        sv.set(userName, schiffSet.getVierer1(), "rechts", position);
        position = new BoardPosition(1, "C");
        sv.set(userName, schiffSet.getVierer2(), "rechts", position);
        position = new BoardPosition(1, "D");
        sv.set(userName, schiffSet.getDreier1(), "rechts", position);
        position = new BoardPosition(1, "E");
        sv.set(userName, schiffSet.getDreier2(), "rechts", position);
        position = new BoardPosition(1, "F");
        sv.set(userName, schiffSet.getDreier3(), "rechts", position);
        position = new BoardPosition(1, "G");
        sv.set(userName, schiffSet.getZweier1(), "rechts", position);
        position = new BoardPosition(1, "H");
        sv.set(userName, schiffSet.getZweier2(), "rechts", position);
        position = new BoardPosition(1, "I");
        sv.set(userName, schiffSet.getZweier3(), "rechts", position);
        position = new BoardPosition(1, "J");
        sv.set(userName, schiffSet.getZweier4(), "rechts", position);
    }

    @Test
    public void goodCompleteGame1() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        this.normalSet(sv, alice, schiffSet);
        this.normalSet(sv,bob, schiffSet2);
        Assert.assertTrue(sv.allSet(alice));
        Assert.assertTrue(sv.allSet(bob));

        BoardPosition position = new BoardPosition(1, "A");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(2, "A");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(3, "A");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(4, "A");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(5, "A");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(1, "B");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(2, "B");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(3, "B");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(4, "B");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(1, "C");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(2, "C");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(3, "C");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(4, "C");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(1, "D");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(2, "D");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(3, "D");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(1, "E");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(2, "E");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(3, "E");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(1, "F");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(2, "F");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(3, "F");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(1, "G");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(2, "G");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(1, "H");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(2, "H");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(1, "I");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(2, "I");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(1, "J");
        Assert.assertFalse(sv.shoot(alice, position));
        position = new BoardPosition(2, "J");
        Assert.assertTrue(sv.shoot(alice, position));
    }

    @Test(expected = GameException.class)
    public void shootOutside1() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        this.normalSet(sv, alice, schiffSet);
        this.normalSet(sv, bob, schiffSet2);

        BoardPosition position = new BoardPosition(11, "A");
        sv.shoot(alice, position);
    }

    @Test(expected = GameException.class)
    public void shootOutside2() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        this.normalSet(sv, alice, schiffSet);
        this.normalSet(sv, bob, schiffSet2);

        BoardPosition position = new BoardPosition(4, "K");
        sv.shoot(alice, position);
    }

    @Test(expected = StatusException.class)
    public void failureStatus1() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        this.normalSet(sv, alice, schiffSet);
        BoardPosition position = new BoardPosition(4, "K");
        sv.shoot(alice, position);
    }

    @Test(expected = StatusException.class)
    public void failureStatus2() throws GameException, StatusException {
        SchiffeVersenken sv = this.getSchiffeVersenken();

        this.normalSet(sv, alice, schiffSet);
        this.normalSet(sv, bob, schiffSet2);

        BoardPosition position = new BoardPosition(4, "K");
        sv.shoot(alice, position);

        position = new BoardPosition(1, "B");
        sv.set(alice, schiffSet.getVierer1(), "rechts", position);
    }






}
