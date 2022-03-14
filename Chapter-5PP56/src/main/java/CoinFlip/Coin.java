package CoinFlip;

public class Coin {

    private final int HEADS = 0;
    private final int TAILS = 1;

    private int face;

    public Coin() {
        flip(); // Sets up the coin by flipping it in initially
    }

    public void flip() {           // Flips the coin by randomly choosing a face value
        face = (int) (Math.random() * 2);

    }
    
    public boolean isHead()
    {
    return (face==HEADS);    
    }
    
    public String toString()
    {
        String faceName;
        if (face==HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
        
        return faceName;
    }
    
}
