/**
 * Created by lotrik on 10.01.17.
 */
public class Main {

    static int number = 5;
    static int i = 2;
    static int result = 1;

    public static void main(String[] args) {

        intToString();
        removeSymbol();
        factorialis(number);

    }

    static void intToString() {

        String string = "-01001";
        int str = 0;

        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (Character.isDigit(chars[i])) {

                str = str * 10 + Character.digit(chars[i], 10);
            }
        }

        if (chars[0] == '-') {

            str = str * (-1);

        }

        System.out.println("Int of string " + string + " = " + str);
        System.out.println();

    }

    static void removeSymbol() {

        String string = "Java is a general-purpose computer programming language";
        char character = 'p';

        System.out.println("Remove character \'" + character + "\'" + " from string \"" + string + "\"");

        string = string.replace(Character.toString(character), "");

        System.out.println("Result: \"" + string + "\"");
        System.out.println();

    }

    static void factorialis(int number) {

        if (i <= number) {
            result *= i;
            i++;
            factorialis(number);
        } else {

            System.out.println("Factorial of number " + number + " is " + result);
            System.out.println();
        }

    }
}
