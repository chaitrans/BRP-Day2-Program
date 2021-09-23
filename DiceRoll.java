public class DiceRoll {

    public static void main(String[] args) {

        int die1;   // The number on the first die.
        int die2;   // The number on the second die.
        int roll;   // The total roll (sum of the two dice).

        die1 = (int)(Math.random()*6) +1 ;
        die2 = (int)(Math.random()*6) +1 ;
        roll = die1 + die2;

        System.out.println("The first die = " + die1);
        System.out.println("The second die = " + die2);
        System.out.println("Your total roll = " + roll);
    }
}