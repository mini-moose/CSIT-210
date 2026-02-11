import java.util.LinkedHashMap;
import java.util.Map;

public class Initials
{
    public static void main (String[] args)
{
    Integer ROW_WIDTH = 9;
    LinkedHashMap<String, String> letters = new LinkedHashMap<>();
    letters.put("J","111111111111111111000011100000011100000011100000011100110011100111111000011100000");
    letters.put("T","111111111111111111000111000000111000000111000000111000000111000000111000000111000");
    letters.put("W","110000011110000011110010011110111011111111111011111110011111110011101110011000110");
    for (Map.Entry<String, String> entry : letters.entrySet()) {
        String letter = entry.getValue();
        char letterChar = entry.getKey().charAt(0);
        
        for (int i = 0; i < letter.length(); i++) {
            char bit = letter.charAt(i);

            char outputChar = (bit == '0') ? '-' : letterChar;
            System.out.print(outputChar);
            System.out.print(" ");

            if ((i + 1) % ROW_WIDTH == 0) {
                System.out.println();
            }
        }
    }
    }
}