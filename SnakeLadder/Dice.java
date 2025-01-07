public class Dice {
    private int numberOfDice;

    Dice(int quantity){
        this.numberOfDice=quantity;
    }

    public int getRoll(){
        // return (int)Math.random()*(6*numberOfDice-1*numberOfDice)+1;
        return (int)(Math.random() * (6 * numberOfDice - numberOfDice + 1)) + numberOfDice;
    }

}
