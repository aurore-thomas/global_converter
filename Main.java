import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // This Main class will check the validity of the command. Then, if the test are True, it goes to the Converter class
    public static void main(String[] args) {
        String to_check = args[0];
        String actual_base = args[1];
        String future_base = args[2];

        while (check_validity(to_check) == false) {
            to_check = ask_again();
        }

        if (actual_base == future_base) {
            System.out.println("Please a correct conversion");
        }

        if (check_validity(to_check)) {
            // Converter class
            Converter convert = new Converter();
            convert.ChoiceBaseWithText(to_check, actual_base, future_base);

        }
    }

    public static boolean check_validity(String to_check) {
       // We create an ArrayList with all the valid characters
        ArrayList<Character> valid_char = new ArrayList<Character>();
        String to_array="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
        int count = 0;

        for(int i=0 ; i<to_array.length() ;i++)
        {
            valid_char.add(to_array.charAt(i));
        }

        // Now the check
        for (int i=0; i< to_check.length(); i++) {
            if (!valid_char.contains(to_check.charAt(i))) {
                count ++;
            }
        }

        // Return
        if (count == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String ask_again() {
        // If the first input isn't correct
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid string : ");
        String to_check = input.nextLine();

        return to_check;
    }
}
