import java.lang.Math;

public class BackToText {

    public static String BinaryToDecimal(String binary_string) {
        // We convert the string into an array :
        String[] string_array = binary_string.split(" ");
        String dec_value = "";
        int individual_value = 0;

        for (int i = 0; i < string_array.length; i++) {
            for (int j = string_array.length; j >= 0; j--) {
                if (string_array[i].charAt(j) == '1') {
                    individual_value += Math.pow(2, j);
                }
            }

            dec_value += individual_value;
            dec_value += " ";

            // We reset the additional value
            individual_value = 0;
        }
        return dec_value;
    }

    public static String OctalToDecimal(String binary_string) {
        // We convert the string into an array :
        String[] string_array = binary_string.split(" ");
        String oc_value = "";
        int individual_value = 0;
        System.out.println(string_array.length);

        for (int i = 0; i < string_array.length; i++) {
            for (int j = string_array.length; j >= 0; j--) {
                int index = Integer.valueOf(string_array[i].charAt(j));
                individual_value += index * Math.pow(8, j);
            }
        }

        oc_value += individual_value;
        oc_value += " ";
        return oc_value;
    }


    public static String HexaToDecimal(String binary_string) {
        //String[][] conversion = {{"A", "10"}, {"B", "11"}, {"C", "12"}, {"D", "13"}, {"E", "14"}, {"F", "15"}};
        // We convert the string into an array :
        String[] string_array = binary_string.split(" ");
        String hexa_letter = "ABCDEF";
        String hex_value = "";
        double individual_value = 0;
        int index = 0;

        for (int i = 0; i < string_array.length; i++) {
            for (int j = string_array.length; j >= 0; j--) {
                Boolean test_letter = Character.isUpperCase(string_array[i].charAt(j));

                if (test_letter) {
                    index = hexa_letter.indexOf(string_array[i].charAt(j)) + 10;
                } else {
                    index = Integer.valueOf(string_array[i].charAt(j));
                }

                individual_value = index * Math.pow(16, j);
            }
        }

        hex_value += individual_value;
        hex_value += " ";
        return hex_value;
    }

    public String DecimalToText(String to_convert) {
        // We do the same things, but in the opposite way

        String upper_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower_alphabet = "abcdefghijklmnopqrstuvwxyz";
        String digit = "0123456789";

        String text_conversion = "";
        char temp_value = 0;

        String[] string_array = to_convert.split(" ");

        for (int i = 0; i < string_array.length; i++) {
            int value = Integer.valueOf(string_array[i]);

            if (value >= 48 && value <= 57) {
                temp_value = digit.charAt(value - 48);
            }
            else if (value >= 65 && value <= 90) {
                temp_value = upper_alphabet.charAt(value - 65);
            }
            else if (value >= 97 && value <= 122) {
                temp_value = lower_alphabet.charAt(value - 97);
            } else if (value == 32) {
                temp_value = ' ';
            }

            text_conversion += temp_value;

        }
        return text_conversion;
    }
}
