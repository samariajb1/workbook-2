public class RollTheDice {
    public static void main(String[] args) {
        // create a for loop to create a dice to run 20 times
        // first make a class named dice
        Dice dice = new Dice();

        int roll1, roll2;
        int twoCounter = 0;
        int fourCounter =0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.println("Roll" + i +":"+ roll1 + "-" + roll2 + "Sum:" +sum);

            if (sum == 2) twoCounter++;
            if (sum == 4) fourCounter++;
            if (sum == 6) sixCounter++;
            if (sum == 7) sevenCounter++;
        }
        System.out.println("\nResults:");
        System.out.println("Number of times 2 was rolled: " + twoCounter);
        System.out.println("Number of times 4 was rolled: " + fourCounter);
        System.out.println("Number of times 6 was rolled: " + sixCounter);
        System.out.println("Number of times 7 was rolled: " + sevenCounter);

    }
}
