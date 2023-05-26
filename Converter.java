public class Converter {
    public void ChoiceBaseWithText(String to_convert, String actual_base, String future_base) {
        // This method is the case where the initial string is a text.
        System.out.println("Your actual string is : " + to_convert);
        Conversion convert = new Conversion();

        // Each time, we use the decimal conversion to convert in the other bases.
        String decimal_string = convert.Base10(to_convert);

        switch (future_base) {
            case "hexadecimal":
            case "-h":
                String hex = convert.Base16(decimal_string);
                System.out.println("In Hexadecimal : " + hex);
                break;

            case "decimal":
            case "-d":
                System.out.println("In Decimal : " +decimal_string);
                break;

            case "octal":
            case "-o":
                String oc = convert.Base8(decimal_string);
                System.out.println("In Octal : " +oc);
                break;

            case "binary":
            case "-b":
                String bi = convert.Base2(decimal_string);
                System.out.println("In Binary : " +bi);
                break;

            case "text":
            case "-t":
                ConvertToText(to_convert, actual_base, future_base);
                break;

            default:
                System.out.println("Invalid base");
                break;

        }
    }

    public void ConvertToText (String to_convert, String actual_base, String future_base) {
        BackToText text_conversion = new BackToText();
        String converted = "";
        String final_text = "";

        switch (actual_base) {
            case "hexadecimal":
            case "-h":
                converted = text_conversion.HexaToDecimal(to_convert);
                System.out.println("In Decimal : " + converted);
                final_text = text_conversion.DecimalToText(converted);
                System.out.println("Traduction : " + final_text);
                break;

            case "decimal":
            case "-d":
                final_text = text_conversion.DecimalToText(to_convert);
                System.out.println("Traduction : " + final_text);
                break;

            case "octal":
            case "-o":
                converted = text_conversion.OctalToDecimal(to_convert);
                System.out.println("In Decimal : " + converted);
                final_text = text_conversion.DecimalToText(converted);
                System.out.println("Traduction : " + final_text);
                break;

            case "binary":
            case "-b":
                converted = text_conversion.BinaryToDecimal(to_convert);
                System.out.println("In Decimal : " + converted);
                final_text = text_conversion.DecimalToText(converted);
                System.out.println("Traduction : " + final_text);
                break;

            default:
                System.out.println("Invalid base");
                break;
        }
    }
}
