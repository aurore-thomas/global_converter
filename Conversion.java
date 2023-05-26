
import java.util.Arrays;

public class Conversion {
    String upper_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower_alphabet = "abcdefghijklmnopqrstuvwxyz";
    String digit = "0123456789";

    public char[] ChangeToList (String to_convert) {
        char[] new_array = to_convert.toCharArray();
        return new_array;
    }

    public String Base2(String to_convert) {

        String[] array = null;
        array = to_convert.split(" "); // Convert the string into an array

        int index;
        char to_reverse;
        String reverse_string = "";
        String final_string = "";

        for (int i=0; i<array.length; i++) {
            index = Integer.parseInt(array[i]);
            reverse_string = "";

            int remainder = 0;
            String binary_value = "";

            while (index != 0) {
                remainder = index % 2;
                binary_value += remainder;
                index = index / 2;
            }

            if (binary_value.length()<7) {
                binary_value += "0";
            }

            // Reverse
            for (int j = 0; j<binary_value.length(); j++) {
                to_reverse = binary_value.charAt(j);
                reverse_string = to_reverse + reverse_string;
            }

            final_string += reverse_string;
            final_string += " ";

        }

        return final_string;
    }

    public String Base8(String to_convert) {
        String[] array = null;
        array = to_convert.split(" "); // Convert the string into an array

        int index;
        char to_reverse;
        String reverse_string = "";
        String final_string = "";

        for (int i=0; i<array.length; i++) {
            index = Integer.parseInt(array[i]);
            reverse_string = "";

            int remainder = 0;
            String octal_value = "";

            while (index != 0) {
                remainder = index % 8;
                octal_value += remainder;
                index = index / 8;
            }

            if (octal_value.length()<3) {
                octal_value += "0";
            }

            // Reverse
            for (int j = 0; j<octal_value.length(); j++) {
                to_reverse = octal_value.charAt(j);
                reverse_string = to_reverse + reverse_string;
            }

            final_string += reverse_string;
            final_string += " ";
        }

        return final_string;
    }

    public String Base10(String to_convert) {
        String decimal_conversion = "";
        int position = 0;

        Boolean test_digit, test_upper, test_lower, test_whitespace;

        String[] array = null;
        array = to_convert.split("");

        for (int i = 0; i < to_convert.length(); i++) {
            test_digit = Character.isDigit(to_convert.charAt(i));
            test_upper = Character.isUpperCase(to_convert.charAt(i));
            test_lower = Character.isLowerCase(to_convert.charAt(i));
            test_whitespace = Character.isWhitespace(to_convert.charAt(i));

            if (test_digit) {
                position = digit.indexOf(array[i]);
                position += 48;
            } else if (test_upper) {
                position = upper_alphabet.indexOf(array[i]);
                position += 65;
            } else if (test_lower) {
                position = lower_alphabet.indexOf(array[i]);
                position += 97;
            } else if (test_whitespace) {
                position = 32;
            }

            String string_position = Integer.toString(position);
            decimal_conversion += string_position;
            decimal_conversion += " ";

        }
        return decimal_conversion;
    }

    public String Base16(String to_convert) {
        String hexadecimal = "";
        String[] array = null;
        array = to_convert.split(" "); // Convert the string into an array

        int index;
        char to_reverse;
        String reverse_string = "";
        String final_string = "";

        for (int i=0; i<array.length; i++) {
            index = Integer.parseInt(array[i]);
            reverse_string = "";

            int remainder = 0;
            String hexadecimal_value = "";

            while (index != 0) {
                remainder = index % 16;
                
                if (remainder >=10) {
                    String hexadecimal_alphabet = "ABCDEF";
                    remainder -= 10;
                    char remainder_letter = hexadecimal_alphabet.charAt(remainder);
                    hexadecimal_value += remainder_letter;
                }
                else {
                    hexadecimal_value += remainder;
                }
                index = index / 16;
            }

            // Reverse
            for (int j = 0; j<hexadecimal_value.length(); j++) {
                to_reverse = hexadecimal_value.charAt(j);
                reverse_string = to_reverse + reverse_string;
            }

            final_string += reverse_string;
            final_string += " ";
        }

        return final_string;
    }
}
