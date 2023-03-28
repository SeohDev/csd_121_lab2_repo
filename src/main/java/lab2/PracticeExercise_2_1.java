package lab2;

public class PracticeExercise_2_1 {

    public static void main(String[] args) {
        String mississippi = "Mississippi";
        System.out.println(mississippi);
        String mississippi2 = mississippi.replace("i", "ii");
        System.out.println(mississippi2 + " is " + mississippi2.length() + " characters long.");
        String mississippi3 = mississippi2.replace("ss", "s");
        System.out.println(mississippi3 + " is " + mississippi3.length() + " characters long.");

        // Prints Mississippi, then the replaced versions of it.
    }
}
