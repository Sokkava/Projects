package DefiningClasses.bank;

/**
 * Created by SVETLO on 04-Dec-17.
 */
        public class Dice {

        private static int DEFAULT_SIDE;
        private int sides;
        private int [] rollFreq;

        public int Dice() {

            this.sides = DEFAULT_SIDE;
            this.rollFreq = new int[DEFAULT_SIDE];
            return Dice();

        }

        public int getSides() {
           return sides;
    }

    public int[] getRollFreq() {
        return rollFreq;
    }
}
