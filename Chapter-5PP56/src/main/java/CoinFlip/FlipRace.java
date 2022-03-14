package CoinFlip;

public class FlipRace {

    // Flips 2 coins until one of them comes up heads 3 times in a row
    public static void main(String[] args) {

        final int GOAL = 3;
        int count1 = 0;
        int count2 = 0;
        int f = 0;

        Coin coin1 = new Coin(); // Creates coin1 object
        Coin coin2 = new Coin(); // creates coin2 object

        while (count1 < GOAL && count2 < GOAL) {
            coin1.flip();
            coin2.flip();
            
            System.out.println("Flip number : " + f);
            //Print the results of the coins
            System.out.println("Coin1 : " + coin1);
            System.out.println("Coin2 : " + coin2);

            //Increment or reset the counters
            count1 = (coin1.isHead()) ? count1 + 1 : 0;
            count2 = (coin2.isHead()) ? count2 + 1 : 0;
            
            f++;

        }
        // Determine the winner
        if (count1 < GOAL) {
            System.out.println("Coin2 Wins");
        } else if (count2 < GOAL) {
            System.out.println("Coin1 Wins");
        } else {
            System.out.println("It's a TIE!!");
        }

    }

}
