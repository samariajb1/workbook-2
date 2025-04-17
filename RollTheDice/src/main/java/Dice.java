public class Dice {
   public int roll() {
       int maxValue = 0;
       int minValue = 6;
       int randomNumber = (int)(Math.random() * maxValue) + minValue;
       return randomNumber;


    }
}
