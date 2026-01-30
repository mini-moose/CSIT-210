public class Initials
{
    public static void main (String[] args)
{
    Integer ROW_WIDTH = 9;
    String letter = "000111000001111100011000110011000110011111110011111110011000110011000110011000110";
        for (int i = 0; i < letter.length(); i++) {
            char bit = letter.charAt(i);

            char outputChar = (bit == '0') ? '-' : 'X';
            System.out.print(outputChar);
            System.out.print(" ");

            if ((i + 1) % ROW_WIDTH == 0) {
                System.out.println();
            }
        }
    }
}