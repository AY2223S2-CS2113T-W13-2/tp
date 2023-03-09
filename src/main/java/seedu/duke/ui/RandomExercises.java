package seedu.duke.ui;

public class RandomExercises {
    private static final String MARGIN = "*-----------------------------------------------------------------*";

    public static void generateNumber() {
        System.out.println(MARGIN);
        System.out.println("Ok! Duke will randomly select some exercises for you!");
        System.out.println("Specify the number of exercises you would like to do:");
        System.out.println("Enter: 'generate x' to continue! (where x is a positive integer)");
        System.out.println(MARGIN);
    }
}
