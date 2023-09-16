import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int count = 0;
        int sum = 0;
        String variable = "";
        for (int i = 0; i < text.length(); i++) {
            i = text.indexOf(' ', i);
            if(i == -1){break;}
            variable = text.substring(count, i);
            System.out.println(variable);
            if (Character.isDigit(variable.charAt(0))) {
                sum += Integer.parseInt(variable);
            }
            count = i < text.length() - 1 ? i + 1 : i;

        }
        System.out.println(sum);

    }

}